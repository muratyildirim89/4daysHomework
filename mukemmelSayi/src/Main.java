public class Main {
    public static void main(String[] args) {

        //Kendinden başka bölündüğü sayıların toplamı kendisine eşittir. 6: 1,2,3.

        int number = 6;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("Girilen Sayı (" + number + ") Mükemmeldir.");
        }
    }
}
