package com.epam.patterns.task;

import java.util.Arrays;

public class OneDimArray {
	private int[] dimArray;


	public OneDimArray(int... args) {
		this.dimArray = args;
	}

	public int countElementsInRange(int lowLimit, int highLimit) {
		int amount = 0;
		for (int i = 0; i < dimArray.length; i++) {
			if (isInRange(this.dimArray[i], lowLimit, highLimit)) {
				amount++;
			}
		}
		return amount;
	}

	public double calculateAvgElementsInRange(int lowLimit, int highLimit) {
		double sum = 0;
		for (int i = 0; i < dimArray.length; i++) {
			if (isInRange(dimArray[i], lowLimit, highLimit)) {
				sum += dimArray[i];
			}
		}
		return sum / countElementsInRange(lowLimit, highLimit);
	}

	private boolean isInRange(double item, int lowLimit, int hiLimit) {
		return (item >= lowLimit) && (item <= hiLimit);
	}

	public void zeroPositiveElements() {
		for (int i = 0; i < dimArray.length; i++) {
			if (this.dimArray[i] > 0) {
				this.dimArray[i] = 0;
			}
		}
	}

	@Override
	public String toString() {
		return  Arrays.toString(dimArray);
	}

}
