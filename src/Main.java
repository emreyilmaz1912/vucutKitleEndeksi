import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Vücut Kitle Endeksinizi öğrenmek için aşağıdaki bilgileri doldurunuz.");
        /* Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        Formül
        Kilo (kg) / Boy(m) * Boy(m) */

        double kg,m;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        m = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kg = inp.nextDouble();

        double vucutKitleEndeksi = kg / (m * m);
        // zayıf : <18,5 Normal : 18.5 - 24.9 Kilolu : 25 - 29.9 Obez: >30

        if(vucutKitleEndeksi <18.5)
        {
            System.out.printf("Vücut Kilo Endeksiniz :" + vucutKitleEndeksi + "%n");
            System.out.print("Zayıf");
        }
        else if(vucutKitleEndeksi >= 18.5 && vucutKitleEndeksi <25)
        {
            System.out.printf("Vücut Kilo Endeksiniz :" + vucutKitleEndeksi + "%n");
            System.out.print("Normal");
        }
        else if(vucutKitleEndeksi >= 25 && vucutKitleEndeksi <30)
        {
            System.out.printf("Vücut Kilo Endeksiniz :" + vucutKitleEndeksi + "%n");
            System.out.print("Kilolu");
        }
        else if(vucutKitleEndeksi>= 30 && vucutKitleEndeksi <35)
        {
            System.out.printf("Vücut Kilo Endeksiniz :" + vucutKitleEndeksi + "%n");
            System.out.print("Obez");
        }
        else
        {
            System.out.printf("Vücut Kilo Endeksiniz :" + vucutKitleEndeksi + "%n");
            System.out.print("Ciddi");
        }

    }
    }