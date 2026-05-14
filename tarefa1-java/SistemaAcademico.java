import java.util.Locale;
import java.util.Scanner;

public class SistemaAcademico {
    public static void main(String[] args) {
        // O "try" aqui garante que o Scanner seja fechado automaticamente
        try (Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {
            
            // Loop para ler 5 alunos [cite: 56]
            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o nome do aluno " + i + ": ");
                String nome = sc.nextLine();

                // Lógica para ler 3 notas [cite: 57]
                double soma = 0;
                for (int j = 1; j <= 3; j++) {
                    System.out.print("Digite a nota " + j + " do aluno " + nome + ": ");
                    soma += sc.nextDouble();
                }
                sc.nextLine(); // Limpeza de buffer

                // Cálculo da média [cite: 58]
                double media = soma / 3;

                // Determinação da situação [cite: 59, 60, 61, 62]
                String situacao;
                if (media >= 7.0) {
                    situacao = "APROVADO";
                } else if (media >= 5.0) {
                    situacao = "RECUPERAÇÃO";
                } else {
                    situacao = "REPROVADO";
                }

                // Exibição do relatório [cite: 63]
                System.out.println("--- RELATÓRIO ---");
                System.out.println("Aluno: " + nome);
                System.out.printf("Média: %.2f\n", media);
                System.out.println("Situação: " + situacao);
                System.out.println("-----------------\n");
            }
        } // O Scanner fecha aqui automaticamente
    }
}
