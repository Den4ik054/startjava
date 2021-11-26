public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strenght;
    private int armor;

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strenght, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strenght = strenght;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if(height <= 0) {
            System.out.println("Не верный рост");
        } else {
            this.height = height;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if(weight <= 0) {
            System.out.println("Не верная масса");
        } else {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 120) {
            System.out.println("Быстрее не могу ");
        } else {
            this.speed = speed;
        }
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        if (strenght <= 0) {
            System.out.println("Нужен еще шпинат ");
        } else {
            this.strenght = strenght;
        }
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if(armor > 0)
        this.armor = armor;
        else {
            System.out.println("Я уязвим ");
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