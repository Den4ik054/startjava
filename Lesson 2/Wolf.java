// Создайте класс Wolf
// объявите в нем поля: пол, кличка, вес, возраст, окрас
// реализуйте методы: идти, сидеть, бежать, выть, охотиться
// в каждом методе выводите сообщение вида: "Воет", "Сидит" и тд

// у всех полей класса напишите модификатор доступа private
// а у его методов — public
// для доступа к полям создайте геттеры и сеттеры
// в сеттере поля age реализуйте проверку: если возраст волка > 8 лет, 
// то выведите сообщение "Некорректный возраст". В противном случае сохраните значение в поле
public class Wolf {

    private String floor;
    private String nickname;
    private Float weight;
    private int age;
    private String colour;

    public String getFloor() {
        return floor;
    }

    void setFloor(String floor) {
        this.floor = floor;
    }

    public String getNickName() {
        return nickname;
    }

    void setNickName(String nickname) {
        this.nickname = nickname;
    }

    public Float getWeight() {
        return weight;
    }

    void setWeight(Float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColour() {
        return colour;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    public void move() {
        System.out.println("идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}