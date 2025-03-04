package terminal.commands;

import java.io.File;
import java.io.IOException;

import terminal.managers.DirectoryManager;

public class TouchCommand implements Command {

	private DirectoryManager dir;
	
	public TouchCommand(DirectoryManager dir) {
		this.dir = dir;
	}
	
	@Override
	public boolean execute(String args) {
		try {
            File file = new File(this.dir.getCurrentDirectory(), args);

            if (file.createNewFile()) {
                System.out.println("Arquivo criado: " + file.getName());
            } else {
                System.out.println("O arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
		/*
         * no catch usamos IOException para capturar toda e qualquer execessão ou erro referente a input e/ou output
         */
		return true;
	}

}
