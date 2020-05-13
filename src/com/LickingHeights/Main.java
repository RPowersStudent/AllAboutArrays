package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 0;
        int highestNumber = 10;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);

        Pattern1();
        Pattern2();
        Pattern3();

    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }
    //initial condition, conditional, incrementor/decrementor
    public static void Pattern1(){
        for(int rows=0; rows < 6; rows++) {

            for(int columns = 0; columns < 6; columns++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void Pattern2(){
        for(int n=1; n < 7; n++){

            for(int row=1; row < 8; row++){

                System.out.print(n);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Pattern3(){
        for(int b=1; b < 7; b++){

            for(int row=1; row<7; row++){

                System.out.print(row);

            }
            System.out.println();
        }
        System.out.println();
    }




}
