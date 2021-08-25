package com.syntax.Repl;

public class Repl90 {
    public static void main(String[] args) {
        int nums[][] = {    {5,10,15},
                            {20,25,30},
                            {35,40,45},
                            {50,55,60}  };
        int oddCounter=0;

        for (int i = 0; i<nums.length; i++) {
            for (int j=0;j<nums[i].length;j++) {
                nums[i][j] = nums[i][j]/3;
                System.out.print(nums[i][j] + " ");
                if (nums[i][j]%2!=0) {
                    oddCounter++;
                }
            }
            System.out.println();

        }
        System.out.println(oddCounter);
    }
}
