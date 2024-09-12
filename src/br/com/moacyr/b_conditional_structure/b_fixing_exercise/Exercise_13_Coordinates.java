package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_13_Coordinates {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Valor de x: ");
        x = sc.nextDouble();

        System.out.print("Valor de y: ");
        y = sc.nextDouble();

        if (x > 0 && y > 0){

            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {

            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {

            System.out.println("Q3");
        }
        else if (x > 0 && y < 0) {

            System.out.println("Q4");
        }
        else if (x > 0 && y == 0) {

            System.out.println("Eixo x");
        }
        else if (x == 0 && y > 0) {

            System.out.println("Eixo y");
        }
        else{
            System.out.println("Origem");
        }
        sc.close();
    }
}