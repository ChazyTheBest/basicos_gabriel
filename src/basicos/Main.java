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

    /**
     * String non-primitive data type
     */
    private static void cadenas()
    {
        // Variable declaration
        String myString;

        // Variable initialization
        myString = "I am a String";

        // Print variable
        System.out.printf("Hello: %s.\n", myString);
    }

    /**
     * Boolean primitive data type
     */
    private static void logicos()
    {
        // Variable declaration
        Boolean witness, liar;

        // Variable initialization
        witness = true;
        liar = false;

        // Print variable
        System.out.printf("Witness: %s.\n", witness ? "I speak the truth" : "I am a liar");
        System.out.printf("Liar: %s.\n", liar ? "I speak the truth" : "I am a liar");
    }

    public static void main(String[] args)
    {
        numericos();
        cadenas();
        logicos();
    }
}
