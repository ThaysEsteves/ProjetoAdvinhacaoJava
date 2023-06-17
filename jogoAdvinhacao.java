import java.util.Random;
import java.util.Scanner;

public class jogoAdvinhacao {

    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner ler = new Scanner(System.in);

        for (int tentativas = 0; tentativas < 5 ; tentativas++) {

            System.out.println("Chute um numero de 0 a 100:");
            int chute = Integer.parseInt(ler.nextLine());
            if (numeroAleatorio == chute) {
                System.out.println("parábens, você acertou, o numero era "+ numeroAleatorio);
                break;
            }if ( numeroAleatorio > chute) {
                System.out.println("Seu chute foi baixo!");
            }if (numeroAleatorio < chute){
                System.out.println("seu chute foi alto!");
            }
        }
        System.out.println("Você errou tente novamente! O numero era: "+ numeroAleatorio);
    }
}
