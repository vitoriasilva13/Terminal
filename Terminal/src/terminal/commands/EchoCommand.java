package terminal.commands;

import terminal.managers.FileManager;

public class EchoCommand implements Command {

private FileManager fil;
	
	public EchoCommand(FileManager fil) {
		this.fil = fil;
	}
	
	@Override
	public boolean execute(String args) {
		fil.echoToFile(args);
		return true;
	}

}
