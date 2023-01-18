package patika;

import java.util.Scanner;

public class Cift_Sayi_Toplama {
    public static void main(String[] args) {
        int sayi,sum=0;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("Bir sayı giriniz:");
            sayi=sc.nextInt();
            if(sayi%2==0&&sayi%4==0){
                sum+=sayi;
            }

        }while (!(sayi%2==1));
        System.out.println("toplam:"+sum);
    }

}
