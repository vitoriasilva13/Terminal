package terminal.managers;

import java.io.File;

public class DirectoryManager {
	private File currentDirectory;
	private String currentDirectorySimplified;
	
	public DirectoryManager() {
		this.currentDirectory = new File("C:\\");
		this.currentDirectorySimplified = "~/" + currentDirectory.getName();
	}
	
	public void setCurrentDirectory(File currentDirectory) {
		this.currentDirectory = currentDirectory;
		this.currentDirectorySimplified = "~/" + currentDirectory.getName();
	}
	
	public File getCurrentDirectory() {
		return currentDirectory;
	}
	
	public String getCurrentDirectorySimplified() {
		return currentDirectorySimplified;
	}
	
	public boolean changeDirectory(String path) {
        File newDir;

        if (path.equals("..")) {
            newDir = currentDirectory.getParentFile();
            if (newDir == null) {
                System.out.println("Diretório raíz.");
                return false;
            }
        } else {
            newDir = new File(currentDirectory, path);
        }

        if (newDir.exists() && newDir.isDirectory()) {
            setCurrentDirectory(newDir);;
            return true;
        } else {
            System.out.println("Diretório não encontrado: " + path);
            return false;
        }
    }
}
