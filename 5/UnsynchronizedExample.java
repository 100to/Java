public class UnsynchronizedExample {
    public static void main(String[] args) {
        new PrintStringsThread("Hi ", "there!");
        new PrintStringsThread("How are ", "you?");
        new PrintStringsThread("Thank you ", "a lot!");
    }
}