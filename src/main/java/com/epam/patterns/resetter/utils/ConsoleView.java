package com.epam.patterns.resetter.utils;

import java.util.Arrays;

/**
 * Generate formatted strings of init and result arrays
 */
public class ConsoleView {

	private static final String INIT = "Init array";
	private static final String RESULT = "Result array";
	private static final String FORMAT = "%s: %s";

	/**
	 * Create formatted string array with comment.
	 *
	 * @param comment text before array.
	 * @param array
	 * @return formatted String  array with comment.
	 */
	private String getFormattedCommentAndArray(String comment, String array) {
		return String.format(FORMAT, comment, array);
	}

	/**
	 * Create formatted init string array with comment.
	 *
	 * @param array
	 * @return formatted String  array with comment.
	 */
	public void displayInitArray(int[] array) {
		System.out.println(getFormattedCommentAndArray(INIT, Arrays.toString(array)));
	}

	/**
	 * Create formatted result string array with comment.
	 *
	 * @param array
	 * @return formatted String  array with comment.
	 */
	public void displayResultArray(int[] array) {
		System.out.println(getFormattedCommentAndArray(RESULT, Arrays.toString(array)));
	}

	public void printError(Exception e) {
		e.printStackTrace();
	}

}
