package terminal.commands;

import terminal.managers.FileManager;

public class MkdirCommand implements Command {
	
	private FileManager fileManager;
	
	public MkdirCommand(FileManager fileManager) {
		this.fileManager = fileManager;
	}
	
	@Override
	public boolean execute(String args) {
		fileManager.createNewDirectory(args);
		return true;
	}
	
}