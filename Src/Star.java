import java.util.Random;
public class Star {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100000) + 11;
        int sum = 0;
        int count = 0;
        System.out.println("Задане число = " + num);
        while (num != 0) {
            if (num % 10 == 0) {
                num /= 10;
            }
            sum += num % 10;
            num /= 10;
            count++;
        }
        System.out.println("Сума цифр заданого числа = " + sum);
        System.out.println("Кількість ітерацій: " + count);
    }

}
