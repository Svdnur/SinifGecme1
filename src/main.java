import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int mat, turk, fizik, kimya, muzik, toplam = 0;
        double avarage = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz :");
        mat = inp.nextInt();

        if (!(100 < mat && mat < 0))
            toplam += mat;

        System.out.println("Türkçe notunu giriniz:");
        turk = inp.nextInt();

        if (!(100 > turk && turk > 0))

            toplam += turk;

        System.out.println("Fizik notunu giriniz :");
        fizik = inp.nextInt();

        if (!(100 > fizik && fizik > 0))

            toplam += fizik;


        System.out.println("Kimya notunu giriniz :");
        kimya = inp.nextInt();

        if (!(100 > kimya && kimya > 0))

            toplam += kimya;

        System.out.println("Müzik notunu giriniz :");
        muzik = inp.nextInt();

        if (!(100 > muzik && muzik > 0))

            toplam += muzik;

        avarage = toplam / 5;


        System.out.println("Ortalamanız :" + avarage);

        if (avarage >= 55) {

            System.out.println("Tebrikler, sınıfı geçtiniz!");

        } else {

            System.out.println("Maalesef sınıfta kaldınız,seneye görüşmek üzere !");
        }

    }
}
