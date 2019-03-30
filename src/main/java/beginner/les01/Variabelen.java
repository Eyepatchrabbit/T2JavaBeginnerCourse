package beginner.les01;

public class Variabelen {
    public static void main(String[] args) {

        //randon characters
        byte byteVariable = 1;

        short shortVariable = 2;

        int intVariable =123;

        long longVariable = 123L;

        float floatVariable = 123.3F;

        double doubleVariable= 123.34;

        char charVariable = 'A';

        boolean booleanVariable = false;

        //not really primitive variable (just for completion)
        String stringvariable = "not a primitive variable";

        //printing the different primitive variables
        printVariables( "printing the variables",  byteVariable,  shortVariable,  intVariable,  longVariable, floatVariable,  doubleVariable,  charVariable,  booleanVariable);

        //the min
        byteVariable =-128;
        shortVariable=-32768;
        floatVariable=1.4E-45F;
        doubleVariable = 4.9E-324;
        longVariable= Long.MAX_VALUE;

        printVariables("Minimum variables;", byteVariable, shortVariable,-2147483648, longVariable, floatVariable, doubleVariable, (char) 64, false);

        //the max
        byteVariable =127;
        shortVariable=-32767;
        floatVariable=3.4028235E38F;
        doubleVariable = 1.7976931348623157E308;
        longVariable= Long.MIN_VALUE;
        printVariables("Maximum variables;", byteVariable, shortVariable,2147483647, longVariable, floatVariable, doubleVariable, '\u03A9', true);

    }


    private static void printVariables(String printmessage, byte byteVariable, short shortVariable, int intVariable, long longVariable,
                                       float floatVariable, double doubleVariable, char charVariable, boolean booleanVariable){
        System.out.println(printmessage +
                "\nbyte:" + byteVariable +
                "\nshort: " + shortVariable +
                "\nint: " + intVariable +
                "\nlong: " + longVariable +
                "\nfloat: " + floatVariable +
                "\ndouble: " + doubleVariable+
                "\nchar: " + charVariable+
                "\nboolean: "+ booleanVariable +
                "\n"
        );
    }
}
