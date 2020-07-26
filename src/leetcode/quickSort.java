package leetcode;

import java.util.HashMap;

public class quickSort {
    public static void quickSort(int arr[], int Lside, int Rside) {
        int left = Lside;
        int right = Rside;
        int temp = 0;
        if (left <= right) {   //待排序的元素至少有两个的情况
            temp = arr[left];  //待排序的第一个元素作为基准元素
            while (left != right) {   //从左右两边交替扫描，直到left = right
                while (right > left && arr[right] >= temp)
                    right--;        //从右往左扫描，找到第一个比基准元素小的元素
                arr[left] = arr[right];  //找到这种元素arr[right]后与arr[left]交换

                while (left < right && arr[left] <= temp)
                    left++;         //从左往右扫描，找到第一个比基准元素大的元素
                arr[right] = arr[left];  //找到这种元素arr[left]后，与arr[right]交换
            }
            arr[right] = temp;    //基准元素归位
            quickSort(arr, Lside, left - 1);  //对基准元素左边的元素进行递归排序
            quickSort(arr, right + 1, Rside);  //对基准元素右边的进行递归排序
        }
    }

    public static void quickSort2(int arr[], int Lside, int Rside) {
        int left = Lside;
        int right = Rside;
        int temp = 0;
        if (left <= right) {
            temp = arr[left];
            while (left != right) {
                while (arr[right] >= temp && right > left) {
                    right--;
                }
                arr[left] = arr[right];
                while (arr[left] <= temp && left < right) {
                    left++;
                }
                arr[right] = arr[left];
            }
            arr[right] = temp;
            new HashMap<>();
            quickSort2(arr, Lside, left - 1);
            quickSort2(arr, right + 1, Rside);
        }
    }


    public static void main(String[] args) {
        int array[] = {10, 5, 3, 1, 7, 2, 8};
        System.out.println("排序之前：");
        for (int element : array) {
            System.out.print(element + " ");
        }

        quickSort2(array, 0, array.length - 1);

        System.out.println("\n排序之后：");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

}
