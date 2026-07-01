
// Variables are used to store data in memory for later use. In Java, we need to specify the data type of the variable when we declare it. Common data types include int for integers, double for decimal numbers, char for single characters, and String for sequences of characters.
class Variables{
    public static void main(String args[]){
        System.out.println(3+5);
        // We can just do small operations in print statement instead of storing it in a variable and then printing it.


        System.out.println(8+7);
        // We use system.out.print() to print without a new line and system.out.println() to print with a new line.
        // Now system.out.println() does not store the value it only prints , so to store the value we can store it first in a variable and then print it 


        int num = 5 + 7;
        // remember to specify the data type warna wo error dega
        //= is assignment operator  , it assigns the value on the right to the variable on the left


        System.out.println(num);
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + num2);
        // Instead of adding inside sout for num1 and num2 we can store it in a variable and then print it


        int result = num1 + num2;
        System.out.println(result);
    }
}