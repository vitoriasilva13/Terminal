package terminal.commands;

import terminal.managers.HistoryManager;

public class HistoryCommand implements Command {

	@Override
	public boolean execute(String args) {
		HistoryManager.show();
		return true;
	}
}
