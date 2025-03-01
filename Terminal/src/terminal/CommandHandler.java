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
import terminal.managers.HistoryManager;

public class CommandHandler {
	
	private Map<String, Command> commandsMap = new HashMap<>();
	
	public CommandHandler() {
		 commandsMap.put("pwd", new PwdCommand());
	     commandsMap.put("ls", new LsCommand());
	     commandsMap.put("cd", new CdCommand());
	     commandsMap.put("mkdir", new MkdirCommand());
	     commandsMap.put("touch", new TouchCommand());
	     commandsMap.put("rm", new RmCommand());
	     commandsMap.put("cat", new CatCommand());
	     commandsMap.put("echo", new EchoCommand());
	     commandsMap.put("history", new HistoryCommand());
	     commandsMap.put("help", new HelpCommand());
	     commandsMap.put("exit", new ExitCommand());
	}
	
	public boolean execute(String input) {
        HistoryManager.save(input);
        String[] parts = input.split(" ", 2); //@TODO checar depois por conta dos comandos com mais de um parâmetro
        Command command = commandsMap.get(parts[0]);

        if (command != null) {
            return command.execute(parts.length > 1 ? parts[1] : "");
        } else {
            System.out.println("Comando não reconhecido.");
            return true;
        }
    }
}
