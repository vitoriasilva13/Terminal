package terminal.commands;

import java.io.File;

import terminal.managers.DirectoryManager;

public class RmCommand implements Command {


	private DirectoryManager dir;
	
	public RmCommand(DirectoryManager dir) {
		this.dir = dir;
	}
	
	@Override
	public boolean execute(String args) {
		try {
			File file = new File(this.dir.getCurrentDirectory(),args);
			
			if(file.delete()) {
				System.out.println(file.getName() + " apagado.");
			}else {
				System.out.println("Falha ao apagar.");
			}
		}catch (SecurityException e) {
            System.out.println("Ocorreu um erro de permissão.");
        }
		return true;
	}
}
