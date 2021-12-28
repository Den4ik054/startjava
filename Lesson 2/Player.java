/*Player — описывает игроков (один экземпляр класса соответствует одному игроку)
Класс Player должен состоять из:
конструктора, принимающего имя игрока
String name — имя игрока (одного!)
int number — введенное пользователем число
геттеров/сеттеров (если геттеры не используются, то их можно не писать)*/
public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int playerNumber) {
        this.number = playerNumber;
    }
}