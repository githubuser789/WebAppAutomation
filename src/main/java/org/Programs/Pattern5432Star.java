package org.Programs;

public class Pattern5432Star {
    public static void main(String[] args) {
        returnStarPattern(1, 5);
    }

    public static void returnStarPattern(int begin, int maxNumber) {
       String value="*";
        int k = 1;
        for (int i = begin; i <= maxNumber; i++) {
            for (int j = maxNumber; j >= 1; j--) {
                    if (j != k) {
                        System.out.print(j);
                    } else {
                        System.out.print("*");
                    }

            }
            System.out.println("");
            k++;
        }
    }
}