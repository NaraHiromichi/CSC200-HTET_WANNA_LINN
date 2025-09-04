/**********************************************************************
  
  Program Title : Demonstrating Variable Data Types in Java
  File Name: "VariableDataTypes.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 28 August 2025
  
 **********************************************************************/

public class VariableDataTypes {
    public static void main(String[] args) {
        System.out.println("Demonstrating Variable Data Types in Java");
        System.out.println("-----------------------------------------");

        // Primitive Data Types
        byte b = 120;
        short s = 32000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';
        boolean bool = true;

        // slide 19 contents
        int val = 5;
        char alpha = 'J';
        char ban = 'k';
        double x = 3.1415;
        double y = 2/3;
        float p = 5/3;
        float q = 5/3f;
        // I left out num because it would conflict with the num decleration 

        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);
        System.out.println(val);
        System.out.println(alpha);
        System.out.println(ban);
        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
        System.out.println(q);

        System.out.println("\n--- Non-Primitive Data Types ---");

        // Non-Primitive Data Types
        String str = "Hello, Java!";
        int[] numbers = {1, 2, 3, 4, 5};


        System.out.println("String value: " + str);
        System.out.println("Array values: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
