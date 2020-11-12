public class variable02 {
    public static void main(String[] args) {
    int x = 10, y = 12, z = 3;
    x += y - x++ * z;
    System.out.println( x );
    z = --x - y * 5;
    System.out.println("\n" + z);
    y /= x + 5% z;
    System.out.println("\n" + y);
    z = x++ + y * 5;
    System.out.println("\n" + z);
    x = y - x++ * z;
    System.out.println("\n" + x);
    }
}
