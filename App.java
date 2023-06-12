import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    // Testes
    public static void main(String[] args) {
        FazendaDeBichinhos fazenda = new FazendaDeBichinhos();

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int nivelFome = random.nextInt(5) + 1;
            int nivelSaude = random.nextInt(5) + 1;
            int nivelIdade = random.nextInt(10) + 1;
            int nivelTedio = random.nextInt(5) + 1;

            Tamagushi3 bichinho = new Tamagushi3("Bichinho" + (i + 1), nivelFome, nivelSaude, nivelIdade, nivelTedio);
            fazenda.adicionarBichinho(bichinho);
        }

        System.out.println("=== Fazenda de Bichinhos ===");
        System.out.println("Opções:");
        System.out.println("1. Alimentar todos os bichinhos");
        System.out.println("2. Brincar com todos os bichinhos");
        System.out.println("3. Ouvir todos os bichinhos");
        System.out.println("4. Sair");

        boolean sair = false;
        while (!sair) {
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(System.console().readLine());

            switch (opcao) {
                case 1:
                    fazenda.alimentarTodos();
                    fazenda.simularPassagemDeTempo();
                    System.out.println("Todos os bichinhos foram alimentados!");
                    break;
                case 2:
                    fazenda.brincarComTodos();
                    fazenda.simularPassagemDeTempo();
                    System.out.println("Todos os bichinhos brincaram!");
                    break;
                case 3:
                    fazenda.ouvirTodos();
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}