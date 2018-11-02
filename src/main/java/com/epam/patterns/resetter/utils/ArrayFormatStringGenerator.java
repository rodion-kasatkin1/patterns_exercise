package com.epam.patterns.resetter.utils;

import java.util.Arrays;

/**
 * Generate formatted strings of init and result arrays
 */
public class ArrayFormatStringGenerator {

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
	public String getFormattedInitArray(int[] array) {
		return getFormattedCommentAndArray(INIT, Arrays.toString(array));
	}

	/**
	 * Create formatted result string array with comment.
	 *
	 * @param array
	 * @return formatted String  array with comment.
	 */
	public String getFormattedResultArray(int[] array) {
		return getFormattedCommentAndArray(RESULT, Arrays.toString(array));
	}


}
