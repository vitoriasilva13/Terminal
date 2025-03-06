package terminal.commands;

import terminal.managers.FileManager;

public class MkdirCommand implements Command {
	
	private FileManager fil;
	
	public MkdirCommand(FileManager fil) {
		this.fil = fil;
	}
	
	@Override
	public boolean execute(String args) {
		fil.createNewDirectory(args);
		return true;
	}
	
}