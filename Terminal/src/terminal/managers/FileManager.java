package terminal.managers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
	
	public DirectoryManager dir;
	
	public FileManager(DirectoryManager dir) {
		this.dir = dir;
	}
	
	public boolean delete(File file) {
		try {
			if(file.isFile()) {
				file.delete();
			}else if(file.isDirectory() && file.list().length == 0) {
				file.delete();
			}else{
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
	/*
	 * esta apagando recursivamente, se for aquivo apaga, se for diretorio vazio apaga, se for diretorio com conteudo 
	 * chama novamente a funcao delete para o arquivo "filho" que esta contido no diretorio, para todos os arquivos filhos e por fim
	 * deleta o diretorio
	 */
	
	public boolean createNewFile(String args) {
		try {
            File file = new File(dir.getCurrentDirectory(), args);

            if (file.createNewFile()) {
                System.out.println("Arquivo criado: " + file.getName());
            } else {
                System.out.println("O arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
        }
		return true;
	}
	/*
     * no catch usamos IOException para capturar toda e qualquer execessão ou erro referente a input e/ou output
     */
	
	public boolean createNewDirectory(String args) {
		try {
			File file = new File(dir.getCurrentDirectory().getAbsolutePath(), args);
			
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
	/*
	 *usamos mkdirs para criar mais de um diretorio com um so comando
	 */
	
	public boolean deleteDirectory(String args) {
		try {
			File file = new File(this.dir.getCurrentDirectory(), args);
			if(delete(file)) {
				System.out.println(file.getName() + " apagado.");
			}else {
				System.out.println("Falha ao apagar.");
			}
		}catch (SecurityException e) {
            System.out.println("Ocorreu um erro de permissão.");
        }
		return true;
	}
	
	public boolean printFileContent(String args) {
		File file = new File(this.dir.getCurrentDirectory(), args);
		
		try (Scanner scanner = new Scanner(file)){
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + file.getName());
		}
		return true;
	}
	/*
	 * nesse while estamos lendo sempre a proxima linha, se ela existir, printa a mesma
	 */
	
	 public void echoToFile(String args) {
		 	
        int index = args.lastIndexOf(">");
        if (index == -1 || index == args.length() - 1) {
            System.out.println("Erro no comando. Certifique-se de usar: echo <texto> > <arquivo>");
            return;
        }
        /*
         * identifica quando o > é usado pela última vez, para casos que o texto a ser inserido no arquivo contenha >
         */

        String text = args.substring(0, index).trim();
        String fileName = args.substring(index + 1).trim();
        /*
         * separa o texto do nome do arquivo
         */
        File file = new File(this.dir.getCurrentDirectory(), fileName);
        
        try (FileWriter writer = new FileWriter(file.getAbsoluteFile(), true)) {
            writer.write(text);
            System.out.println("Texto escrito no arquivo " + fileName);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo!");
        }
	 }
}
