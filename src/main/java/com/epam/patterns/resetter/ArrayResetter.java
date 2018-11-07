package com.epam.patterns.resetter;

import com.epam.patterns.resetter.task.ResetArrayTaskExecutor;
import com.epam.patterns.resetter.utils.ConsoleView;


/**
 * Started program.
 */
public class ArrayResetter {
	private static final String ZERO_ERROR = "Division by zero";
	private static final int[] ARRAY = {-50, 0, 2, 1, -8, 10, 25};
	private static final int LOW_LIMIT = 1;
	private static final int HIGH_LIMIT = 12;

	private ConsoleView consoleView;
	private ResetArrayTaskExecutor task;

	public ConsoleView getConsoleView() {
		return consoleView;
	}

	public ResetArrayTaskExecutor getTask() {
		return task;
	}

	public ArrayResetter() {
		this.consoleView = new ConsoleView();
		this.task = new ResetArrayTaskExecutor(ARRAY, HIGH_LIMIT, LOW_LIMIT);
	}

	/**
	 * Point of entry in program.
	 * Init Task, run task, displays the result.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayResetter arrayResetter = new ArrayResetter();
		int[] result = null;
		try {
			result = arrayResetter.getTask().runResetArrayTask();
		} catch (ArithmeticException e) {
			arrayResetter.getConsoleView().printMessage(ZERO_ERROR);
		}
		arrayResetter.displayResult(result, ARRAY, arrayResetter.getConsoleView());
	}

	/**
	 * displays result in console
	 *
	 * @param resultArray
	 * @param initArray
	 * @param consoleView console outputter
	 */
	private void displayResult(int[] resultArray, int[] initArray, ConsoleView consoleView) {
		consoleView.displayInitArray(initArray);
		if (resultArray != null) {
			consoleView.displayResultArray(resultArray);
		}
	}
}
