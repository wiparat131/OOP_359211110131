package oop_lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1.ชื่อ-สกุล
//2.รหัสนักศึกษา
//3.สาขาที่เรียน และคณะ
//4.ที่อยู่
//5.email
public abstract class StudentData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        getName();
    }//main

    public static void getName() {
        System.out.println("Wiparat Seesatja ");
        IDName();
    }

    private static void IDName() {
        System.out.println("359211110131");
    }
}


