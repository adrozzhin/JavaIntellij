package com.syntax.Repl;

public class Repl169 {
    final static double avgElements (int[]a) {
        double aver;
        int sum = a[0];
        for( int i=1;i<a.length;i++) {
            sum = sum +a[i];
        }
        System.out.println(sum);
        aver = (double)sum/a.length;
        return aver;
    }

    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
}
