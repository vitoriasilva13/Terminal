package terminal;

import java.util.Scanner;

public class Terminal {

	public static void main(String[] args) {
		SystemInfo sysInfo = new SystemInfo();
		CommandHandler commandHandler = new CommandHandler();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
            System.out.print(sysInfo.getUserName() + "@" + sysInfo.getPcName() +":~$ ");
            String input = scanner.nextLine().trim();
            if (!commandHandler.execute(input)) break;
        }
		
		scanner.close();
	}
}
