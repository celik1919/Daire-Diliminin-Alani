import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r,pi=3.14,dilimAcisi,alan,dilimAlani;
        Scanner mec = new Scanner(System.in);

        System.out.print("Dairenin Yarı Çapını Giriniz: ");
        r = mec.nextDouble();
        System.out.print("Daire Diliminin Açısını Giriniz: ");
        dilimAcisi=mec.nextDouble();

        alan = pi*r*r;
        dilimAlani=alan*(dilimAcisi/360);

        System.out.println("Daire Diliminin Alanı: " + dilimAlani);
    }
}