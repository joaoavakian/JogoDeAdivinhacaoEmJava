import java.util.Random;

class JogoAdivinhacao {
    private final int numeroAleatorio;
    private final int MAX_TENTATIVAS;

    public JogoAdivinhacao(int maxTentativas) {
        this.numeroAleatorio = gerarNumeroAleatorio();
        this.MAX_TENTATIVAS = maxTentativas;
    }

    private int gerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(101); // Número entre 0 e 100
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public int getMaxTentativas() {
        return MAX_TENTATIVAS;
    }
}
