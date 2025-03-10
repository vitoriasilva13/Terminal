package terminal.commands;

import terminal.managers.FileManager;

public class RmCommand implements Command {
	
	private FileManager fileManager;
	
	public RmCommand(FileManager fileManager) {
		this.fileManager = fileManager;
	}
	
	@Override
	public boolean execute(String args) {
		fileManager.deleteDirectory(args);
		return true;
	}
}