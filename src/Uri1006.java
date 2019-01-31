import java.util.Scanner;

public class Uri1006 {

    public static void main(String[] args) {
        //double A, B, C, MEDIA;

        Scanner leia = new Scanner(System.in);

       double a = Double.parseDouble(leia.nextLine());
       double b = Double.parseDouble(leia.nextLine());
       double c = Double.parseDouble(leia.nextLine());

       double media = ( ( a * 2 ) + ( b * 3 ) + (c * 5 )) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

    }
}
