// Создайте класс WolfTest с методом main
// в нем создайте объект типа Wolf
// в этом же классе присвойте полям Wolf какие-то значения
// получите эти значения из полей и отобразите в консоли
// вызовите методы объекта
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.floor = new String("man");
        wolfOne.nickname = new String("sharik");
        wolfOne.weight = 6.5f;
        wolfOne.age = 3;
        wolfOne.colour = new String("gray");

        System.out.println("Пол - " + wolfOne.floor);
        System.out.println("Кличка - " + wolfOne.nickname);
        System.out.println("Вес - " + wolfOne.weight);
        System.out.println("Возраст - " + wolfOne.age);
        System.out.println("Окрас - " + wolfOne.colour);
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}