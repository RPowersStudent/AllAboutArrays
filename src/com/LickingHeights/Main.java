package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 80;
        int highestNumber = 90;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);

        Pattern1();
        Pattern2();
        Pattern3();
        Pattern4();
        Pattern5();
        System.out.println("The sum of the array is "+sum(array));
        System.out.println("The minimum of the array is "+minimum(array));
        System.out.println("The maximum of the array is "+maximum(array));

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
    public static void Pattern4(){
        for(int rows=1; rows<7; rows++){
            for(int columns=1; columns<=rows; columns++) {
                System.out.print("*");
            }
            System.out.println();
            }
        System.out.println();
        }
    public static void Pattern5() {
        for (int rows = 1; rows <= 6; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int sum(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static int minimum(int[] array){
        int minimum=array[0];
        for(int i=1;i<array.length;i++){
            if(minimum>array[i]){
                minimum=array[i];
            }
        }
        return minimum;
    }
    public static int maximum(int[] array){
        int maximum=array[0];
        for(int i=1; i<array.length;i++){
            if(maximum<array[i]){
                maximum=array[i];
            }
        }
        return maximum;
    }


}
