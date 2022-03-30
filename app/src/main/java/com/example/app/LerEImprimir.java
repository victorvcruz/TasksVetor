package com.example.app;

import java.util.ArrayList;
import java.util.Scanner;

public class LerEImprimir {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        ArrayList<Integer> lista = new ArrayList<Integer>(size);
        for(int i=0;i<size;i++) {
            int number = input.nextInt();
            System.out.printf("%d " , number);
            lista.add(number);
        }

        input.close();

    }

}
