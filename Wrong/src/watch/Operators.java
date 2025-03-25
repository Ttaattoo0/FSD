package watch;

public class Operators {

	static public void main(String... args) {
		     int a = 16 , b = 3;
		     
		     //Arithmetic
		     System.out.println("Add;"+(a+b));
		     System.out.println("Sub:"+(a-b));
		     System.out.println("Mul:"+(a*b));
		     System.out.println("Div:"+(a/b));
		     System.out.println("Mod:"+(a%b));
		     
		     //Relational
		     System.out.println("Equal:"+(a==b));
		     System.out.println("Not equal:"+(a!=b));
		     System.out.println("Greather than:"+(a>b));
		     System.out.println("Lesser than equal to:"+(a<=b));
		     
	         //Logical
		     boolean cond1 = true, cond2 = false;
		     System.out.println("Logical AND:"+(cond1&&cond2));
		     System.out.println("Logical OR:"+(cond1||cond2));
		     System.out.println("Logical NOT:"+(!cond1));
		     
		     //Unary
		     System.out.println("Pre-decrement:"+(--a));
		     System.out.println("Post decrement:"+(a--));
		     System.out.println("Value:"+a);
		     System.out.println("Pre-increment:"+(++b));
		     System.out.println("Post increment:"+(b++));
		     System.out.println("Value:"+b);
		     System.out.println("Unary negation:"+(~a));
		     
		     //Assignment
		     a +=5;
		     System.out.println(a);
		     a -=5;
		     System.out.println(a);
		     
		     //Ternary
		     String res = (a>b)?"a is greater":"b is greater";
		     
		     System.out.println("Result:"+res);
		     
		     //Bitwise
		     int a1 = 5, b1 = 3; //binary 5-->0101, 3-->0011
		     /*
		      * AND
		      * 0101
		      * 0011
		      * ----
		      * 0001--->1
		      * ----
		      * 
		      * OR
		      * 0101
		      * 0011
		      * ----
		      * 0111--->7
		      * ----
		      * 
		      * XOR
		      * 0101
		      * 0011
		      * ----
		      * 0110--->6
		      * ----
		      * 
		      * NOT-->-(n+1)
		      * 0101-->5
		      * 0001-->1
		      * ----
		      * 0110-->6
		      * 
		      * final answer-->-6
		      * ----
		      */
		     System.out.println("Bitwise AND:"+(a1&b1));
		     System.out.println("Bitwise OR:"+(a1|b1));
		     System.out.println("Bitwise XOR:"+(a1^b1));
		     System.out.println("Bitwise NOT:"+(~a1));
		}
		
}
