import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FazendaDeBichinhos {
    private List<Tamagushi3> bichinhos;

    public FazendaDeBichinhos() {
        bichinhos = new ArrayList<>();
    }

    public void adicionarBichinho(Tamagushi3 bichinho) {
        bichinhos.add(bichinho);
    }

    public void alimentarTodos() {
        for (Tamagushi3 bichinho : bichinhos) {
            bichinho.alterarFome(bichinho.retornarFome() - 2);
        }
    }

    public void brincarComTodos() {
        for (Tamagushi3 bichinho : bichinhos) {
            bichinho.alterarTedio(bichinho.retornarTedio() - 3);
        }
    }

    public void ouvirTodos() {
        for (Tamagushi3 bichinho : bichinhos) {
            System.out.println("Bichinho: " + bichinho.retornarNome() + " - Humor: " + bichinho.retornarHumor());
        }
    }

    public void simularPassagemDeTempo() {
        Random random = new Random();
        for (Tamagushi3 bichinho : bichinhos) {
            int incrementoFome = random.nextInt(3) + 1;
            int incrementoTedio = random.nextInt(3) + 1;

            bichinho.alterarFome(bichinho.retornarFome() + incrementoFome);
            bichinho.alterarSaude(bichinho.retornarSaude() - incrementoFome);
            bichinho.alterarIdade(bichinho.retornarIdade() + 1);
            bichinho.alterarTedio(bichinho.retornarTedio() + incrementoTedio);
        }
    }
}