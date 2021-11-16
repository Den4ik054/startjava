// класс Calculator будет содержать код, отвечающий за проверку математического знака и сами вычисления
// замените все if else, отвечающие за проверку математического знака, на оператор switch
// для ввода математического выражения используйте клавиатуру и класс Scanner
// формат ввода математического выражения:
// Введите первое число: 2
// Введите знак математической операции: ^
// Введите второе число: 10
public class Calculator {
    
    private int firstNumber;
    private int secondNumber;
    private char operation;

    public int getFirstNumber() {
        return firstNumber;
    }

    void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getOperation() {
        return operation;
    }

    void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate () {
        int degree = firstNumber;
        for(int i = 1; i < secondNumber; i++) {
            switch(operation) {
                case '^' :
                    degree *= firstNumber;
                    break;
        }
            }
                System.out.println("Результат = " + degree);
        switch(operation) {
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
