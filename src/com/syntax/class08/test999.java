package com.syntax.class08;

import java.util.ArrayList;

public class test999 {

	public static void main(String[] args) {
		int arr1[] = { -7, 12, 17, 29, 41, 56, 79 };
		int arr2[] = { -9, -3, 0, 5, 19 };
	}
	

	// TODO Auto-generated method stub
	

	int[] qa_findUnion(int[] arr1, int[] arr2) {
		int[] a;
		int[] b;

		ArrayList<Integer> c = new ArrayList<>();
		int i = 0;
		int j = 0;

		if (arr1.length > arr2.length) {
			a = arr2;
			b = arr1;
		} else {
			a = arr1;
			b = arr2;
		}

		while (j < b.length) {
			int bb = b[j];

			if (i < a.length) {
				int aa = a[i];

				if (aa > bb) {
					c.add(bb);
					j++;
				} else {
					c.add(aa);
					i++;
					if (aa == bb) {
						j++;

					}
				}
			} else {
				c.add(bb);
				j++;
			}
		}
		
	//	for(int k1=0;k1<qa_findUnion.length;k1++)  {  //length is the property of the array  
		//System.out.println(qa_findUnion[k1]); 

		return c.stream().mapToInt(Integer::intValue).toArray();

	}
	}

