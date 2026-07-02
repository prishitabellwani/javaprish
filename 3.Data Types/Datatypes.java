// Data types define the type of value a variable can store.
// They also determine the size and range of the value.

// Primitive data types in Java:
// Integer types  : byte, short, int, long
// Decimal types  : float, double
// Character type : char
// Boolean type   : boolean

// Size of primitive data types:
// byte   -> 1 byte
// short  -> 2 bytes
// int    -> 4 bytes
// long   -> 8 bytes
// float  -> 4 bytes
// double -> 8 bytes
// char   -> 2 bytes (uses Unicode)
// boolean -> JVM dependent

// Range:
// byte  : -128 to 127
// short : -32,768 to 32,767
// int   : -2,147,483,648 to 2,147,483,647
// long  : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

class Datatypes {
    public static void main(String args[]) {

        int num = 5;            // Stores normal whole numbers.

        byte by = 123;          // Stores very small whole numbers.

        short sh = 12345;       // Stores small whole numbers.

        long lo = 1234567890L;  // Stores large whole numbers. Add L or l at the end.

        float f = 5.6f;         // Stores decimal numbers. Add f or F because decimal values are double by default.

        double d = 5.6;         // Default data type for decimal numbers. More precise than float.

        char c = 'A';           // Stores a single character. Use single quotes (' ').

        // char uses Unicode, so it can store letters, numbers and special characters.

        boolean b = true;       // Stores only true or false.

        System.out.println("Integer : " + num);g
        System.out.println("Byte    : " + by);
        System.out.println("Short   : " + sh);
        System.out.println("Long    : " + lo);
        System.out.println("Float   : " + f);
        System.out.println("Double  : " + d);
        System.out.println("Char    : " + c);
        System.out.println("Boolean : " + b);
    }
}