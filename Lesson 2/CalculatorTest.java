/*создайте класс CalculatorTest, который будет содержать метод main 
и отвечать за создание объектов, их инициализацию, ввод математического выражения и запуск вычислений
по окончанию каждого вычисления выводите сообщение "Хотите продолжить вычисления? [yes/no]:" (реализуйте это в CalculatorTest):
yes — пользователю заново предлагается ввести математическое выражение
no — программа завершается
при вводе иного значения выводите сообщение до тех пор, пока не будут введены допустимые ответы*/
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String inputValidation = "yes";

        Scanner console = new Scanner(System.in);
        while(inputValidation.equals("yes")) {
            Calculator calc = new Calculator();
            
            System.out.println("Введите первое число ");
            calc.setFirstNumber(console.nextInt());

            System.out.println("Введите знак математической операции: ");
            calc.setOperation(console.next().charAt(0));

            System.out.println("Введите второе число: ");
            calc.setSecondNumber(console.nextInt());

            calc.calculate();

            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            do {
                inputValidation = console.nextLine();
            } while (!inputValidation.equals("yes") && !inputValidation.equals("no"));
        }
    }
}
