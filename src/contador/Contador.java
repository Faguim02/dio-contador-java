package contador;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (InputMismatchException err){
            System.out.println("Erro na execução do programa");
        }
    }
    static void contar(int parametroUm, int parametroDois ) {
        if(parametroDois < parametroUm){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        else {
            int numbersFull = parametroDois - parametroUm;

            for (int numberActual = 1; numberActual <= numbersFull; numberActual++){
                System.out.println("Imprimindo o número " + numberActual);
            }
        }

    }
}
