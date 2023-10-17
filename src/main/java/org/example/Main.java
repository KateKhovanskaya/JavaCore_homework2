package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{1, 3, 5}));
        System.out.println(difference(new int[]{1,2,-3,5,7}));
        System.out.println(isHaveZeroNebours(new int[]{1, 0, 3, 2, 0, 0, 1}));
    }

//    1. Подсчет количества четных элементов в массиве
    private static int countEvens(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0) count ++;
        }
        return count;
    }

//    2. Написать функцию, возвращающую разницу между самым большим и самым ма- леньким
//    элементами переданного не пустого массива.
    private static int difference(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min) min = arr[i];
            if(arr[i]>max) max = arr[i];
        }
        return max -min;
    }

//    3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних
//    элемента, с нулевым значением.

    private static boolean isHaveZeroNebours(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == 0 && arr[i+1] == 0) return true;
        }
        return false;
    }
}