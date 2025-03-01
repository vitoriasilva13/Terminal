package terminal;

import java.util.Scanner;

public class Terminal {

	public static void main(String[] args) {
		SystemInfo sysInfo = new SystemInfo();
		CommandHandler commandHandler = new CommandHandler();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.printf("\u001B[32m%s@%s\u001B[0m:\u001B[34m%s\u001B[0m$ ", 
				    sysInfo.getUserName(), sysInfo.getPcName(), commandHandler.getDir().getCurrentDirectorySimplified());
            String input = scanner.nextLine().trim();
            if (!commandHandler.execute(input)) break;
        }
		
		scanner.close();
	}
}
