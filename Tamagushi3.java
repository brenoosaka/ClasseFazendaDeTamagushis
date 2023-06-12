public class Tamagushi3 {
    private String nome;
    private int fome;
    private int saude;
    private int idade;
    private int tedio;

    public Tamagushi3(String nome, int fome, int saude, int idade, int tedio) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
        this.tedio = tedio;
    }

    public String retornarHumor() {
        int humor = fome + saude - tedio;
        if (humor < 5) {
            return "Triste";
        } else if (humor < 8) {
            return "Neutro";
        } else {
            return "Feliz";
        }
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarFome(int fome) {
        this.fome = fome;
    }

    public void alterarSaude(int saude) {
        this.saude = saude;
    }

    public void alterarIdade(int idade) {
        this.idade = idade;
    }

    public void alterarTedio(int tedio) {
        this.tedio = tedio;
    }

    public void fornecerComida(int quantidade) {
        fome -= quantidade;
        if (fome < 0) {
            fome = 0;
        }
    }

    public void brincar(int duracao) {
        tedio -= duracao;
        if (tedio < 0) {
            tedio = 0;
        }
    }

    public String retornarNome() {
        return nome;
    }

    public int retornarFome() {
        return fome;
    }

    public int retornarSaude() {
        return saude;
    }

    public int retornarIdade() {
        return idade;
    }

    public int retornarTedio() {
        return tedio;
    }

}