package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Tao va khai bao mang
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang : ");
        int N = scanner.nextInt();
        int Array[] = new int[N];
        for (int i = 0; i < Array.length; i++) {
            System.out.print("Nhap phan tu " + (i + 1) + ": ");
            Array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Cac phan tu trong mang : ", "");
        for (int j = 0; j < Array.length; j++) {
            System.out.print(Array[j] + "\t");
        }
        //Nhap va xoa phan tu X
        System.out.println("Nhap phan tu X can xoa");
        int X = scanner.nextInt();
        int index_del = 0;
        for (int i = 0; i < Array.length; i++) {

            if (Array[i] == X) {
                index_del = i;
            }
        }
        int newArray[] = new int[N - 1];
        for (int i = 0; i < index_del; i++) {
            newArray[i] = Array[i];
        }
        for (int i = index_del; i < Array.length - 1; i++) {
            newArray[i] = Array[i + 1];
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j] + "\t");
        }
    }
}
