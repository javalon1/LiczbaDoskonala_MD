package com.sda.algorytmy;


import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = scanner.nextInt();
        if(isPerfect(x) == true){
            System.out.println("Liczba " + x + " jest liczbą doskonałą." );
        } else {
            System.out.println("Liczba " + x + " nie jest liczbą doskonałą." );
        }
    }

    public static boolean isPerfect(int x){
        int divSum = 0;
        for(int i = 1; i <= x/2; i++){
            if(x % i == 0){
                divSum += i;
            }
        }
        return divSum == x;
    }
}



