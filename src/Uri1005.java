import java.util.Scanner;

public class Uri1005 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double a = leia.nextDouble();
        double b = leia.nextDouble();

        double media = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.printf("MEDIA = %.5f\n", media);
    }

}
