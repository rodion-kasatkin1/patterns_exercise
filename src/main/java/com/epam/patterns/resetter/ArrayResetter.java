package com.epam.patterns.resetter;

import com.epam.patterns.resetter.task.ResetArrayTaskExecutor;
import com.epam.patterns.resetter.utils.ConsoleView;


/**
 * Started program.
 */
public class ArrayResetter {
	private static final int[] ARRAY = {-50, 0, 2, 1, -8, 10, 25};
	private static final int LOW_LIMIT = 1;
	private static final int HIGH_LIMIT = 12;

	private ConsoleView consoleView;
	private ResetArrayTaskExecutor resetterTask;

	public ConsoleView getConsoleView() {
		return consoleView;
	}


	public ArrayResetter() {
		this.consoleView = new ConsoleView();
		this.resetterTask = new ResetArrayTaskExecutor(ARRAY, HIGH_LIMIT, LOW_LIMIT);
	}

	/**
	 * Point of entry in program.
	 * Init Task, run resetterTask, displays the result.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayResetter arrayResetter = new ArrayResetter();
		arrayResetter.doReset();
	}

	public void doReset() {
		consoleView.displayInitArray(ARRAY);
		try {
			int[] result = resetterTask.runResetArrayTask();
			consoleView.displayResultArray(result);
		} catch (ArithmeticException e) {
			consoleView.printError(e);
		}
	}

}
