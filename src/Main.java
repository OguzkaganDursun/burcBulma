import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Degiskenler tanimlandi.
        int gun, ay;

        //Kullanicidan dogdugu ay ve gun bilgisi alinarak hangi burc oldugu iletildi.
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------" +
                "\nBurcunuzu Ogrenin! \n--------------------------");
        System.out.println("1.    Ocak \n2.    Subat \n3.    Mart \n4.    Nisan \n5.    Mayis \n6.    Haziran \n7.    Temmuz" +
                "\n8.    Agustos \n9.    Eylul \n10.   Ekim \n11.   Kasim \n12.   Aralik");
        System.out.println("--------------------------");
        System.out.print("Dogdugunuz Ayi Seciniz (1-12) : ");
        ay = scan.nextInt();

        System.out.print("Dogdugunuz Gunu Giriniz (1-31) : ");
        gun = scan.nextInt();
        System.out.println("\n--------------------------");

        if (ay == 1)
        {
            if (gun <=21 && gun > 0)
            {
                System.out.println("Burcunuz : Oglak");
            }
            else if (gun >= 22 && gun <= 31)
            {
                System.out.println("Burcunuz : Kova");
            }
            else
            {
                System.out.println("Hatali Bir Gun Girdiniz!");
            }
        }
        else if  (ay == 2)
        {
            if (gun <=19 && gun > 0)
            {
                System.out.println("Burcunuz : Kova");
            }
            else if (gun >= 20 && gun <= 29)
            {
                System.out.println("Burcunuz : Balik");
            }
            else
            {
                System.out.println("Hatali Bir Gun Girdiniz!");
            }
        }
        else if  (ay == 3)
        {
            if (gun <=20 && gun > 0)
            {
                System.out.println("Burcunuz : Balik");
            }
            else if (gun >= 21 && gun <= 31)
            {
                System.out.println("Burcunuz : Koc");
            }
            else
            {
                System.out.println("Hatali Bir Gun Girdiniz!");
            }
        }
        else if  (ay == 4)
        {
            if (gun <=20 && gun > 0)
            {
                System.out.println("Burcunuz : Koc");
            }
            else if (gun >= 21 && gun <= 30)
            {
                System.out.println("Burcunuz : Boga");
            }
            else
            {
                System.out.println("Hatali Bir Gun Girdiniz!");
            }
        }
        else if  (ay == 5)
        {
            if (gun <=21 && gun > 0)
            {
                System.out.println("Burcunuz : Boga");
            }
            else if (gun >= 22 && gun <= 31)
            {
                System.out.println("Burcunuz : Ikizler");
            }
            else
            {
                System.out.println("Hatali Bir Gun Girdiniz!");
            }
        }
        else if  (ay == 6)
        {
            if (gun <=22 && gun > 0)
            {
                System.out.println("Burcunuz : Haziran");
            }
            else if (gun >= 23 && gun <= 30)
            {
                System.out.println("Burcunuz : Yengec");
            }
            else
            {
                System.out.println("Hatali Bir Gun Girdiniz!");
            }
        }
        else if  (ay == 7)
        {
            if (gun <=22 && gun > 0)
            {
                System.out.println("Burcunuz : Yengec");
            }
            else if (gun >= 23 && gun <= 31)
            {
                System.out.println("Burcunuz : Aslan");
            }
            else
            {
                System.out.println("Hatali Bir Gun Girdiniz!");
            }
        }
        else if  (ay == 8)
        {
            if (gun <=22 && gun > 0)
            {
                System.out.println("Burcunuz : Aslan");
            }
            else if (gun >= 23 && gun <= 31)
            {
                System.out.println("Burcunuz : Basak");
            }
            else
            {
                System.out.println("Hatali Bir Gun Girdiniz!");
            }
        }
        else if  (ay == 9)
        {
            if (gun <=22 && gun > 0)
            {
                System.out.println("Burcunuz : Basak");
            }
            else if (gun >= 23 && gun <= 30)
            {
                System.out.println("Burcunuz : Terazi");
            }
            else
            {
                System.out.println("Hatali Bir Gun Girdiniz!");
            }
        }
        else if  (ay == 10)
        {
            if (gun <=22 && gun > 0)
            {
                System.out.println("Burcunuz : Terazi");
            }
            else if (gun >= 23 && gun <= 31)
            {
                System.out.println("Burcunuz : Akrep");
            }
            else
            {
                System.out.println("Hatali Bir Gun Girdiniz!");
            }
        }
        else if  (ay == 11)
        {
            if (gun <=21 && gun > 0)
            {
                System.out.println("Burcunuz : Akrep");
            }
            else if (gun >= 22 && gun <= 30)
            {
                System.out.println("Burcunuz : Yay");
            }
            else
            {
                System.out.println("Hatali Bir Gun Girdiniz!");
            }
        }
        else if  (ay == 12)
        {
            if (gun <=21 && gun > 0)
            {
                System.out.println("Burcunuz : Yay");
            }
            else if (gun >= 22 && gun <= 31)
            {
                System.out.println("Burcunuz : Oglak");
            }
            else
            {
                System.out.println("Hatali Bir Gun Girdiniz!");
            }
        }
        else
        {
            System.out.println("Hatali Bir Ay Girdiniz!");
        }

    }
}
