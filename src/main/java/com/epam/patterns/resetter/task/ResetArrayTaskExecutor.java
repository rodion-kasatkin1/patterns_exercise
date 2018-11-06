package com.epam.patterns.resetter.task;


/**
 * Execute task:
 * Подсчитать количество элементов, значения которых лежат в диапазоне от
 * lowLimit до hiLimit. Если среднее арифметическое значений элементов, которые
 * лежат в этом диапазоне, превышает количество таких элементов, то обнулить
 * элементы с положительными значениями.
 */
public class ResetArrayTaskExecutor {
	private ArrayHandler arrayHandler;
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
	public ResetArrayTaskExecutor(int[] args, int highLimit, int lowLimit) {
		this.arrayHandler = new ArrayHandler();
		this.array = args;
		this.highLimit = highLimit;
		this.lowLimit = lowLimit;
	}

	/**
	 * Execute task method.
	 *
	 * @return String of result of task.
	 */
	public int[] runResetArrayTask() throws ArithmeticException {
		int count = arrayHandler.getCountElementsInRange(array, highLimit, lowLimit);
		double avg = arrayHandler.calculateAvgElementsInRange(array, highLimit, lowLimit);
		int[] result = {};
		if (count < avg) {
			result = arrayHandler.replacePositiveElementsInRangeOnZero(array, highLimit, lowLimit);
		}
		return result;
	}

}
