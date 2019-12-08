package basicos;

public class Main
{
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
        logicos();
    }
}
