import java.util.Scanner;
class Atividade1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um primeiro número: ");
        double numero1 = teclado.nextDouble();
        System.out.print("Digite um segundo número: ");
        double numero2 = teclado.nextDouble();

        if (numero1 > numero2) {
            System.out.printf("O número %.0f é maior que o número %.0f", numero1, numero2);
        } if (numero2 > numero1) {
            System.out.printf("O número %.0f é maior que o número %.0f", numero2, numero1);
        } else {
            System.out.println("O número são iguais.");
        }
        teclado.close();
    }
}