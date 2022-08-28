
package sample;

public class sample
{
	public static void main(String[] args)
{
		m4();
	}
public static void m4()
{
	String studentname= "Anay";
	String studentage="22";
	String studentaddress= "Pune" ;
	int rollno= 25;
	int mobilenumber=123456789;
	
	float percentage=75f;
	char grade= 'A';
	
	System.out.println("Student Name = " +studentname);
	System.out.println("Student Age = " +studentage);
	System.out.println("Student address = " + studentaddress);
	System.out.println("Roll NO = " + rollno);
	System.out.println("Mob NO =" + mobilenumber);
	System.out.println("Percentage = " +percentage + " %");
	System.out.println("Grade = " + "'"+ grade + "'");
	
	m1();
	m2();
	
}
public static void m1()
{
System.out.println("static regular method");
	
}
public static void m2()
{
	System.out.println("static regular method m2");
}
}