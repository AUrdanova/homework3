package com.company;

public class Main {
    public static double realInfo = 0;
    public static double totalSum = 0;
    public static double count = 0;
    public static double average = 0;
    public static double temp = 0;

    public static void main(String[] args) {
        double[] numbs = {0.5, -1.7, 3.3, 6.8, 5.2, 6.3, 4.8, -5.5, 10.3, 1.1, -3.3, 5.6, 77.3, 20.5, 21.1};
        for (double realInt : numbs) {
            if (realInfo < 0) {
                realInfo++;
            } else if (realInt > 0 && realInfo > 0) {
                totalSum = totalSum + realInt;
                count++;
                average = totalSum / count;
            }
        }
        System.out.println(average);

        for (int i = 0; i < numbs.length; i++) {
            double num = numbs[i];
            for (int j = i - 1; j >= 0; j--) {
                double leftNumber = numbs[j];

                if (num < leftNumber) {
                    numbs[j + 1] = leftNumber;
                    numbs[j] = num;

                } else {
                    break;

                }


            }


        }
        for (Double n : numbs) {
            System.out.println(n + ",");

        }
    }

}




