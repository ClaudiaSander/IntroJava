// 1 - Pacote
package intro;

// 2 - Referência às bibliotecas

import java.util.Arrays;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        System.out.println("Cálculo de áreas");

        calcularAreaModoExtenso();
        calcularAreaModoCompacto();
    }

    public static void calcularAreaModoExtenso() {
        // cálculo de área. Ex: tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 5
        comprimento = 6;
        resultado = largura * comprimento;
        System.out.println("Para largura de " + largura + "m e comprimento de " + comprimento + "m, a área é de " + resultado + "m²");

    }

    public static void calcularAreaModoCompacto() {
        int largura = 4;
        int comprimento = 3;// cálculo de área reduzido
        System.out.println("Para largura de " + largura + "m e comprimento de " + comprimento + "m, a área é de " + largura * comprimento + "m²");
    }

}
