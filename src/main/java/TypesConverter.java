import java.util.Scanner;

public class TypesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое значение ");
        String a = scanner.next();
        System.out.print("Введите второе значение ");
        int b = scanner.nextInt();

        double a1;
        double b1;
        int aInt = Integer.parseInt(a);
        if(aInt > b) {
            System.out.print("Большее число: " + aInt);
            b1 = b;
            System.out.print("\nМеньшее число: " + b1);
        }
        else {
            System.out.print("Большее число: " + b);
            a1 = aInt;
            System.out.print("\nМеньшее число: " + a1);
        }
    }
}
