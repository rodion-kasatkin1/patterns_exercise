package com.epam.patterns.runner;

import com.epam.patterns.task.PatternsPracticeTask;


/**
 * Started program.
 */
public class Runner {
	public static final int[] ARGS = {-50, 0, 3, 1, -8, 10, 25};
	public static final int LOW_LIMIT = 1;
	public static final int HIGH_LIMIT = 12;

	/**
	 * Point of entry in program.
	 * Init Task, run task, displays the result.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		PatternsPracticeTask task = new PatternsPracticeTask(ARGS, LOW_LIMIT, HIGH_LIMIT);
		String result = task.doTask();
		System.out.println(result);
	}
}
