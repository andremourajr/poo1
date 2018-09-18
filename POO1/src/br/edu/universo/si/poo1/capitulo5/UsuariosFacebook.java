package br.edu.universo.si.poo1.capitulo5;

/**
 * Exercício 5.33 do Deitel, 10 Edição
 * @author andremourajr
 */
public class UsuariosFacebook {
    public static void main(String[] args) {
        // taxa de 4% ao mês.
        // Out/2012 -> 1.000.000.000 de usuários
        // Quantos meses para 1.5B?
        // Quantos meses para 2B?
        double quantUsuariosAtual = 1000000000;
        double taxaCrescimento = 0.04;
        double quantidade = quantUsuariosAtual;
        int mes = 1;
        int meses1500m = 0;
        int meses2000m = 0;
        
        while (quantidade < 2000000000) {
            quantidade = quantUsuariosAtual * Math.pow(1.0 + taxaCrescimento, mes);
            System.out.printf("%4d%,20.2f%n", mes, quantidade);
            if (meses1500m == 0 && quantidade >= 1500000000) {
                meses1500m = mes;
            }
            if (meses2000m == 0 && quantidade >= 2000000000) {
                meses2000m = mes;
            }
            
            mes++;
        }
        
        System.out.printf("São necessários %d meses para chegar a 1.5 bilhão de usuários.%n", meses1500m);
        System.out.printf("São necessários %d meses para chegar a 2 bilhões de usuários.%n", meses2000m);
    }
}
