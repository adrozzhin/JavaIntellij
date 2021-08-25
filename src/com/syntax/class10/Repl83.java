package com.syntax.class10;

public class Repl83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};

	    int[] rowSums = new int[a.length];
	    for(int i=0;i<a.length;i++) {
	      for (int j=0;j<a[i].length;j++) {
	      //  if (j==0) {
	          rowSums[i] = rowSums[i] + a[i][j];
	       // } else {
	       //   rowSums[j] = rowSums[j-1] + a[i][j] ;
	      //  }
	        
	      }
	    }
	    for (int k=0;k<rowSums.length;k++) {
	      System.out.println(rowSums[k]);
	    }

	}

}
