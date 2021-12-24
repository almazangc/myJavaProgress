package com.almazan;

public class ArrayDemo {
    public static void main(String[] args) {

        //Arrays
        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;

        // this form is discouraged
        float anArrayOfFloats1[];

        //Array Declaration
        int[] IntArr;

        //Allocating memory
        IntArr = new int [5];

        //Declaration and Allocation
        int[] arr = new int [5];

        //Allocating mem
        int[] arr1 = {5,0,5,1,10};

        //Assigning values
        int index = 0; //location of index
        arr1[index] = 1; //assigning value to index

        //.length starts from 0
        int a = arr1.length;

        //MultiDimensional Array [][] dimension
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };

        //arrayCopy method
        /**
         *  .arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
         */
        char[] copyFrom = {'A','h','a','k',100,105,'G','R'};
        char[] copyTo = new char[5];

        System.arraycopy(copyFrom, 1, copyTo, 0, 5);
        System.out.println(new String(copyTo));

        //OUTPUT
        //hakdi


        char[] copyFrom1 = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo1 = java.util.Arrays.copyOfRange(copyFrom1, 2, 9);

        System.out.println(new String(copyTo1));
    }
}
