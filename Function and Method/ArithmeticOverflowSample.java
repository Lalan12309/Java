
//package pack01;

public class ArithmeticOverflowSample {

    public static void main(String[] args) { 
        short positiveShort = 32767;

        positiveShort++;

        System.out.println("The value is: " + positiveShort);

        short negativeShort = -32768;

        negativeShort--;

        System.out.println("The value is: " + negativeShort);
    }
}

