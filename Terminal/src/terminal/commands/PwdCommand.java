package terminal.commands;

import java.nio.file.Paths;

public class PwdCommand implements Command {

	@Override
	public void execute(Object object) {
		System.out.println(Paths.get("").toAbsolutePath());
	}

}
