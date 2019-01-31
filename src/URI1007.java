import java.util.Scanner;

public class URI1007 {

    public static void main(String[] args) {
        int a, b, c, d, diferenca;

        Scanner leia = new Scanner(System.in);
        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        d = leia.nextInt();

        diferenca = ( ( a * b ) - ( c * d ));

        System.out.println("DIFERENCA = " + diferenca);

    }

}
