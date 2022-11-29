package chapter1;

public class CountBits {
    public static void main(String[] args) throws Exception {
        System.out.println("Number of bits in 1111111: " + countBits(Integer.parseInt("1111111", 2)));
    }
    public static short countBits(int x) {
        short numBits = 0;
        while (x != 0) {
            numBits += (x & 1);
            x >>>= 1;
        }
        return numBits;
    }
}
