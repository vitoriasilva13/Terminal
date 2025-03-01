package terminal.commands;

import java.nio.file.Paths;

public class PwdCommand implements Command {

	@Override
	public boolean execute(Object object) {
		System.out.println(Paths.get("").toAbsolutePath());
		return true;
	}

}
