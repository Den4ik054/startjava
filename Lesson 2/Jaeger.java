public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strenght;
    private int armor;

    public String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    public Float getHeight() {
        return height;
    }

    void setHeight(Float height) {
        if(height <= 0) {
            System.out.println("Не верный рост");
        } else {
        this.height = height;
        }
    }

    public Float getWeight() {
        return weight;
    }

    void setWeight(Float weight) {
        if(weight <= 0) {
            System.out.println("Не верная масса");
        } else {
        this.weight = weight;
        }
    }

    public int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        if (speed > 120) {
            System.out.println("Быстрее не могу ");
        } else {
            this.speed = speed;
        }
    }

    public int getStrenght() {
        return strenght;
    }

    void setStrenght(int strenght) {
        if (strenght <= 0) {
            System.out.println("Нужен еще шпинат ");
        } else {
            this.strenght = strenght;
        }
    }

    public int getArmor() {
        return armor;
    }

    void setArmor(int armor) {
        if(armor <= 0) {
            System.out.println("Я уязвим ");
        } else {
            this.armor = armor;
        }
    }

    public boolean drift() {
        System.out.println("Мы в дрифте");
        return true;
    }

    public void move() {
        System.out.println("Вперед");
    }

    public void fire() {
        System.out.println("Огонь");
    }

    public String scanKaiju() {
        return "look";
    }
}