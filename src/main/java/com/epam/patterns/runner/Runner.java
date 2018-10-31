package com.epam.patterns.runner;

import com.epam.patterns.task.OneDimArray;
import com.epam.patterns.task.TaskExecutor;


/**
 * ���������� ���������� ���������, �������� ������� ����� � ��������� ��
 * lowLimit �� hiLimit. ���� ������� �������������� �������� ���������, �������
 * ����� � ���� ���������, ��������� ���������� ����� ���������, �� ��������
 * �������� � �������������� ����������.
 */
public class Runner {
	public static final int[] ARGS = {-50, 0, 3, 1, -8, 10, 25};
	public static final int LOW_LIMIT = 1;
	public static final int HIGH_LIMIT = 12;


	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.doTask();
	}

	public static void doTask() {
		TaskExecutor task = new TaskExecutor();
		task.initArray(ARGS);
		task.doTask(LOW_LIMIT, HIGH_LIMIT);
	}
}
