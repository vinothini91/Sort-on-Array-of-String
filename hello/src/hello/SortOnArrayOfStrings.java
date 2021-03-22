package hello;

import java.util.Scanner;

public class SortOnArrayOfStrings {

	public static void main(String[] args) {

		System.out.println("Enter count of elements");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		String array[] = new String[count];

		System.out.println("Enter the String element");
		for (int i = 0; i < count; i++) {
			array[i] = scan.nextLine();
		}
		scan.close();
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].compareTo(array[j]) > 0) {

					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("AFTER SORTING STRING ARRAY:");

		for (int k = 0; k < count; k++) {
			System.out.println(array[k] + " ");
		}

	}

}
