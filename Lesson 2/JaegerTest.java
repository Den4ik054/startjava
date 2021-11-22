public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        Jaeger strikerEureka = new Jaeger();

        gipsyDanger.setModelName("Gipsy Danger");
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
        
        gipsyDanger.drift();
        strikerEureka.drift();
        gipsyDanger.move();
        strikerEureka.move();

    }
}