import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int birthDay,n;
        String value=null;
        Scanner inp=new Scanner(System.in);
        System.out.print("Doğum yılını giriniz : ");
        birthDay=inp.nextInt();
        n=birthDay%12;
        if(birthDay>0) {
            switch (n) {
                case 0:
                    value = "Maymun";
                    break;
                case 1:
                    value = "Horoz";
                    break;
                case 2:
                    value = "Köpek";
                    break;
                case 3:
                    value = "Domuz";
                    break;
                case 4:
                    value = "Fare";
                    break;
                case 5:
                    value = "Öküz";
                    break;
                case 6:
                    value = "Kaplan";
                    break;
                case 7:
                    value = "Tavşan";
                    break;
                case 8:
                    value = "Ejderha";
                    break;
                case 9:
                    value = "Yılan";
                    break;
                case 10:
                    value = "At";
                    break;
                case 11:
                    value = "Koyun";
                    break;
            }
            System.out.print("Çin Zodyağı Burcunuz : "+value);
        }else {
            System.out.print("Negatif sayı girmeyiniz!");
        }
    }
}
