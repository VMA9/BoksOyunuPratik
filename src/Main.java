public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 24, 100, 100,65);
        Fighter f2 = new Fighter("Mike Tyson", 22,100,100,45);

        Match match = new Match(f1,f2,90,100);
        match.run();
    }
}