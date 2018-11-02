package com.epam.patterns.resetter.task;

import java.util.Arrays;

/**
 * Handles an array according to the task.
 */
public class ArrayHandler {
	/**
	 * Method is counting of elements in a range.
	 *
	 * @param array     it we need to count the number of elements contains into the range.
	 * @param lowLimit  is bottom border of range.
	 * @param highLimit is top border of range.
	 * @return count of elements in a range.
	 */
	public int getCountElementsInRange(int[] array, int highLimit, int lowLimit) {
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
	 * @param array     is array that we need to count the number of elements contains into the range
	 * @param lowLimit  is bottom border of range.
	 * @param highLimit is top border of range.
	 * @return average value of elements in a range
	 */
	public double calculateAvgElementsInRange(int[] array, int highLimit, int lowLimit) throws ArithmeticException {
		double sum = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (isInRange(array[i], highLimit, lowLimit)) {
				sum += array[i];
				count++;
			}
		}
		double avg = sum / count;
		if (Double.isNaN(avg)) {
			throw new ArithmeticException();
		}
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
	 * Replace all positive elements in array by zero.
	 *
	 * @param array is array that we need to handle.
	 * @return new array is result of handle.
	 */
	public int[] replacePositiveElementsOnZero(int[] array) {
		int[] resultArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				resultArray[i] = array[i];
			}
		}
		return resultArray;
	}
}
