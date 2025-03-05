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
		currentDirectorySimplified = "~/" + currentDirectory.getName();
	}
	
	public File getCurrentDirectory() {
		return currentDirectory;
	}
	
	public String getCurrentDirectorySimplified() {
		return currentDirectorySimplified;
	}
	
	public void changeDirectory(String path) {
        File newDir;

        if (path.equals("..")) {
            newDir = currentDirectory.getParentFile();
            if (newDir == null) {
                System.out.println("Diretório raíz.");
                return;
            }
        } else {
            newDir = new File(currentDirectory, path);
        }

        if (newDir.exists() && newDir.isDirectory()) {
            setCurrentDirectory(newDir);;
        } else {
            System.out.println("Diretório não encontrado: " + path);
        }
    }
	
	public void showDirectories() {
		File dir = new File(currentDirectory.getPath());
		File[] files = dir.listFiles();
		
		if (files != null) {
			System.out.println("Total " + files.length);
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("<DIR>  " +  file.getName());
				} else {
					System.out.println("       " + file.getName());
				}
			}
		}
		
	}
}
