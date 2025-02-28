package terminal.commands;

import terminal.managers.HistoryManager;

public class HistoryCommand implements Command {

	@Override
	public void execute(Object object) {
		HistoryManager.show();
	}
}
