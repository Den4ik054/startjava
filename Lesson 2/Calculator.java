/*класс Calculator будет содержать код, отвечающий за проверку математического знака и сами вычисления
замените все if else, отвечающие за проверку математического знака, на оператор switch
для ввода математического выражения используйте клавиатуру и класс Scanner
формат ввода математического выражения:
Введите первое число: 2
Введите знак математической операции: ^
Введите второе число: 10*/
public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char operation;

    void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        int degree = firstNumber;
        switch(operation) {
        case '^' :
            for(int i = 1; i < secondNumber; i++) {
                degree *= firstNumber;
            }
            System.out.println("Результат = " + degree);
            break;
        case '+' :
            System.out.println("Результат = " + (firstNumber + secondNumber));
            break;
        case '-' :
            System.out.println("Результат = " + (firstNumber - secondNumber));
            break;
        case '*' :
            System.out.println("Результат = " + (firstNumber * secondNumber));
            break;
        case '/' :
            System.out.println("Результат = " + (firstNumber / secondNumber));
            break;
        case '%' :
            System.out.println("Результат = " + (firstNumber % secondNumber));
            break;
        }
    }
}