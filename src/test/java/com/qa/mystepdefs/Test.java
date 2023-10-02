package com.qa.mystepdefs;

import pages.*;
import java.util.Random;
import java.util.Arrays;

public class Test {

    private static BubbleSort bubbleSort = new BubbleSort();
    private static InsertionSort insertionSort = new InsertionSort();
    private static SelectionSort selectionSort = new SelectionSort();
    private static FindMax findMax = new FindMax();
    private static FindMin findMin = new FindMin();
    private static IsPrime isPrime = new IsPrime();
    private static IsFibonacci  isFibonacci  = new IsFibonacci();
    private static FindLCM findLCM = new FindLCM();
    private static FindGCD findGCD = new FindGCD();
    private static IsSortedAscending isSortedAscending = new IsSortedAscending();
    private static IsSortedDescending isSortedDescending = new IsSortedDescending();

    public static void main(String[] args) {
        testBubbleSort();
        testInsertionSort();
        testSelectionSort();
        testFindMax();
        testFindMin();
        testIsPrime();
        testIsFibonacci();
        randomArr();
        testLeastCommonMultiple();
        testGreatestCommonDivisor();
        testIsSortedAscending();
        tesSortedAscending();
        testIsSortedDescending();
        testSortDescending();
    }
    public static int[] generateRandomArray() {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);  // Số ngẫu nhiên từ 0 đến 99
        }

        return arr;
    }
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);  // Generate a random number between 0 and 99
    }
    public static void randomArr(){
        // Tạo một mảng 10 số nguyên ngẫu nhiên
        int[] randomArray = generateRandomArray();
        // In mảng dưới dạng {5, 3, 1, 4, 2, 12, 20}
        System.out.print("{");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i]);
            if (i < randomArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
    public static void testBubbleSort() {
        int[] arr = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};

        bubbleSort.bubbleSort(arr);

        if (Arrays.equals(arr, expected)) {
            System.out.println("testBubbleSort pass");
        } else {
            System.out.println("testBubbleSort fails");
        }
    }
    public static void testInsertionSort() {
        int[] arr = {5, 2, 1, 4, 3};
        insertionSort.insertionSort(arr);
        int[] expected = {1, 2, 3, 4, 5};
        if (Arrays.equals(arr, expected)) {
            System.out.println("testInsertionSort pass");
        } else {
            System.out.println("testInsertionSort fails");
        }
    }
    public static void testSelectionSort() {
        int[] arr = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        selectionSort.selectionSort(arr);
        if (Arrays.equals(arr, expected)) {
            System.out.println("testSelectionSort pass");
        } else {
            System.out.println("testSelectionSort fails");
        }
    }
    public static void testFindMax(){
        int[] arr = {5, 3, 1, 4, 2};
        int max = findMax.findMax(arr);
        System.out.println("Max value is :"+ max);
    }
    public static void testFindMin(){
        int[] arr = {5, 3, 1, 4, 2,12,20};
        int min = findMin.findMin(arr);
        System.out.println("Min value is :"+ min);
    }

    public static void testIsPrime(){
        // Generate a random number
        int randomNum = generateRandomNumber();

        // Check if the random number is prime
        boolean Prime = isPrime.isPrime(randomNum);

        // Print the random number and whether it's prime or not
        System.out.println("Random number for prime test: " + randomNum);
        System.out.println("Is prime: " + Prime);
    }
    public static void testIsFibonacci(){
        // Generate a random number
        int randomNum = generateRandomNumber();

        // Check if the random number is prime
        boolean Fibonacci = isFibonacci.isFibonacci(randomNum);

        // Print the random number and whether it's prime or not
        System.out.println("Random number for Fibonacci test: " + randomNum);
        System.out.println("Is Fibonacci: " + Fibonacci);
    }
    public static void testLeastCommonMultiple(){
        //BCNN
        int a = generateRandomNumber();
        int b = generateRandomNumber();
        int LCM = findLCM.findLCM(a,b);
        System.out.println("Least Common Multiple of " + a+" and " +b+ " is: "+ LCM);
    }
    public static void testGreatestCommonDivisor(){
        //UCLN
        int a = generateRandomNumber();
        int b = generateRandomNumber();
        int GCD = findGCD.findGCD(a,b);
        System.out.println("Greatest Common Divisor of " + a+" and " +b+ " is: "+ GCD);
    }

    public static void testIsSortedAscending(){
        int[] arr = {2, 3, 4, 5, 6,12,20};
        boolean SortAZ = isSortedAscending.isSortedAscending(arr);
        if(SortAZ)
            System.out.println("array have been sorted A to Z");
        else
            System.out.println("array have not been sorted A to Z");
    }
    public static void tesSortedAscending(){
        int[] arr = {2, 3, 4, 5, 6,12,20};
        isSortedAscending.sortAscending(arr);
        // In mảng đã được sắp xếp
        System.out.print("Array sorted in ascending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void testIsSortedDescending (){
        String[] arr = {"than","re","qua","la","hoa" };
        boolean SortZA = isSortedDescending.isSortedDescending(arr);
        if(SortZA)
            System.out.println("array have been sorted Z to A");
        else
            System.out.println("array have not been sorted Z to A");
    }
    public static void testSortDescending(){
        String[] arr = {"hoa","la","qua" ,"re","than"};
        isSortedDescending.sortDescending(arr);
        // In mảng đã được sắp xếp
        System.out.print("Array sorted in Descending order: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
