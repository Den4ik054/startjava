// Создайте класс Cycle с методом main
// Выведите на консоль с помощью цикла for все числа от [0, 20]
// Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
// Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println();

        int i = 6;
        while(i >= -6) {
            System.out.println(i);
            i -=2;
        }

        System.out.println();

        int j = 10;
        int sumOdd = 0;
        do {
            if(j % 2 == 1) {
                sumOdd += j;
            }
            j++;
        } while(j <= 20);
        System.out.println(sumOdd);
    }
}