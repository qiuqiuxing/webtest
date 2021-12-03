package com.example.interview;

import java.util.Scanner;

public class ZhiShu {
    public static void main(String[] args) {
        //3、请使用代码输出小于指定数字的所有质数（质数指只能被自身以及1整除的大于1的数）
        //示例：输入10
        // 输出 2357
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int a = scanner.nextInt();
        test(a);
    }

    public static void test(int num) {
        if (num > 1) {
            for (int i = 2; i <= num; i++) {
                if (isZhiShu(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    private static boolean isZhiShu(int num) {
        if (num == 2) {
            return true;
        }
        if (num %2 == 0) {
            return false;
        }
        for(int j=2;j <= num/2;j++){
            if (num % j== 0) {
                return false;
            }
        }
        return true;
    }

}