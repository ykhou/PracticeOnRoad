package com.kang.spring.meituan;

/**
 * 有一个有序的整数的数组a[1,3,5,6,7,8,9,11,13]
 * 然后在数组的某个位置上发生了旋转，就变成了
 * a[11,13,1,3,5,6,7,8,9]
 * 或者是变成了a[3,5,6,7,8,9,11,13,1]
 * 给定一个整数target判断是否在旋转后的数组中存在，如果存在就返回下标，如果不存在就返回-1。
 * */
public class Main {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        System.out.println("Hello World!");
    }

    static int findTarget(int[] arr, int target) {
        // 分割点
        int split = binSearch(arr);
        // 查找target
        int index1 = targetBinSerach(arr, target, 0, split);
        int index2 = targetBinSerach(arr, target, split + 1, arr.length - 1);
        return index1 > index2 ? index1 : index2;
    }

    static int binSearch(int[] arr) {
        int left = 0, right = arr.length;
        int midlle = (left + right) / 2;
        while (right > left) {
            if (arr[midlle] > arr[right]) {
                left = midlle;
            } else {
                right = midlle;
            }
        }
        return left;
    }

    static int targetBinSerach(int[] arr, int target, int left, int right) {
        // int left = left, right = right;
        int middle = (left + right) / 2;
        while (right > left) {
            if (middle > target) {
                right = middle - 1;
            } else if (middle < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}