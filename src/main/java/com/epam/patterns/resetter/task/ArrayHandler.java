package com.epam.patterns.resetter.task;

import java.util.Arrays;

/**
 * Handles an array according to the task.
 */
public class ArrayHandler {
	/**
	 * Method is counting of elements in a range.
	 *
	 * @param array     needed to count the number of elements contains into the range.
	 * @param lowLimit  bottom border of range.
	 * @param highLimit top border of range.
	 * @return count of elements in a range.
	 */
	public int getCountElements(int[] array, int highLimit, int lowLimit) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (isInRange(array[i], highLimit, lowLimit)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Method is counting of average value of elements in a range.
	 *
	 * @param array     needed to count the number of elements contains into the range
	 * @param lowLimit  bottom border of range.
	 * @param highLimit top border of range.
	 * @return average value of elements in a range
	 */
	public double calculateAvgElements(int[] array, int highLimit, int lowLimit) throws ArithmeticException {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (isInRange(array[i], highLimit, lowLimit)) {
				sum += array[i];
				count++;
			}
		}
		double avg = sum / count; //possible ArithmeticException
		return avg;
	}

	/**
	 * checks that range contains item
	 *
	 * @param item      element of array
	 * @param lowLimit  is bottom border of range.
	 * @param highLimit is top border of range.
	 * @return if range contains item, return true, else false.
	 */
	private boolean isInRange(int item, int highLimit, int lowLimit) {
		return (item >= lowLimit) && (item <= highLimit);
	}

	/**
	 * Replace all positive elements in array in range by zero.
	 *
	 * @param array is array that we need to handle.
	 * @return new array is result of handle.
	 */
	public int[] resetPositiveElements(int[] array, int highLimit, int lowLimit) {
		int[] resultArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int currentElement = array[i];
			if (!(currentElement > 0 && isInRange(currentElement, highLimit, lowLimit))) {
				resultArray[i] = currentElement;
			}
		}
		return resultArray;
	}
}
