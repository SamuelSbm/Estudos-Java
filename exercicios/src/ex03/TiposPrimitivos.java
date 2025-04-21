package ex03;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = input.nextFloat();

        System.out.println(" A nota do aluno é " + nota);
        System.out.printf(" A nota de %s é %.0f \n", nome, nota);       // 3 variações de impressão de dados
        System.out.format(" A nota de %s é %.1f \n", nome, nota);
    }
}
