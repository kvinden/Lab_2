package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diapason = 100;
        int number = (int) (Math.random() * 100);
        while (true) {
            System.out.println("�������� ����� �� ���� �� " + diapason);
            int try_number = scan.nextInt();
            if (try_number == number) {
                System.out.println("��� ���������� �����.");
                break;
            } else if (try_number > number) {
                System.out.println("����� ������");
            } else {
                System.out.println("����� ������");
            }
        }
    }
}

