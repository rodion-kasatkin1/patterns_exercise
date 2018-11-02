package com.epam.patterns.task;


import com.epam.patterns.utils.OneDimArrayHandler;

import java.util.Arrays;

/**
 * Execute task:
 * Подсчитать количество элементов, значения которых лежат в диапазоне от
 * lowLimit до hiLimit. Если среднее арифметическое значений элементов, которые
 * лежат в этом диапазоне, превышает количество таких элементов, то обнулить
 * элементы с положительными значениями.
 */
public class PatternsPracticeTask implements Task {
	private static final String RESULT = "\nresult :";
	OneDimArrayHandler ARRAY_HANDLER = new OneDimArrayHandler();
	private int[] array;
	private int lowLimit;
	private int highLimit;

	/**
	 * Initializes the class.
	 *
	 * @param args      is array of handling elements.
	 * @param lowLimit  is bottom border of range.
	 * @param highLimit is top border of range.
	 */
	public PatternsPracticeTask(int[] args, int lowLimit, int highLimit) {
		this.array = args;
		this.highLimit = highLimit;
		this.lowLimit = lowLimit;
	}

	/**
	 * Execute task method.
	 *
	 * @return String of result of task.
	 */
	public String doTask() {
		StringBuilder consoleOutput = new StringBuilder();
		consoleOutput.append(Arrays.toString(array));
		int amount = ARRAY_HANDLER.countElementsInRange(array, lowLimit, highLimit);
		if (amount != 0) {
			if (isAmountLowerAvg(amount)) {
				array = ARRAY_HANDLER.replacePositiveElementsOnZero(array);
				consoleOutput.append(RESULT + Arrays.toString(array));
			}
		}
		return consoleOutput.toString();
	}

	/**
	 * Checks that count of elements in a range is lower than the average value of elements in a range .
	 *
	 * @param amount count of elements in a range.
	 * @return
	 */
	private boolean isAmountLowerAvg(int amount) {
		return amount < ARRAY_HANDLER.calculateAvgElementsInRange(array, lowLimit, highLimit);
	}


}
