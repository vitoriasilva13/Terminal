package terminal.managers;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HistoryManager {

	public static void save(String input) {
		try (FileWriter writer = new FileWriter("history.txt", true)) {
            writer.write(input + "\n");
        } catch (IOException e) {
            System.out.println("\u001B[91mErro ao salvar histórico.");
        }
	}
	
	public static void show() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("history.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("\u001B[91mErro ao ler histórico.");
        }
    }
	
	public static void clearHistory() {
        try (FileWriter writer = new FileWriter("history.txt", false)) {
            writer.write("");
            System.out.println("Histórico excluído.");
        } catch (IOException e) {
            System.out.println("\u001B[91mHouve um erro ao limpar histórico.");
        }
    }

}
