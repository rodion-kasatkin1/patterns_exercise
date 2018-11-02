package com.epam.patterns.utils;

import java.util.Arrays;

/**
 * Handles an array according to the task.
 */
public class OneDimArrayHandler {
	/**
	 * Method is counting of elements in a range.
	 *
	 * @param array     is array that we need to count the number of elements contains into the range.
	 * @param lowLimit  is bottom border of range.
	 * @param highLimit is top border of range.
	 * @return count of elements in a range.
	 */
	public int countElementsInRange(int[] array, int lowLimit, int highLimit) {
		int amount = 0;
		for (int i = 0; i < array.length; i++) {
			if (isInRange(array[i], lowLimit, highLimit)) {
				amount++;
			}
		}
		return amount;
	}

	/**
	 * Method is counting of average value of elements in a range.
	 *
	 * @param array     is array that we need to count the number of elements contains into the range
	 * @param lowLimit  is bottom border of range.
	 * @param highLimit is top border of range.
	 * @return average value of elements in a range
	 */
	public double calculateAvgElementsInRange(int[] array, int lowLimit, int highLimit) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (isInRange(array[i], lowLimit, highLimit)) {
				sum += array[i];
			}
		}
		return sum / countElementsInRange(array, lowLimit, highLimit);
	}

	/**
	 * checks that range contains item
	 *
	 * @param item      element of array
	 * @param lowLimit  is bottom border of range.
	 * @param highLimit is top border of range.
	 * @return if range contains item, return true, else false.
	 */
	private boolean isInRange(double item, int lowLimit, int highLimit) {
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
			if (array[i] > 0) {
				resultArray[i] = 0;
			} else {
				resultArray[i] = array[i];
			}
		}
		return resultArray;
	}
}
