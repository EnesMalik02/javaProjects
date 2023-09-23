package notOrtalamasiHesaplama;
import java.util.Scanner;


public class notOrtalamasi {
    public static void main(String[] args){
        //Değişkenleri ekle
        int mat, fizik, kimya, turkce, tarih;

        Scanner input = new Scanner(System.in);

        //Kullanıcı değerini al

        System.out.println("Mat notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.println("Fizik notunuz giriniz : ");
        fizik = input.nextInt();

        System.out.println("kimya notunuzu girniz : ");
        kimya = input.nextInt();

        System.out.println("turkce notunuzu girniz : ");
        turkce = input.nextInt();

        System.out.println("tarih notunuzu girniz : ");
        tarih = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih);

        double sonuc = (toplam/5);

        System.out.println("Ortalamanız : " + sonuc);

    }
}
