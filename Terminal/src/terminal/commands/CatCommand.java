package terminal.commands;

import terminal.managers.FileManager;

public class CatCommand implements Command {
	
	private FileManager fil;
	
	public CatCommand(FileManager fil) {
		this.fil = fil;
	}
	@Override
	public boolean execute(String args) {
		fil.printFileContent(args);
		return true;
	}

}
