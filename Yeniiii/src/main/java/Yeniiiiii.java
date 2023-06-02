import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patl;
        double tutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç Kilo Armut : ");
        armut = inp.nextInt();
        System.out.print("Kaç Kilo Elma : ");
        elma = inp.nextInt();
        System.out.print("Kaç Kilo Domates : ");
        domates = inp.nextInt();
        System.out.print("Kaç Kilo Muz : ");
        muz = inp.nextInt();
        System.out.print("Kaç Kilo Patlıcan : ");
        patl = inp.nextInt();
        tutar = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patl*5);
        System.out.print("Toplam Tutar : "+tutar);
    }

}
