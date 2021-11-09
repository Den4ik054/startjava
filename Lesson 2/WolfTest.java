// Создайте класс WolfTest с методом main
// в нем создайте объект типа Wolf
// в этом же классе присвойте полям Wolf какие-то значения
// получите эти значения из полей и отобразите в консоли
// вызовите методы объекта

// с помощью сеттеров присвойте полям экземпляра класса Wolf какие-то значения
// считайте эти значения из полей с помощью геттеров и отобразите в консоли
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setFloor("man");
        wolfOne.setNickName("sharik");
        wolfOne.setWeight(6.5f);
        wolfOne.setAge(4);
        wolfOne.setColour("gray");

        System.out.println("Пол - " + wolfOne.getFloor());
        System.out.println("Кличка - " + wolfOne.getNickName());
        System.out.println("Вес - " + wolfOne.getWeight());
        System.out.println("Возраст - " + wolfOne.getAge());
        System.out.println("Окрас - " + wolfOne.getColour());
        // wolfOne.move();
        // wolfOne.sit();
        // wolfOne.run();
        // wolfOne.howl();
        // wolfOne.hunt();
    }
}