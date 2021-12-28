import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberPC = (int) (Math.random() * 100);
        System.out.println("Число игры: " + numberPC);
        GuessNumber game = new GuessNumber(numberPC);

        System.out.println("Введите имя первого игрока");
        Player playerOne = new Player(scan.nextLine());
        System.out.println("Введите имя второго игрока");
        Player playerTwo = new Player(scan.nextLine());

        String inputValidation = "yes";
        while(inputValidation.equals("yes")) {
            System.out.println("Введите число для первого игрока: ");
            playerOne.setNumber(scan.nextInt());
            game.startGame(playerOne);
            System.out.println("Введите число для второго игрока: ");
            playerTwo.setNumber(scan.nextInt());
            game.startGame(playerTwo);
            System.out.println("Хотите продолжить игру? [yes/no]:");
            do {
                inputValidation = scan.nextLine();
            } while (!inputValidation.equals("yes") && !inputValidation.equals("no"));
        }
    }
}