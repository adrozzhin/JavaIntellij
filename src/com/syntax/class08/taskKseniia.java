package com.syntax.class08;

public class taskKseniia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrayA[] = { -7, 12, 17, 29, 41, 56, 79 };
		int arrayB[] = { -9, -3, 0, 5, 19 };

		int mergedArray[] = new int[arrayA.length + arrayB.length];
		int i = 0, j = 0, k = 0;

		while (i < arrayA.length && j < arrayB.length) {
			if (arrayA[i] < arrayB[j]) {
				mergedArray[k] = arrayA[i];
				i++;
				k++;
			} else {
				mergedArray[k] = arrayB[j];
				j++;
				k++;
			}
		}
		while (i < arrayA.length)
		{
		mergedArray[k] = arrayA[i];
		i++;
		k++;
		}
		while (j < arrayB.length)
		{
		mergedArray[k] = arrayB[j];
		j++;
		k++;
		}
		
		
		for(int k1=0;k1<mergedArray.length;k1++)  {  //length is the property of the array  
			System.out.println(mergedArray[k1]);  
		}
	}

}
