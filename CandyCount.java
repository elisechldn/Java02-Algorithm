public class CandyCount {
    public static void main(String[] args) {
        int candies = 0;
        double price = 1.2;
        double money = 12.4;
        if (money > 0 && price > 0) {
            while (money - price >= 0){
                candies += 1;
                money -= price;
            }
        }
        System.out.println("J'ai acheté " +candies + " bonbons.");
    }
}