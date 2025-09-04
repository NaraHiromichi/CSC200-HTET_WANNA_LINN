/**********************************************************************
  
  Program Title : Demonstrating Variable Data Types in Java with Sizes
  File Name: "DataTypeSize.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 28 August 2025
  
 **********************************************************************/

public class DataTypeSize {
    public static void main(String[] args) {
        System.out.println("Demonstrating Data Type Size in Java");
        System.out.println("-----------------------------------------");

        int i = 123456789;
        double d = 19.99;
        char c = 'A';
        byte b = 120;
        short s = 32000;
        long l = 9876543210L;
        float f = 5.75f;
		
		//Instruction
		System.out.println("This application shows the basic code that is needed to calculate data type size, the range (min & max value) for each data type.");
		
		//Finding data type size using BYTES
		System.out.println("The variable i is the interger and it has the value: "+ i + " Size of int: " + Integer.BYTES + " bytes.");
		System.out.println("The variable c is the character and it has the value: "+ c + "Size of char: " + Character.BYTES + " bytes.");
		System.out.println("The variable d is the double and it has the value: "+ d + "Size of double: " + Double.BYTES + " bytes.");
		System.out.println("The variable b is the byte and it has the value: "+ b + "Size of byte: " + Byte.BYTES + " bytes.");
		System.out.println("The variable s is the byte and it has the value: "+ s + "Size of short: " + Short.BYTES + " bytes.");
		System.out.println("The variable l is the byte and it has the value: "+ l + "Size of long: " + Long.BYTES + " bytes.");
		System.out.println("The variable f is the byte and it has the value: "+ f + "Size of float: " + Float.BYTES + " bytes.");
		
		//Finding data type size using SIZE
		System.out.println("The variable c is the interger and it has the value: "+ c + "Size of char: " + Character.SIZE + " bits.");
		System.out.println("The variable d is the double and it has the value: "+ d + "Size of double: " + Double.SIZE + " bits.");
		System.out.println("The variable i is the double and it has the value: "+ i + "Size of double: " + Integer.SIZE + " bits.");
		System.out.println("The variable b is the double and it has the value: "+ b + "Size of byte: " + Byte.SIZE + " bits.");
		System.out.println("The variable f is the double and it has the value: "+ f + "Size of float: " + Float.SIZE + " bits.");
		System.out.println("The variable s is the double and it has the value: "+ s + "Size of short: " + Short.SIZE + " bits.");
		System.out.println("The variable l is the double and it has the value: "+ l + "Size of long: " + Long.SIZE + " bits.");
		
		//Finding data type range minimum and maximum value
		System.out.println("The variable i is the interger and it has the value: "+ i + " Minimum value of int range: " + Integer.MIN_VALUE + ".");
		System.out.println("The variable d is the double and it has the value: "+ d + " Maximum value for double range: " + Double.MAX_VALUE + ".");
		System.out.println("The variable c is the character and it has the value: "+ c + " Maximum value for char range: " + Character.MAX_VALUE + ".");
		System.out.println("The variable b is the byte and it has the value: "+ b + " Maximum value for byte range: " + Byte.MAX_VALUE + ".");
		System.out.println("The variable f is the float and it has the value: "+ f + " Maximum value for float range: " + Float.MAX_VALUE + ".");
		System.out.println("The variable s is the short and it has the value: "+ s + " Maximum value for short range: " + Short.MAX_VALUE + ".");
		System.out.println("The variable l is the long and it has the value: "+ l + " Maximum value for long range: " + Long.MAX_VALUE + ".");
    }
}
