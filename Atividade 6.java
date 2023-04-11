import java.util.Scanner;
class Atividade6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um primeiro número: ");
        double a = teclado.nextDouble();

        System.out.print("Digite um segundo número: ");
        double b = teclado.nextDouble();

        System.out.print("Digite um terceiro número: ");
        double c = teclado.nextDouble();

        System.out.print("Os números em ordem crescente são: ");

        if (a <= b && a <= c) {
            if (b <= c) {
               System.out.println(a + ", " + b + ", " + c);
            } else {
               System.out.println(a + ", " + c + ", " + b);
            }
         } else if (b <= a && b <= c) {
            if (a <= c) {
               System.out.println(b + ", " + a + ", " + c);
            } else {
               System.out.println(b + ", " + c + ", " + a);
            }
         } else {
            if (a <= b) {
               System.out.println(c + ", " + a + ", " + b);
            } else {
               System.out.println(c + ", " + b + ", " + a);
            }

        teclado.close();
         }
    }    
}
