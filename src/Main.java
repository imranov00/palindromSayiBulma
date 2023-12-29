import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int number) {
        int temp = number;
        int reverseNumber = 0;
        int lastNumber;
        while (temp != 0) {
            System.out.println("==============");
            System.out.println("Number :" + temp);
            lastNumber = temp % 10;
            System.out.println("Son basamak: " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("yeni Sayı; " + reverseNumber);
            temp /= 10;
        }
        if(number==reverseNumber)
        {
            System.out.println("Girdiğiniz Sayı Bir Palindrom Sayıdır.");
        }
        else
        {
            System.out.println("Girdiğiniz Sayı Bir Palindrom Sayı Değildir.");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Girmek İstediğiniz Sayı: ");
        number= input.nextInt();
        isPalindrom(number);

    }
}