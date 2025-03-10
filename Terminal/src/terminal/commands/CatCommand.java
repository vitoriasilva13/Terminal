package terminal.commands;

import terminal.managers.FileManager;

public class CatCommand implements Command {
	
	private FileManager fileManager;
	
	public CatCommand(FileManager fileManager) {
		this.fileManager = fileManager;
	}
	
	@Override
	public boolean execute(String args) {
		fileManager.printFileContent(args);
		return true;
	}

}
