package com.epam.patterns.task;


public class TaskExecutor {
	private OneDimArray array;
	private StringBuilder consoleOutput;

	public void initArray(int... args) {
		array = new OneDimArray(args);
		consoleOutput = new StringBuilder();
	}

	public void doTask(int lowLimit, int highLimit) {

		consoleOutput.append("Origin array: " + array.toString());
		int amount = array.countElementsInRange(lowLimit, highLimit);
		if (amount != 0) {
			consoleOutput.append("\nAmount of element belonging to a range from " + lowLimit + " to "
					+ highLimit + " = " + amount);
			zeroElementsIfAmountGraterThenAvgInRange(amount, lowLimit, highLimit);
		} else {
			consoleOutput.append("\nArray hasn't elements belonging to a given range");
		}
		System.out.println(consoleOutput);
	}

	private void zeroElementsIfAmountGraterThenAvgInRange(int amount, int lowLimit, int highLimit) {
		if (amount < array.calculateAvgElementsInRange(lowLimit, highLimit)) {
			array.zeroPositiveElements();
			consoleOutput.append("\nArray after transformations: " + array.toString());
		} else {
			consoleOutput.append("\nAmount is greater than avg in range");
		}
	}
}
