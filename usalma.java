import java.util.Scanner;

public class usalma {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("üssü alınacak sayı: ");
        int n = input.nextInt();

        System.out.print("üs olacak sayı: ");
        int k = input.nextInt();
        int total=1;
        for(int a=1; a<=k; a++){

            total *=n;

        }System.out.print("sonuç= "+total);


    }}








//www.patika.dev



































































