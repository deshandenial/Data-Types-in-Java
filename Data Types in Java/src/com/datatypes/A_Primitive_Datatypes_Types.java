package com.datatypes;

public class A_Primitive_Datatypes_Types 
{

	public static void main(String[] args) 
	{
		/*Data types are divided into two groups:

			Primitive data types - includes byte, short, int, long, float, double, boolean and char
			Non-primitive data types - such as String, Arrays and Classes
			
			1.Data Type is divided by 2 category
			
				-they are primitive type and non-primitive type
				
			2.Let see primitive type divided to 2 category
			
				- they are boolean and numeric 
				
			3.Let see numeric type divided to 2 category
			
				- they are character and integral 
				
			4.Let see Integral divided to 2 category
			
				- they are integer and floating point
			
	Boolean under boolean data type
	Numeric under character under char data type
	integer under byte,short,int,long data type
	floating point under float and double
	 
*/
		byte a=-128;   			// 1 byte	Stores whole numbers from -128 to 127
		short b=15;				// 2 bytes	Stores whole numbers from -32,768 to 32,767
		int c=10;				// 4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long d=20;				// 8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float e=10.2f;			// 4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double f=101.1d;			// 8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
		char g='A';             // 2 bytes	Stores a single character/letter or ASCII values
		boolean h=true;			// 1 bit	Stores true or false values
		String s="deshan";
		
		System.out.println("byte value:"+a);
		
		System.out.println("===============");
		
		System.out.println("short value:"+b);
		
		System.out.println("===============");
		
		System.out.println("int value:"+c);
		
		System.out.println("===============");
		
		System.out.println("long value:"+d);
		
		
		System.out.println("===============");
		
		System.out.println("float value:"+e);
		
		System.out.println("===============");
		
		System.out.println("double value:"+f);
		
		System.out.println("===============");
		
		
		System.out.println("char value:"+g);
		
		
		System.out.println("================");
		
		
		System.out.println("boolean value:"+h);
		
		System.out.println("===============");
		
		System.out.println("String value:"+s);
		
	}

}
