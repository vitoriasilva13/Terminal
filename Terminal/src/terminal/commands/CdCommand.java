package terminal.commands;

import terminal.managers.DirectoryManager;

public class CdCommand implements Command {
	
	private DirectoryManager dir;
	
	public CdCommand(DirectoryManager dir) {
		this.dir = dir;
	}

	@Override
	public boolean execute(String args) {
		dir.changeDirectory(args);
		return true;
	}

}
