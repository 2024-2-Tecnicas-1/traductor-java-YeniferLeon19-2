package com.mycompany.traductorjava;

import java.util.HashMap;
import java.util.Scanner;

public class TraductorJava{
    public static void main(String[] args) {
        // Diccionario de números en español
        HashMap<Integer, String> nEspañol = new HashMap<>();
        nEspañol.put(0, "cero");
        nEspañol.put(1, "uno");
        nEspañol.put(2, "dos");
        nEspañol.put(3, "tres");
        nEspañol.put(4, "cuatro");
        nEspañol.put(5, "cinco");
        nEspañol.put(6, "seis");
        nEspañol.put(7, "siete");
        nEspañol.put(8, "ocho");
        nEspañol.put(9, "nueve");
        nEspañol.put(10, "diez");
        nEspañol.put(20, "veinte");
        
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(20 + i, "veinti" + nEspañol.get(i));
        }
        
        nEspañol.put(30, "treinta");
        nEspañol.put(40, "cuarenta");
        nEspañol.put(50, "cincuenta");
        nEspañol.put(60, "sesenta");
        nEspañol.put(70, "setenta");
        nEspañol.put(80, "ochenta");
        nEspañol.put(90, "noventa");

        // Rellenar decenas con 'y' y la unidad en español
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(30 + i, "treinta y " + nEspañol.get(i));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(40 + i, "cuarenta y " + nEspañol.get(i));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(50 + i, "cincuenta y " + nEspañol.get(i));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(60 + i, "sesenta y " + nEspañol.get(i));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(70 + i, "setenta y " + nEspañol.get(i));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(80 + i, "ochenta y " + nEspañol.get(i));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(90 + i, "noventa y " + nEspañol.get(i));
        }
        
        nEspañol.put(100, "cien");
        nEspañol.put(110, "ciento diez");
        nEspañol.put(120, "ciento veinte");
        nEspañol.put(130, "treinta");
        nEspañol.put(140, "cuarenta");
        nEspañol.put(150, "cincuenta");
        nEspañol.put(160, "sesenta");
        nEspañol.put(170, "setenta");
        nEspañol.put(180, "ochenta");
        nEspañol.put(190, "noventa");
        for (int i = 1; i<=9; i++){
            nEspañol.put(100 + i, "ciento " + nEspañol.get(i));
        }
         for (int i = 1; i<=9; i++){
            nEspañol.put(110 + i, "ciento " + nEspañol.get(i+10));
        }
         for (int i = 1; i<=9; i++){
            nEspañol.put(120 + i, "ciento " + nEspañol.get(i+20));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(130 + i, "treinta y " + nEspañol.get(i+30));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(140 + i, "cuarenta y " + nEspañol.get(i+40));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(150 + i, "cincuenta y " + nEspañol.get(i+50));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(160 + i, "sesenta y " + nEspañol.get(i+60));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(170 + i, "setenta y " + nEspañol.get(i+70));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(180 + i, "ochenta y " + nEspañol.get(i+80));
        }
        for (int i = 1; i <= 9; i++) {
            nEspañol.put(190 + i, "noventa y " + nEspañol.get(i+90));
        }
        nEspañol.put(200,"Doscientos");
    
        
        // Diccionario de números en inglés
        HashMap<Integer, String> nEnglish = new HashMap<>();
        nEnglish.put(0, "zero");
        nEnglish.put(1, "one");
        nEnglish.put(2, "two");
        nEnglish.put(3, "three");
        nEnglish.put(4, "four");
        nEnglish.put(5, "five");
        nEnglish.put(6, "six");
        nEnglish.put(7, "seven");
        nEnglish.put(8, "eight");
        nEnglish.put(9, "nine");
        nEnglish.put(10, "ten");
        nEnglish.put(20, "twenty");
        nEnglish.put(30, "thirty");
        nEnglish.put(40, "forty");
        nEnglish.put(50, "fifty");
        nEnglish.put(60, "sixty");
        nEnglish.put(70, "seventy");
        nEnglish.put(80, "eighty");
        nEnglish.put(90, "ninety");

        // Rellenar decenas con '-' y la unidad en inglés
        for (int i = 1; i <= 9; i++) {
            nEnglish.put(20 + i, "twenty-" + nEnglish.get(i));
        }
        for (int i = 1; i <= 9; i++) {
            nEnglish.put(30 + i, "thirty-" + nEnglish.get(i));
        }
        for (int i = 1; i <= 9; i++) {
            nEnglish.put(40 + i, "forty-" + nEnglish.get(i));
        }
        for (int i = 1; i <= 9; i++) {
            nEnglish.put(50 + i, "fifty-" + nEnglish.get(i));
        }
            for (int i = 1; i <= 9; i++) {
            nEnglish.put(60 + i, "sixty-" + nEnglish.get(i));
            }
            for (int i = 1; i <= 9; i++) {
            nEnglish.put(70 + i, "seventy-" + nEnglish.get(i));
            }
            for (int i = 1; i <= 9; i++) {
            nEnglish.put(80 + i, "eighty-" + nEnglish.get(i));
            }
            for (int i = 1; i <= 9; i++) {
            nEnglish.put(90 + i, "ninety-" + nEnglish.get(i));
        }
        
            nEnglish.put(100, "one hundred");
            nEnglish.put(110, "one hundred ten");
            nEnglish.put(120, "one hundred twenty");
            nEnglish.put(130, "one hundred thirty");
            nEnglish.put(140, "one hundred forty");
            nEnglish.put(150, "one hundred fifty");
            nEnglish.put(160, "one hundred sixty");
            nEnglish.put(170, "one hundred seventy");
            nEnglish.put(180, "one hundred eighty");
            nEnglish.put(190, "one hundred ninety");
            nEnglish.put(200, "one hundred two hundred");
            
        for (int i = 1; i <= 9; i++){
            nEnglish.put(100 + i, "one hundred " + nEnglish.get(i));
        } 
        for (int i = 1; i <= 9; i++){
            nEnglish.put(110 + i, "one hundred ten" + nEnglish.get(i+10));
        } 
        for (int i = 1; i <= 9; i++) {
            nEnglish.put(120 + i, "one hundred twenty-" + nEnglish.get(i+20));
        }
        for (int i = 1; i <= 9; i++) {
            nEnglish.put(130 + i, "one hundred thirty-" + nEnglish.get(i+30));
        }
        for (int i = 1; i <= 9; i++) {
            nEnglish.put(140 + i, "one hundred forty-" + nEnglish.get(i+40));
        }
        for (int i = 1; i <= 9; i++) {
            nEnglish.put(150 + i, "one hundred fifty-" + nEnglish.get(i)+50);
        }
            for (int i = 1; i <= 9; i++) {
            nEnglish.put(160 + i, "one hundred sixty-" + nEnglish.get(i+60));
            }
            for (int i = 1; i <= 9; i++) {
            nEnglish.put(170 + i, "one hundred seventy-" + nEnglish.get(i+70));
            }
            for (int i = 1; i <= 9; i++) {
            nEnglish.put(180 + i, "one hundred eighty-" + nEnglish.get(i+80));
            }
            for (int i = 1; i <= 9; i++) {
            nEnglish.put(190 + i, "one hundred ninety-" + nEnglish.get(i+90));
        }

        // Pedir los números por consola
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String[] numbers = input.split(",");
        int num1 = Integer.parseInt(numbers[0].trim());
        int num2 = Integer.parseInt(numbers[1].trim());

        if (num1 <= 100 && num2 <= 100) {
            int suma = num1 + num2;

            String fraseEspanol = "La suma de " + nEspañol.get(num1) + " más " + nEspañol.get(num2) + " es " + nEspañol.get(suma);
            String fraseIngles = "The sum of " + nEnglish.get(num1) + " plus " + nEnglish.get(num2) + " is " + nEnglish.get(suma);

            System.out.println(fraseEspanol);
            System.out.println(fraseIngles);
        } else {
            System.out.println("Los números ingresados deben estar entre 0 y 100.");
        }
    }
}
