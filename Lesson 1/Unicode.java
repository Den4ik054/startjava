//Выведите в цикле символы кодировки Unicode в диапазоне [9398, 10178]. Если выводятся кракозябры, то [33, 126]
public class Unicode {
    public static void main(String[] args) {
        for(int i = 33; i <= 126; i++) {
            char simvol = (char)i;
            System.out.println(simvol + " - " + i);
        }
    }
}