class CalciWorking{
	
public static void main(String a[])
{ 
      Calci obj=new Calci();
	  obj.add(2,4);
	  obj.subt(4,2);
	  obj.divi(24,2);
	  obj.mul(2,3);
}

class Calci{
	static int add(int a, int b)
	{
	int add = a+b;
	System.out.println("Value of add= " + add);
	return 10;
}

 static int subby(int a, int b)
 {
 int subt = a-b;
 System.out.println("Value of subt= " + subt);
 return 10;
}

 int divi(int a, int b)
 {
	int divi = a/b;
	System.out.println("Value of divi= " + divi);
	return 10;
}
int mull(int a, int b)
{
	int mul = a*b;
	System.out.println("Value of mul= " + mul);
	return 10;
}	
}