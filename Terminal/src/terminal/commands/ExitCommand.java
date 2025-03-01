package terminal.commands;

public class ExitCommand implements Command {

	@Override
	public boolean execute(String args) {
		System.out.println("Encerrando terminal...");
		return false;
	}

}
