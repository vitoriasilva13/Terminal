package terminal.commands;

import java.io.File;

import terminal.managers.DirectoryManager;

public class RmCommand implements Command {


	private DirectoryManager dir;
	
	public RmCommand(DirectoryManager dir) {
		this.dir = dir;
	}
	
	public boolean delete(File file) {
		try {
			if(file.isFile()) {
				file.delete();
			}if(file.isDirectory() && file.list().length == 0) {
				file.delete();
			}else {
				for(String childPath : file.list()) {
					File childFile = new File(file.getAbsolutePath(), childPath);
					this.delete(childFile);
				}
				file.delete();
			}
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}
	
	@Override
	public boolean execute(String args) {
		try {
			File file = new File(this.dir.getCurrentDirectory(), args);
			if(this.delete(file)) {
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
