import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JogoAdivinhacao jogo = new JogoAdivinhacao(5);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");
        System.out.println("Você tem " + jogo.getMaxTentativas() + " tentativas.");

        boolean acertou = false;

        for (int tentativa = 1; tentativa <= jogo.getMaxTentativas(); tentativa++) {
            System.out.print("Tentativa " + tentativa + ": ");
            int palpite = scanner.nextInt();

            if (palpite == jogo.getNumeroAleatorio()) {
                System.out.println("Parabéns! Você acertou o número em " + tentativa + " tentativas!");
                acertou = true;
                break;
            } else if (palpite < jogo.getNumeroAleatorio()) {
                System.out.println("O número é maior que " + palpite + ".");
            } else {
                System.out.println("O número é menor que " + palpite + ".");
            }
        }

        if (!acertou) {
            System.out.println("Você perdeu! O número era: " + jogo.getNumeroAleatorio());
        }

        scanner.close();
    }
}
