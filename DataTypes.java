package org.example;

public class DataTypes {
    public void nonPrimitiveDataTypes () {

        String text = "Non-Primitive Data Types...........";
        int[] intArray = {1, 2, 3, 4, 5};

        System.out.println("Starting: " + text);
        System.out.println("Array Element: " + intArray[0] + ", " + intArray[1] + ", " + intArray[2] + ", " + intArray[3] + ", " + intArray[4]);
       // System.out.println("Array Element: " + intArray[0] + intArray[1] + intArray[2]) + intArray[3] + intArray[4]);
        System.out.println("------------------------------------------");
    }
    public static void main(String[] args) {
        DataTypes objNonPrimitiveDataTypes = new DataTypes();
        objNonPrimitiveDataTypes.nonPrimitiveDataTypes();

        // Declare Variable of different data types & Assign values to them.

        // Integer Data Type
        byte byteValue =  -128; // Range -128 to 127.
        short shortValue = 31000; // Range -32,768 to 32,767.
        int intValue = 100000; // Range -2^31 to 2^31-1.
        long longIntValue = 99999999999L; // Large Values, use 'L' Suffix.

        // Floating-point types
        float floatValue = 5.754f; // Use 'f' suffix for float.
        double doubleValue = 19.987456631; //More precise than float.

        // Character types
        char characterValue = 'z'; // Stores a Single Character.

        // String types
        String strValue = "Task-01, Variables & Data Types";

        // Boolean types
        boolean booleanValue = true; // Can be true or false.

        // Array types
        int[] intTestArray = {1, 2, 3};
        String[] strTestArray = {"Hello"," ","World"};

        // Displaying All Data Type Values
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Int Value: " + longIntValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Character Value: " + characterValue);
        System.out.println("String Value: " + strValue);
        System.out.println("Boolean Value: " + booleanValue);
        /* System.out.println("Integer Array Value: " + intTestArray[0] + ", " + intTestArray[1] + ", " + intTestArray[2]);
         System.out.println("String Array Value: " + strTestArray[0] + strTestArray[1] + strTestArray[2]); */

    }
}
