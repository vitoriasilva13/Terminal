package terminal.commands;

import terminal.managers.DirectoryManager;

public class PwdCommand implements Command {
	
	private DirectoryManager dir;

	public PwdCommand(DirectoryManager dir) {
		this.dir = dir;
	}

	@Override
	public boolean execute(String args) {
		System.out.println(dir.getCurrentDirectory());
		return true;
	}
}
