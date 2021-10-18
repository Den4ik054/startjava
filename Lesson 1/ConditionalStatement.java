public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        boolean isMale = true;
        float height = 1.6f;
        char latname = 'I';

        if(age > 20) {
            System.out.println("Продажа разрешена");
        }
        if(isMale) {
            System.out.println("Мужчина");
        }
        if(!isMale) {
            System.out.println("Не мужчина");
        }
        if(height < 1.80) {
            System.out.println("Ваш рост " + height);
        } else {
            System.out.println("играй в воллейбол");
        }
        if(latname == 'M') {
            System.out.println("имя начинается на М?");
        } else if(latname == 'I') {
            System.out.println("имя начинается на I?");
        } else {
            System.out.println("Как Вас зовут ?");
        }
    }
}