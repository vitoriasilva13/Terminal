package terminal;

import java.util.HashMap;
import java.util.Map;

import terminal.commands.CatCommand;
import terminal.commands.CdCommand;
import terminal.commands.Command;
import terminal.commands.EchoCommand;
import terminal.commands.ExitCommand;
import terminal.commands.HelpCommand;
import terminal.commands.HistoryCommand;
import terminal.commands.LsCommand;
import terminal.commands.MkdirCommand;
import terminal.commands.PwdCommand;
import terminal.commands.RmCommand;
import terminal.commands.TouchCommand;
import terminal.managers.DirectoryManager;
import terminal.managers.HistoryManager;

public class CommandHandler {
	
	private Map<String, Command> commandsMap;
	private DirectoryManager dir;
	
	public CommandHandler() {
		dir = new DirectoryManager();
		commandsMap = new HashMap<>();
		
		commandsMap.put("pwd", new PwdCommand(dir));
		commandsMap.put("ls", new LsCommand(dir));
		commandsMap.put("cd", new CdCommand(dir));
		commandsMap.put("mkdir", new MkdirCommand(dir));
		commandsMap.put("touch", new TouchCommand(dir));
		commandsMap.put("rm", new RmCommand());
		commandsMap.put("cat", new CatCommand());
		commandsMap.put("echo", new EchoCommand());
		commandsMap.put("history", new HistoryCommand());
		commandsMap.put("help", new HelpCommand());
		commandsMap.put("exit", new ExitCommand());
	}

	public boolean execute(String input) {
        String[] parts = input.split(" ", 2); //@TODO checar depois por conta dos comandos com mais de um parâmetro
        Command command = commandsMap.get(parts[0]);

        if (command != null) {
        	HistoryManager.save(input);
            return command.execute(parts.length > 1 ? parts[1] : "");
        } else {
            System.out.println("\u001B[91mComando não reconhecido.");
            return true;
        }
    }
	
	public DirectoryManager getDir() {
		return dir;
	}
}
