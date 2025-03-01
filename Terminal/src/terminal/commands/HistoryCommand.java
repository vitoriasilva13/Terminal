package terminal.commands;

import terminal.managers.HistoryManager;

public class HistoryCommand implements Command {

	@Override
	public boolean execute(Object object) {
		HistoryManager.show();
		return true;
	}
}
