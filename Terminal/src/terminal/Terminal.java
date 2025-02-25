package terminal;

import java.util.Scanner;

public class Terminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.equals("exit")) break;
            //commandHandler.executeCommand(input);
        }
		scanner.close();
        System.out.println("Terminal encerrado.");

	}

}
