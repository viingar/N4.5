package org.example;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int x = scan.nextInt();
     int y = scan.nextInt();
     long sum = getArithmeticProgressionSum(x,y);
     System.out.print(sum);

    }
    public static long getArithmeticProgressionSum(int a, int b) {

        return IntStream.range(a,b).mapToLong(i -> i).sum();

    }
}