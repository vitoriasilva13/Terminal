package terminal.commands;

import terminal.managers.DirectoryManager;

public class PwdCommand implements Command {
	
	private DirectoryManager directoryManager;

	public PwdCommand(DirectoryManager directoryManager) {
		this.directoryManager = directoryManager;
	}

	@Override
	public boolean execute(String args) {
		System.out.println(directoryManager.getCurrentDirectory());
		return true;
	}
}
