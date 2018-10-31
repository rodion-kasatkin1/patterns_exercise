package com.epam.patterns.task;

import java.util.Arrays;

public class OneDimArray {
    private int[] dimArray;
    private int amount = 0;
    private int sum = 0;

    public OneDimArray(int... args) {
	this.dimArray = new int[args.length];
	setArrayElem(args);
    }

    public final void setArrayElem(int... args) {
	int length = args.length;
	for (int i = 0; i < length; i++) {
	    this.dimArray[i] = args[i];
	}
    }

    public int setAmountElementsArray(int lowLimit, int hiLimit) {
	this.amount = 0;
	this.sum = 0;
	int length = this.dimArray.length;
	for (int i = 0; i < length; i++) {
	    if ((this.dimArray[i] >= lowLimit) && (this.dimArray[i] <= hiLimit)) {
		this.amount++;
		this.sum += this.dimArray[i];
	    }
	}

	if ((amount != 0) && (this.sum / this.amount > this.amount)) {
	    zeroPositiveElements(lowLimit, hiLimit);
	}

	return this.amount;
    }

    public void zeroPositiveElements(int lowLimit, int hiLimit) {
	int length = this.dimArray.length;
	for (int i = 0; i < length; i++) {
	    if (this.dimArray[i] > 0
	    /*
	     * && ((this.dimArray[i] >= lowLimit) && (this.dimArray[i] <=
	     * hiLimit)
	     */) {
		this.dimArray[i] = 0;
	    }
	}
    }

    @Override
    public String toString() {
	return Arrays.toString(this.dimArray);
    }

}
