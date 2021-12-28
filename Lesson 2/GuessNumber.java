public class GuessNumber {

    private int gameNumber;

    public GuessNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }

   public void startGame(Player player) {
        if (compare(player)) {
            System.out.println("Поздравляю, игрок " + player.getName() + " ты выйграл!");
        }
    }

    private boolean compare(Player player) {
        if (player.getNumber() > gameNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getNumber() < gameNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
        return player.getNumber() == gameNumber;
    }
}