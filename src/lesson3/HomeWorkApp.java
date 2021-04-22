package lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        replaceArray();
        fillArray();
        multiplicationIfLess();
        diagonal();
        diagonalV2(); // Если я верно истолковал задание, то нужно заполнить по двум диагоналям, что-то вроде такого
        System.out.println(Arrays.toString(workWithArray(5, 10)));
        findMinAndMax();
        findMinAndMaxV2();
        int[] arr = {10, 20, 30};
        System.out.println(checkBalance(arr));
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(checkBalance(arr2));
        int[] arr3 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        moveArray(arr3, 3);
        int[] arr4 = {20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        moveArray(arr4, -2);
    }

    public static void replaceArray() {
        int[] array = {0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void multiplicationIfLess() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void diagonal() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public static void diagonalV2() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ( (i == j) || (j == array.length - (i + 1)) ) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public static int[] workWithArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
//        Arrays.fill(array, initialValue);
        return array;
    }

    public static void findMinAndMax() {
        int[] array = {15, 2, 8, 16, 1, 23};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    public static void findMinAndMaxV2() {
        int[] array = {8, 15, 4, 16, 45, 23};
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length - 1];
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    public static boolean checkBalance(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        if (sum % 2 == 0) {
            int halfSum = sum / 2;
            int subTotal = 0;
            for (int j = 0; j < array.length; j++) {
                subTotal = subTotal + array[j];
                if (subTotal >= halfSum) {
                    break;
                }
            }
            return  (subTotal == halfSum);
        } else {
            return false;
        }
    }

    public static void moveArray(int[] array, int n) {
        int sum;
        if (n < 0) {
            for (int a = 0; a > n; a--) {
                for (int i = 0; i < (array.length - 1); i++) {
                    sum = array[i] + array[i + 1];
                    array[i] = array[i + 1];
                    array[i + 1] = sum - array[i];
                }
            }
        } else {
            for (int b = 0; b < n; b++) {
                for (int j = (array.length - 1); j > 0; j--) {
                    sum = array[j] + array[j - 1];
                    array[j] = array[j - 1];
                    array[j - 1] = sum - array[j];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
