
public class Odemo2A {


	int x,y; 	//int x; int y;
	
	void fun1()
	{
		x = x+3;
		Odemo2A d1 = new Odemo2A();
		d1.x=x+2;
	}
	public static void main(String[] args) {
		Odemo2A d1 = new Odemo2A();
		d1.fun1();
		System.out.println(d1.x);
	}
		
}


