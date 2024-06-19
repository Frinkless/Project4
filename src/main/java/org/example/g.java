package org.example;

public class g {
    public static void main(String[] args) {
        int[][]numbers={
                {10,20,30},
                {50,60,70},
                {80,90,100},
        };
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length; j++) {
                if(numbers[i][j]>50){
                    sum+=numbers[i][j];
                }

            }
        }
        System.out.println(sum);
    }
}
