package terminal.commands;

import terminal.managers.DirectoryManager;

public class CdCommand implements Command {
	
	private DirectoryManager directoryManager;
	
	public CdCommand(DirectoryManager directoryManager) {
		this.directoryManager = directoryManager;
	}

	@Override
	public boolean execute(String args) {
		directoryManager.changeDirectory(args);
		return true;
	}

}
