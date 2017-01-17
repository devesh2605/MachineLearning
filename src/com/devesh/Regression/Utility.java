package com.devesh.Regression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Utility {

	private static BufferedReader bufferedReader;
	private static ArrayList<Double> list;

	public static double findSumOfList(ArrayList<Double> list) {
		double sum = 0;

		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}

		return sum;
	}

	public static ArrayList<Double> findSquareOfListElements(ArrayList<Double> list) {
		ArrayList<Double> resultList = new ArrayList<Double>();

		for (int i = 0; i < list.size(); i++) {
			double square = list.get(i) * list.get(i);
			resultList.add(square);
		}

		return resultList;
	}

	public static double findSumOfProductOfTwoList(ArrayList<Double> list1, ArrayList<Double> list2) {
		double sum = 0;

		for (int i = 0; i < list1.size(); i++) {
			sum = sum + ((list1.get(i)) * (list2.get(i)));
		}

		return sum;
	}

	public static double findSumOfSquaredList(ArrayList<Double> list) {

		double sum = 0;
		ArrayList<Double> resultList = Utility.findSquareOfListElements(list);

		for (int i = 0; i < resultList.size(); i++) {
			sum = sum + resultList.get(i);
		}

		return sum;
	}

	public static ArrayList<Double> readTextFile(String textFile1) {

		list = new ArrayList<>();
		String line = null;

		try {
			FileReader fileReader = new FileReader(textFile1);
			bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				double value = Double.parseDouble(line);
				list.add(value);
			}
			bufferedReader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}