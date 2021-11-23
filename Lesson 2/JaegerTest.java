public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "United States of America", 79.25f, 1.980f, 7, 8, 6);
        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.850f, 10, 10, 9);

        System.out.println();
        System.out.println("modelName = " + gipsyDanger.getModelName());
        System.out.println("mark = " + gipsyDanger.getMark());
        System.out.println("origin = " + gipsyDanger.getOrigin());
        System.out.println("height = " + gipsyDanger.getHeight());
        System.out.println("weight = " + gipsyDanger.getWeight());
        System.out.println("speed = " + gipsyDanger.getSpeed());
        System.out.println("strenght = " + gipsyDanger.getStrenght());
        System.out.println("armor = " + gipsyDanger.getArmor());

        System.out.println();
        System.out.println("modelName = " + strikerEureka.getModelName());
        System.out.println("mark = " + strikerEureka.getMark());
        System.out.println("origin = " + strikerEureka.getOrigin());
        System.out.println("height = " + strikerEureka.getHeight());
        System.out.println("weight = " + strikerEureka.getWeight());
        System.out.println("speed = " + strikerEureka.getSpeed());
        System.out.println("strenght = " + strikerEureka.getStrenght());
        System.out.println("armor = " + strikerEureka.getArmor());
/*        gipsyDanger.setModelName("Gipsy Danger");
        System.out.println("modelName = " + gipsyDanger.getModelName());
        gipsyDanger.setModelName("Gipsy Danger_new");
        System.out.println("modelName = " + gipsyDanger.getModelName());
        gipsyDanger.setMark("Mark-3");
        System.out.println("mark = " + gipsyDanger.getMark());
        gipsyDanger.setOrigin("United States of America");
        System.out.println("origin = " + gipsyDanger.getOrigin());
        gipsyDanger.setHeight(79.25f);
        System.out.println("height = " + gipsyDanger.getHeight());
        gipsyDanger.setWeight(1.980f);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrenght(8);
        gipsyDanger.setArmor(6);

        strikerEureka.setModelName("Striker Eureka");
        System.out.println("modelName = " + strikerEureka.getModelName());
        strikerEureka.setModelName("Striker_New");
        System.out.println("modelName = " + strikerEureka.getModelName());
        strikerEureka.setMark("Mark-5");
        System.out.println("Mark = " + strikerEureka.getMark());
        strikerEureka.setOrigin("Australia");
        System.out.println("Origin = " + strikerEureka.getOrigin());
        strikerEureka.setHeight(76.2f);
        System.out.println("Height = " + strikerEureka.getHeight());
        strikerEureka.setWeight(1.850f);
        strikerEureka.setSpeed(10);
        strikerEureka.setStrenght(10);
        strikerEureka.setArmor(9);
*/
        gipsyDanger.drift();
        strikerEureka.drift();
        gipsyDanger.move();
        strikerEureka.move();
    }
}