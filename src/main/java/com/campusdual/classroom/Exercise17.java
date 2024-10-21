package com.campusdual.classroom;

public class Exercise17 {
	public static int[] createEmptyIntArray(int positions) {
		int[] array = new int[positions];
		return array;
	}

	public static String[] createInitializedStringArray() {
		String[] array = new String[3];
		array[0] = "1";
		array[1] = "2";
		array[2] = "3";
		return array;
	}

	public static void populateArray(int[] array, int index, int value) {
		array[index] = value;

	}

	public static int arrayLength(int[] array) {
		return array.length;
	}

	public static void showValue(int[] array, int index) {
		if (index == 0) {
			System.out.println("El valor del indice " + index + " será: " + array[index]);
		} else if (index == 1){
			System.out.println("El valor del indice " + index + " será: " + array[index]);
		} else if (index == 2) {
			System.out.println("El valor del indice " + index + " será: " + array[index]);
		} else {
			System.out.println("No existe este valor del índice.");
		}
	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		for (String element : stringArray){
			System.out.println(element);
		}
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
	}
}
