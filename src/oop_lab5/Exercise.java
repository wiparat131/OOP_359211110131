package oop_lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//เขียนโปรแกรมรับค่าจำนวนเต็มจากผู้ใช้ 20 คน จากนั้นหาข้อมูลดังต่อไปนี้
//1.ผลรวมของข้อมูล
//2.ค่าเฉลี่ย
//3.ค่ามากที่สุด
//4.ค่าน้อยที่สุด
//5.แสดงข้อมูลโดยการเรียงจากน้อยไปมาก
//6.แสดงผลข้อมูลโดยการเรียงจากมากไปน้อย

public class Exercise {
        private static int MAX = 20;
    public static void main(String[] args) {
        Integer[] num = new Integer[MAX];
        num = inputData(num);
        showData(num);
        num = sortData(num);
    }//main
    private static Integer[] sortData(Integer[] num) {
        Arrays.sort(num);
        return num;
    }
    private static void showData(Integer[] num) {
        System.out.println("Data in array: ");
        for(int val: num)
            System.out.print(val+" ");
        System.out.println();
    }
    private static Integer[] inputData(Integer[] num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        for(int i=0;i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[i] = scanner.nextInt();
        }
        return num;
    }

}//class
