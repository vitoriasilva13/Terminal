package terminal.commands;

import java.io.File;

import terminal.managers.DirectoryManager;

public class MkdirCommand implements Command {
	
	private DirectoryManager dir;
	
	public MkdirCommand(DirectoryManager dir) {
		this.dir = dir;
	}
	
	@Override
	public boolean execute(String args) {
		try {
			File file = new File(this.dir.getCurrentDirectory(),args);
			
			if(file.mkdirs()) {
				System.out.println("Diretório criado: " + args);
			}else {
				System.out.println("O diretório já existe.");
			}
		}catch (SecurityException e) {
            System.out.println("Ocorreu um erro de permissão.");
        }
		return true;
	}
	
}
