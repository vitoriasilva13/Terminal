package terminal.commands;

import terminal.managers.HistoryManager;

public class HistoryCommand implements Command {

	@Override
	public boolean execute(String args) {
		if (args.equals("clear")) {
			HistoryManager.clearHistory();
		} else {
			HistoryManager.show();
		}
		return true;
	}
}
