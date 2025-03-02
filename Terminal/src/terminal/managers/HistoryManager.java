package terminal.managers;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HistoryManager {

	public static void save(String input) {
		try (FileWriter writer = new FileWriter("history.txt", true)) {
            writer.write(input + "\n");
        } catch (Exception e) {
            System.out.println("Erro ao salvar histórico.");
        }
	}
	
	public static void show() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("history.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler histórico.");
        }
    }

}
