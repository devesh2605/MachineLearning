package com.devesh.Regression;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearRegression {

	public static ArrayList<Double> list1 = new ArrayList<>();
	public static ArrayList<Double> list2 = new ArrayList<>();
	public static double slope = 0;
	public static double intercept = 0;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		FindCoefficient coefficient = new FindCoefficient();

		list1 = Utility.readTextFile(""); // Enter the path of the file which
											// contains value of X
		list2 = Utility.readTextFile(""); // Enter the path of the file which
											// contains value of Y

		slope = coefficient.findSlope(list1, list2);
		intercept = coefficient.findIntercept(list1, list2);

		System.out.println("Please enter the value of X: ");
		double x = scanner.nextDouble();

		double y = slope + (intercept * x);
		System.out.println(y);
	}
}