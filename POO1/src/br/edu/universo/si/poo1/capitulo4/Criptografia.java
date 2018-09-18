package br.edu.universo.si.poo1.capitulo4;

import java.util.Scanner;

/**
 * Exercício 4.38 do Deitel, 10 Edição
 * @author andremourajr
 */
public class Criptografia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.print("Informe um número inteiro de quatro dígitos para ser criptografado: ");
            num = entrada.nextInt();
        } while (num < 1000 || num > 9999);
        int numCriptografado = criptografar(num);
        System.out.printf("Número criptografado: %d%n", numCriptografado);
        int numDecriptografado = decriptografar(numCriptografado);
        System.out.printf("Número decriptografado: %d%n", numDecriptografado);
    }
    
    public static int criptografar(int num) {
        // Separa os dígitos do número
        int d1 = num / 1000;
        int d2 = num % 1000 / 100;
        int d3 = num % 100 / 10;
        int d4 = num % 10;
        
        // Criptografa cada dígito
        int d1Criptografado = (d1 + 7) % 10;
        int d2Criptografado = (d2 + 7) % 10;
        int d3Criptografado = (d3 + 7) % 10;
        int d4Criptografado = (d4 + 7) % 10;
        
        /*System.out.printf("d1: %d, d2: %d, d3: %d, d4: %d%n", d1, d2, d3, d4);
        System.out.printf("d1: %d, d2: %d, d3: %d, d4: %d%n", d1Criptografado, 
                d2Criptografado, d3Criptografado, d4Criptografado);*/
        
        // Concatena os dígitos trocando o 1 com 3 e o 2 com 4.
        int numCriptografado = d3Criptografado * 1000 + d4Criptografado * 100 +
                d1Criptografado * 10 + d2Criptografado;
        
        return numCriptografado;
    }
    
    public static int decriptografar(int num) {
        // Separa os dígitos do número já trocando 1 com 3 e 2 com 4.
        int d3 = num / 1000;
        int d4 = num % 1000 / 100;
        int d1 = num % 100 / 10;
        int d2 = num % 10;
        
        // Decriptografa cada dígito
        int d1Decriptografado = (d1 + 10 - 7) % 10;
        int d2Decriptografado = (d2 + 10 - 7) % 10;
        int d3Decriptografado = (d3 + 10 - 7) % 10;
        int d4Decriptografado = (d4 + 10 - 7) % 10;
        
        System.out.printf("d1: %d, d2: %d, d3: %d, d4: %d%n", d1, d2, d3, d4);
        System.out.printf("d1: %d, d2: %d, d3: %d, d4: %d%n", d1Decriptografado, 
                d2Decriptografado, d3Decriptografado, d4Decriptografado);
        
        return (d1Decriptografado * 1000) + (d2Decriptografado * 100) +
                (d3Decriptografado * 10) + d4Decriptografado;
    }
}
