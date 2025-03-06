package terminal.commands;

import terminal.managers.FileManager;

public class TouchCommand implements Command {

	private FileManager fil;
	
	public TouchCommand(FileManager fil) {
		this.fil = fil;
	}
	
	@Override
	public boolean execute(String args) {
		fil.createNewFile(args);
		return true;
	}

}
