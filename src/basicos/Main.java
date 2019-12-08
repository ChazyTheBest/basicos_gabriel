package basicos;

public class Main
{
    /**
     * Numeric primitive data types
     */
    private static void numericos()
    {
        // Variable declaration
        byte myByte;
        short myShort;
        int myInt;
        long myLong;
        float myFloat;
        double myDouble;

        // Variable initialization
        myShort = myByte = 100;
        myLong = myInt = 10000;
        myFloat = 123.456f;
        myDouble = 123.456d;

        // Print variables
        System.out.printf("myByte's value: %d\nmyShort's value: %d\n", myByte, myShort);
        System.out.printf("myInt's value: %d\nmyLong's value: %d\n", myInt, myLong);
        System.out.printf("myFloat's value: %.3f\nmyDouble's value: %.3f\n", myFloat, myDouble);
    }

    public static void main(String[] args)
    {
        numericos();
    }
}
