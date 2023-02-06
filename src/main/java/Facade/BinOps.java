package Facade;

public class BinOps {
    public String sum(String a, String b) {
        int parsedA = Integer.parseInt(a, 2);
        int parsedB = Integer.parseInt(b, 2);

        return Integer.toBinaryString(parsedA + parsedB);
    }

    public String mult(String a, String b) {
        int parsedA = Integer.parseInt(a, 2);
        int parsedB = Integer.parseInt(b, 2);

        return Integer.toBinaryString(parsedA * parsedB);
    }
}
