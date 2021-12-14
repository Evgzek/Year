import java.util.Scanner;
public class Year {
    public static void main(String[] args) throws Exception {
        Scanner p = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year;
        try {
            year = p.nextInt();
        }catch (Exception e){
            throw new Exception("Неверный год");
        }
        if ((year % 4 == 0) &&(year % 100 !=0) || (year % 400 == 0))
            System.out.println("Введенный вами год високосный");
        else
            System.out.println("Введенный вами год не високосный");
    }
}
