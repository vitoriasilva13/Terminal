package terminal.commands;

import terminal.managers.DirectoryManager;

public class LsCommand implements Command {

	private DirectoryManager directoryManager;
	
	public LsCommand(DirectoryManager directoryManager) {
		this.directoryManager = directoryManager;
	}
	
	@Override
	public boolean execute(String args) {
		directoryManager.showDirectories();
		return true;
	}

}
