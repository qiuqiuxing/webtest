package com.example.interview;

import java.util.Arrays;
import java.util.Scanner;

public class BaoShu {
    // n个人围成一圈，从第一个人开始123报数，报到3的离开，问最后剩下的人是第几个？
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入总人数：");
        int n = scanner.nextInt();
        boolean[] per = new boolean[n];
        for (int i = 0; i < per.length; i++) {
            per[i] = true;
        }
        /**** 报号 ***/
        test(per);
        /***** 结果 *****/
        System.out.println("最后的情况：" + Arrays.toString(per));
        for (int i = 0; i < per.length; i++) {
            if (per[i] == true) {
                int num=i+1;
                System.out.println("最终留下来的是原来的几号："+num);
                System.out.println("原来喊的数：" + (i + 1) % 3);
            }
        }
    }

    public static void test(boolean[] per) {
        int t = 0; int n =per.length;
        while (n > 1) {
            for (int i = 0; i <per.length; i++) {
                if (per[i]) {
                    t++;
                    if (t == 3) {
                        t = 0;
                        per[i] = false;
                        n--;
                    }

                }
            }
        }

    }
}
