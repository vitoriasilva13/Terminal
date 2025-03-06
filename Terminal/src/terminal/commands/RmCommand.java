package terminal.commands;

import terminal.managers.FileManager;

public class RmCommand implements Command {
	
	private FileManager fil;
	
	public RmCommand(FileManager fil) {
		this.fil = fil;
	}
	
	@Override
	public boolean execute(String args) {
		fil.deleteDirectory(args);
		return true;
	}
}