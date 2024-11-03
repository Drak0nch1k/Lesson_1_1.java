import java.util.Scanner;

public class HomeW_1 {


    public static void main(String[] args){
        String myCity;
        int NUM = 20;
        String word = "Bishkek";

        System.out.println(myCity = word + " " + NUM);

        if(NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        }
        else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        }
        else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Привет " + name);





    }




}
