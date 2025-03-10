package terminal.commands;

import terminal.managers.FileManager;

public class TouchCommand implements Command {

	private FileManager fileManager;
	
	public TouchCommand(FileManager fileManager) {
		this.fileManager = fileManager;
	}
	
	@Override
	public boolean execute(String args) {
		fileManager.createNewFile(args);
		return true;
	}

}
