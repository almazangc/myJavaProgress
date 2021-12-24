package com.almazan;

import java.util.Scanner;

public class Sorting {

    static final String line = "----------------------------";
    static boolean isRunning = true;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        while (isRunning) {
            System.out.print(selectFx());
            int selectedOption = optionCheck();
            sortOptions(selectedOption);
        }
    }

    static String selectFx() {
        return    "\nSelect Sorting Algorithm"
                + "\n   [1] Bubble Sort"
                + "\n   [2] Selection Sort"
                + "\n   [3] Insertion Sort"
                + "\n   [4] Merge Sort"
                + "\n   [5] Quick Sort"
                + "\n   [6] Exit\n";
    }

    //Invalid Input Checker
    static int optionCheck() {
        int opt = 0;
        int i = 0;
        while (i < 1) {
            System.out.print("Enter your option: ");
            String input = new Scanner(System.in).nextLine();
            switch (input) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                    opt = Integer.parseInt(input);
                    i++;
                    break;
                case "6":
                    isRunning = false;
                    break;
                default:

                    clearScreen();
                    System.out.print("\n" + line
                            + "\nYou have entered, invalid option\n"
                            + line + "\n");
                    i++;
                    break;
            }
        }
        return opt;
    }

    //Methods Porter
    static void sortOptions(int i) {

        switch (i) {
            case 1:
                //bubbleSort Method
                System.out.println(line + "\n    Bubble Sort Selected\n" + line);
                bubbleSort();
                break;
            case 2:
                //selectionSort Method
                System.out.println(line + "\n    Selection Sort Selected\n" + line);
                selectionSort();
                break;
            case 3:
                //insertionSort Method
                System.out.println(line + "\n    Insertion Sort Selected\n" + line);
                insertionSort();
                break;
            case 4:
                //mergeSort Method
                System.out.println(line + "\n    Merge Sort Selected\n" + line);
                mergeSort();
                break;
            case 5:
                //quickSort Method
                System.out.println(line + "\n    Quick Sort Selected\n" + line);
                quickSort();
                break;
        }
    }

    //bubbleSort Method
    static void bubbleSort() {

        int[] arr = getInput();

        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            System.out.println((i < n - 1) ? "\nBubble Sort: " + ((i == 0) ? "1st" : (i == 1) ? "2nd" : (i == 2) ? "3rd" : (i + 1) + "th") + " Pass" : "");
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                for (int l : arr) {
                    System.out.print(l + " ");
                }
                System.out.println();
            }
        }
        displaySort(arr, "Sorted");
    }

    //selectionSort Method
    static void selectionSort() {
        int[] arr = getInput();

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            for (int l : arr) {
                System.out.print(l + " ");
            }
            System.out.println();

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        displaySort(arr, "Sorted");
    }

    //insertionSort Method
    static void insertionSort() {
        int[] arr = getInput();
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            for (int l = 0; l <= i; l++) {
                System.out.print(arr[l] + " ");
            }
            System.out.print(" | ");
            for (int l = j; l < n; l++) {
                System.out.print(arr[l] + " ");
            }
            System.out.println();

            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
        displaySort(arr, "Sorted");
        System.out.println(line);
    }

    //mergeSort Main
    static void mergeSort() {
        int[] arr = getInput();
        displaySort(arr, "Unsorted");
        mSort(arr);
        System.out.println();
        displaySort(arr, "Sorted");
        System.out.print(line + "\n");
    }

    //divide
    static void mSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int rightSize = n - mid;
        int[] left = new int[mid];
        int[] right = new int[rightSize];

        System.arraycopy(arr, 0, left, 0, mid);

        if (n - mid >= 0) System.arraycopy(arr, mid, right, 0, n - mid);

        System.out.println();

        for (int i : left) {
            System.out.print(left[i] + " ");
        }

        System.out.print(" | ");

        for (int i : right) {
            System.out.print(right[i] + " ");
        }

        mSort(left);
        mSort(right);

        merge(left, right, arr);
        System.out.println();

        for (int i : arr) {
            System.out.print(arr[i] + " ");
        }
    }

    //merge and sort
    static void merge(int[] left, int[] right, int[] arr) {
        int lSize = left.length;
        int rSize = right.length;
        int i = 0, j = 0, k = 0;

        while (i < lSize && j < rSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        while (i < lSize) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < rSize) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    //quickSort Main
    static void quickSort() {
        int[] arr = getInput();
        displaySort(arr, "Unsorted");

        qSort(arr, 0, arr.length - 1);

        displaySort(arr, "Sorted");
        System.out.print(line + "\n");
    }

    //quickSort Method
    static void qSort(int[] arr, int beg, int end) {

        if (beg < end) {

            int partitionIndex = partition(arr, beg, end);

            qSort(arr, beg, partitionIndex - 1);
            qSort(arr, partitionIndex + 1, end);
        }
    }

    //quickSort partitioner and sorter
    static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        System.out.print("Pivot: " + arr[i + 1] + "\t");

        for (int k = begin; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }

        System.out.print("( " + arr[i + 1] + " ) ");

        for (int k = i + 2; k <= end; k++) {
            System.out.print(arr[k] + " ");
        }

        System.out.println();

        return i + 1;
    }

    //getInputGiven Method
    static int[] getInput() {
        System.out.print("Enter Number of Elements: ");
        int arrSize = inCheck();
        int[] arr = new int[arrSize];

        System.out.print("Enter the elements: ");
        String str = new Scanner(System.in).nextLine();
        String[] strArr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        System.out.println(line);
        return arr;
    }

    //Check for Integer Only Input
    static int inCheck() {
        boolean isValid = false;
        String input = "";

        while (!isValid) {
            input = new Scanner(System.in).nextLine();
            isValid = input.matches("[-]?[\\d]*");

            if (!isValid) {
                System.out.print("Enter valid input: ");
                input = "";
            }
        }
        return (Integer.parseInt(input));
    }

    //Clearing Screen
    static void clearScreen() {
        for (byte j = 0; j < 100; j++) {
            System.out.println();
        }
    }

    //displaySortedList
    static void displaySort(int[] arr, String sortT) {
        System.out.print("\n" + sortT + " List: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i == arr.length - 1) ? " " : ","));
        }
        System.out.println();
    }
}
