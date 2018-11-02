package com.epam.patterns.resetter;

import com.epam.patterns.resetter.task.ResetArrayTaskExecutor;
import com.epam.patterns.resetter.utils.ArrayFormatStringGenerator;


/**
 * Started program.
 */
public class ResetArrayAppStarter {
	public static final String ZERO_ERROR = "Division by zero";
	public static final int[] ARRAY = {-50, 20, 13, 21, -8, 110, 25};
	public static final int LOW_LIMIT = 1;
	public static final int HIGH_LIMIT = 12;

	/**
	 * Point of entry in program.
	 * Init Task, run task, displays the result.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayFormatStringGenerator arrayFormatter = new ArrayFormatStringGenerator();
		ResetArrayTaskExecutor task = new ResetArrayTaskExecutor(ARRAY, HIGH_LIMIT, LOW_LIMIT);

		String initArrayString = arrayFormatter.getFormattedInitArray(ARRAY);
		System.out.println(initArrayString);

		try {
			int[] result = task.runResetArrayTask();

			String resultArrayString = arrayFormatter.getFormattedResultArray(result);
			System.out.println(resultArrayString);

		} catch (ArithmeticException e) {
			System.out.println(ZERO_ERROR);
		}
	}
}
