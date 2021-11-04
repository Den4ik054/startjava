// Создайте класс Wolf
// объявите в нем поля: пол, кличка, вес, возраст, окрас
// реализуйте методы: идти, сидеть, бежать, выть, охотиться
// в каждом методе выводите сообщение вида: "Воет", "Сидит" и тд
public class Wolf {

    String floor;
    String nickname;
    Float weight;
    int age;
    String colour;

    void move() {
        System.out.println("идет");
    }

    void sit() {
        System.out.println("Сидит");
    }

    void run() {
        System.out.println("Бежит");
    }

    void howl() {
        System.out.println("Воет");
    }

    void hunt() {
        System.out.println("Охотится");
    }
}