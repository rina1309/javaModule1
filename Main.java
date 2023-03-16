import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int min = 10;
        int max = 1000;
        int target = new Random().nextInt(max - min + 1) + min;
        int guess;
        int attempts = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Загадайте число от %d до %d.%n", min, max);
        
        System.out.println("Выберите действие:");
        System.out.println("1. Загадал");
        System.out.println("2. Выход");
        System.out.print("Ваш выбор: ");
        int action = scanner.nextInt();
        
        while (action != 2) {
            attempts++;
            
            System.out.printf("Вы загадали число %d.%n", target);
            System.out.println("Выберите действие:");
            System.out.println("1. Больше");
            System.out.println("2. Меньше");
            System.out.println("3. Угадал");
            System.out.println("4. Выход");
            System.out.print("Ваш выбор: ");
            int choice = scanner.nextInt();
            
            if (choice == 3) {
                // System.out.printf("Программа угадала число %d за %d попыток.%n", target, attempts);
                // System.exit(0);
            } else if (choice == 4) {
                System.exit(0);
            } else if (choice == 1) {
                min = target + 1;
            } else if (choice == 2) {
                max = target - 1;
            } else {
                System.out.println("Неверный выбор действия.");
            }
            
            target = new Random().nextInt(max - min + 1) + min;
        }
        
        scanner.close();
    }
}
