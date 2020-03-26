package paixu;

import java.util.Arrays;

public class Sort {
    //冒泡排序
    //从前往后  两个两个元素进行比较
    //如果当前元素比之后的元素大
    //则交换
    public int[] maopaoSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {//外层循环控制轮次
            for (int j = 0; j < array.length - 1; j++) {//内层循环控制每一论比较的次数
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

//选择排序
    //最小元素(初始元素）与后面元素依次比较,如果后面的比最小的小则更换最小元素
    //当一轮循环结束后找到最终最小元素，然后交换

    public int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int Min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < Min) {
                    Min = array[j];
                }
                int temp = array[i];
                array[i] = Min;
                array[j] = temp;
            }
        }
        return array;
    }


    //插入排序
    //从一推无序的元素中（后半部分）找一个出来
    //插入到前面有序的序列中
    public int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    //希尔排序
    public int[] shellSort(int[] array) {
        int group = array.length / 2;
        while (group > 0) {
            for (int i = group; i < array.length; i++) {
                for (int j = i - group; j >= 0; j -= group) {
                    if (array[j + group] < array[j]) {
                        int temp = array[j + group];
                        array[j + group] = array[j];
                        array[j] = temp;
                    }
                }
            }
            group = group / 2;
        }
        return array;
    }


    //归并排序
    //先设计一个方法 将两个数组合并

    public int[] merge(int[] left, int[] right) {
        //创建一个新数组
        int[] result = new int[left.length + right.length];
        //2.需要将新数组的每一个位置填满 需要循环
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            //index控制新数组的索引
            //i控制left数组的索引变化，j控制right数组的索引变化
            if (i >= left.length) {//当i超过left素组的索引时，说明left数组没有可以排序的元素了
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] <= right[j]) {
                result[index] = left[i++];
            } else {
                result[index] = right[j++];
            }
        }
        return result;
    }
    public int[] mergeSort(int array[]){
        while (array.length<2) {//当数组只有一个元素时就行了
            return array;
        }
            int mid = array.length >> 1;
            //找到数组的中间位置，将数组一分为二，
            int[] left = Arrays.copyOfRange(array, 0, mid);//将指定数组的指定范围复制到新数组中
            int[] right = Arrays.copyOfRange(array, mid, array.length);
            //递归将left和right分成最小
            int[] a = this.mergeSort(left);
            int[] b = this.mergeSort(right);

            //最终直到不能再分，用上面的方法合并排序
            return this.merge(a, b);

    }

    //递归版
    public static int[] merge_sort_recursive(int[] arr,int[] result,int start,int end){
    	if (start >= end)
            return arr;
    int len = end - start, mid = (len >> 1) + start;
    int start1 = start, end1 = mid;
    int start2 = mid + 1, end2 = end;
    merge_sort_recursive(arr, result, start1, end1);
    merge_sort_recursive(arr, result, start2, end2);
    int k = start;
	while (start1 <= end1 && start2 <= end2)
    result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
	while (start1 <= end1)
    result[k++] = arr[start1++];
	while (start2 <= end2)
    result[k++] = arr[start2++];
	for (k = start; k <= end; k++)
    arr[k] = result[k];
       return result;
}
    public static int[] merge_sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        return merge_sort_recursive(arr, result, 0, len - 1);
    }
    //迭代版
    public static void merge_sort1(int[] arr) {
        int[] orderedArr = new int[arr.length];
        for (int i = 2; i < arr.length * 2; i *= 2) {
            for (int j = 0; j < (arr.length + i - 1) / i; j++) {
                int left = i * j;
                int mid = left + i / 2 >= arr.length ? (arr.length - 1) : (left + i / 2);
                int right = i * (j + 1) - 1 >= arr.length ? (arr.length - 1) : (i * (j + 1) - 1);
                int start = left, l = left, m = mid;
                while (l < mid && m <= right) {
                    if (arr[l] < arr[m]) {
                        orderedArr[start++] = arr[l++];
                    } else {
                        orderedArr[start++] = arr[m++];
                    }
                }
                while (l < mid)
                    orderedArr[start++] = arr[l++];
                while (m <= right)
                    orderedArr[start++] = arr[m++];
                System.arraycopy(orderedArr, left, arr, left, right - left + 1);
            }
        }
    }


    //二分法查找元素位置

    public static void main(String[] args) {
        int[] arr = {30, 20, 50, 10};
        Arrays.sort(arr);//二分查找之前，一定要对数组进行排序

        System.out.println(Arrays.toString(arr));
        System.out.println(myBinarySearch(arr,10));
    }

    public static int myBinarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high)/2;

            if (value == arr[mid]) {
                return mid;
            }else if(value < arr[mid]) {
                high = mid - 1;
            }else{
                low = mid +1;
            }
        }
        return -1;
    }

}
