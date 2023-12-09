package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double media = 0;

        Aluno aluno = new Aluno();
        System.out.print("Quantos alunos serao digitados: ");
        int n = ler.nextInt();
        Aluno[] vetAlnuno = new Aluno[n];

        for (int i = 0; i < n; i++ ){
            ler.nextLine();
            System.out.print("Nome: ");
            String nome = ler.nextLine();

            System.out.print("Nota do 1 semestre: ");
            double b1 = ler.nextDouble();

            System.out.print("Nota do 2 semestre: ");
            double b2 = ler.nextDouble();

            vetAlnuno[i] = new Aluno(nome, b1, b2);

        }

        for (int i = 0; i < n; i++ ){
            media = aluno.mediaAlunos(vetAlnuno[i].getB1(), vetAlnuno[i].getB2());
           // media = (vetAlnuno[i].getB1() + vetAlnuno[i].getB2()) / 2;
            if ( media >= 6){
                System.out.println("Aluno Aprovado");
                System.out.println(vetAlnuno[i].getNome());
            }

        }


        ler.close();
    }
}
