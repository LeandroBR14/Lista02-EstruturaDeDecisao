import java.util.Scanner;
class Atividade4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe uma letra: ");
        String letra = teclado.next();

        if (letra.equalsIgnoreCase("a")) {
            System.out.printf("Você digitou a letra: %s. Que é uma vogal.", letra);
        } else if (letra.equalsIgnoreCase("e")) {
            System.out.printf("Você digitou a letra: %s. Que é uma vogal.", letra);
        } else if (letra.equalsIgnoreCase("i")) {
            System.out.printf("Você digitou a letra: %s. Que é uma vogal.", letra);
        } else if (letra.equalsIgnoreCase("o")) {
            System.out.printf("Você digitou a letra: %s. Que é uma vogal.", letra);
        } else if (letra.equalsIgnoreCase("u")) {
            System.out.printf("Você digitou a letra: %s. Que é uma vogal.", letra);
        } else {
            System.out.printf("Você digitou a letra: %s. Que é uma consoante.", letra);
        }
        teclado.close();
    }
}