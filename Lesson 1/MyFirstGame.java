// компьютер "загадывает" целое число от (0 до 100], которое необходимо угадать
// после каждой неудачной попытки выводите подсказку:
// "Данное число больше того, что загадал компьютер" или
// "Данное число меньше того, что загадал компьютер"
// если число угадано — "Поздравляю, число угадано!"
// меняйте значение переменной, хранящей числа игрока, автоматически по какому-то простому алгоритму 
//(без применения ввода с клавиатуры или генерации рандомных чисел)
// игра продолжается до тех пор, пока число не будет угадано
public class MyFirstGame {
    public static void main(String[] args) {
        int numberPC = 20;
        int numberUser = 22;
        System.out.println("Вы загадали число " + numberUser);

        if((numberPC > 0) && (numberUser > 0)) {
            do {
                if(numberUser > numberPC) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                    numberUser --;
                } else {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                    numberUser ++;
                }
            } while (numberUser != numberPC);
        System.out.println("Поздравляю, число угадано!");
        }
    }
}