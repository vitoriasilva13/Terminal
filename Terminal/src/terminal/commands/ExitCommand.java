package terminal.commands;

public class ExitCommand implements Command {

	@Override
	public boolean execute(Object object) {
		System.out.println("Encerrando terminal...");
		return false;
	}

}
