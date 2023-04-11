import java.util.Scanner;
class Atividade2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número qualquer: ");
        double numero = teclado.nextDouble();
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0){
            System.out.println("O número é negativo.");
        }
        teclado.close();
    }
}
