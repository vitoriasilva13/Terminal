package terminal.commands;

import terminal.managers.DirectoryManager;

public class LsCommand implements Command {

	private DirectoryManager dir;
	
	public LsCommand(DirectoryManager dir) {
		this.dir = dir;
	}
	
	@Override
	public boolean execute(String args) {
		dir.showDirectories();
		return true;
	}

}
