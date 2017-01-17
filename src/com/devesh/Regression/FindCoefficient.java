package com.devesh.Regression;

import java.util.ArrayList;

public class FindCoefficient {

	public double findSlope(ArrayList<Double> list1, ArrayList<Double> list2) {
		double slope = 0;

		slope = ((Utility.findSumOfList(list2) * Utility.findSumOfSquaredList(list1))
				- (Utility.findSumOfList(list1) * Utility.findSumOfProductOfTwoList(list1, list2)))
				/ ((list1.size() * Utility.findSumOfSquaredList(list1))
						- (Utility.findSumOfList(list1) * Utility.findSumOfList(list1)));

		return slope;
	}

	public double findIntercept(ArrayList<Double> list1, ArrayList<Double> list2) {
		double intercept = 0;

		intercept = ((list1.size() * Utility.findSumOfProductOfTwoList(list1, list2))
				- (Utility.findSumOfList(list1) * Utility.findSumOfList(list2)))
				/ ((list1.size() * Utility.findSumOfSquaredList(list1))
						- (Utility.findSumOfList(list1) * Utility.findSumOfList(list1)));

		return intercept;
	}
}