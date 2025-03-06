package terminal.commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import terminal.managers.DirectoryManager;

public class CatCommand implements Command {
	
	private DirectoryManager dir;
	
	public CatCommand(DirectoryManager dir) {
		this.dir = dir;
	}
	@Override
	public boolean execute(String args) {
		File file = new File(this.dir.getCurrentDirectory(), args);
		
		try (Scanner scanner = new Scanner(file)){
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
			/*
			 * nesse while estamos lendo sempre a proxima linha, se ela existir, printa a mesma
			 */
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + file.getName());
		}
		return true;
	}

}
