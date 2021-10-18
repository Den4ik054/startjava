public class ConditionalStatement {
    public static void main(String[] args) {

        int age = 25;
        if(age > 20) {
            System.out.println("Продажа разрешена");
        }

        boolean isMale = true;
        if(isMale) {
            System.out.println("Мужчина");
        }

        if(!isMale) {
            System.out.println("Не мужчина");
        }

        float height = 1.6f;
        if(height < 1.80) {
            System.out.println("Ваш рост " + height);
        } else {
            System.out.println("играй в воллейбол");
        }

        char firstLetterName = 'I';
        if(firstLetterName == 'M') {
            System.out.println("имя начинается на М?");
        } else if(firstLetterName == 'I') {
            System.out.println("имя начинается на I?");
        } else {
            System.out.println("Как Вас зовут ?");
        }
    }
}