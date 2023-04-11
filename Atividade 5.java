import java.util.Scanner;
class Atividade5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe sua nota na primeira prova: ");
        double n1 = teclado.nextDouble();

        System.out.print("Informe sua nota na segunda prova: ");
        double n2 = teclado.nextDouble();

        double medianota = (n1 + n2) / 2;

        if (medianota >= 7 && medianota < 10) {
            System.out.println("Aprovado.");
        } else if (medianota < 7) {
            System.out.println("Reprovado.");
        } else if (medianota == 10) {
            System.out.println("Aprovado com distinção.");
        }

        teclado.close();
    }
}