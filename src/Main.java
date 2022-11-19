import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r,fn=1,fr=1,fnr=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinici Değeri giriniz: ");
        n = scan.nextInt();
        System.out.print("ikinci Değeri giriniz: ");
        r = scan.nextInt();

        if(n>r && n>0 && r>0) {

            for (int i = 1; i <= n; i++) {
                fn = fn * i;
            }
            for (int k = 1; k <= r; k++) {
                fr = fr * k;
            }
            for (int l = 1; n - r <= l; l++) {
                fnr = fnr * l;
            }

            double cnr = fn / (fr * fnr);
            System.out.print("C(" + n + "," + r + ")= " + cnr);
        }
        else{
            System.out.print("Yanlış dğer girdiniz!");
        }




    }
}