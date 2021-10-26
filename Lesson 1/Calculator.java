// Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами:
// что бы программа могла выполнить ту или иную математическую операцию (одну, а не все сразу), делайте проверку математического знака,
//используя if else
// выведите на экран результат вычисления с помощью System.out.println()
// Символ ^ используется в данном задании для обозначения операции возведения в степень, но в Java он выполняет совсем иную функцию. 
//использовать его для возведения в степень не получится. Самостоятельно реализуйте данную операцию (не юзайте Math.pow())
// Символ %, похожий на проценты, называется оператором деления по модулю. В калькуляторе не надо считать проценты! 
// Считайте остаток от деления
public class Calculator {
    public static void main(String[] args) {
        int firstNumber =12;
        System.out.println("Введите первое число " + firstNumber);

        int secondNumber = 0;
        System.out.println("Введите второе число " + secondNumber);

        char operation = '/';
        System.out.println("Введите необходимую операцию " + operation);

        int degree = firstNumber;
        if((firstNumber > 0) && (secondNumber >= 0)) {
            if(operation == '^') {
                for(int i = 1; i < secondNumber; i++) {
                degree *= firstNumber;
                }
                System.out.println("Результат = " + degree);
            } if(operation == '%') {
                System.out.println("Результат = " + (firstNumber % secondNumber));
            } if(operation == '+') {
                System.out.println("Результат = " + (firstNumber + secondNumber));
            } if(operation == '*') {
                System.out.println("Результат = " + (firstNumber * secondNumber));
            } if(operation == '-') {
                System.out.println("Результат = " + (firstNumber - secondNumber));
            } if(operation == '/') {
                if(secondNumber == 0) {
                    System.out.println("На ноль делить нельзя");
                } else {
                    System.out.println("Результат = " + (firstNumber / secondNumber));
                }
            }
        }
    }
}
