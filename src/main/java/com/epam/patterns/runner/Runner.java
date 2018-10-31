package com.epam.patterns.runner;

import com.epam.patterns.task.OneDimArray;

/**
 * ���������� ���������� ���������, �������� ������� ����� � ��������� ��
 * lowLimit �� hiLimit. ���� ������� �������������� �������� ���������, �������
 * ����� � ���� ���������, ��������� ���������� ����� ���������, �� ��������
 * �������� � �������������� ����������.
 */
public class Runner {
	public static void main(String[] args) {
		OneDimArray arrayObject =
				new OneDimArray(-50, 0, 3, 1, -8, 10, 25);
		System.out.println("Origin Array:");
		System.out.println(arrayObject);
		int lowLimit = 1;
		int hiLimit = 12;
		int amount = arrayObject.setAmountElementsArray(lowLimit, hiLimit);
		if (amount != 0) {
			System.out.println("Amount of element belonging" +
					"to a range from " + lowLimit + " to "
					+ hiLimit + " = " + amount);
			System.out.println("Array after transformations:");
			System.out.println(arrayObject);
		} else {
			System.out.println("Array hasn't elements " +
					"belonging to a given range");
		}
	}
}
