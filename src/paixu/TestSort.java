package paixu;

import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {

        Sort tl = new Sort();
        int[] array = tl.insertionSort(new int[]{21,3,4,554,6,7,1,0,45});
        System.out.println(Arrays.toString(array));
        int[] array1 = tl.maopaoSort(new int[]{9,8,7,6,5,4,3,2,1,0});
        System.out.println(Arrays.toString(array1));
        int[] array2 = tl.selectionSort(new int[]{9,8,7,6,5,4,3,2,1,0});
        System.out.println(Arrays.toString(array2));
        int[] array3 = tl.shellSort(new int[]{9,8,7,6,5,4,3,2,1,0});
        System.out.println(Arrays.toString(array3));
        int[] array4 = tl.mergeSort(new int[]{9,8,7,6,5,4,3,2,1,0});
        System.out.println(Arrays.toString(array4));
        int[] array5 = tl.merge_sort(new int[]{9,8,7,6,5,4,3,2,1,0});
        System.out.println(Arrays.toString(array5));
    }
}
