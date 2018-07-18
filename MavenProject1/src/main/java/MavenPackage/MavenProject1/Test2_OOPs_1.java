package MavenPackage.MavenProject1;

public class Test2_OOPs_1  extends Test1_OOPs {

	public void method1()
	{
		System.out.println("In Child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2_OOPs_1 t2=new Test2_OOPs_1();
		t2.method1();
		
		Test1_OOPs t1=new Test1_OOPs();
		t1.method1();
		
		Test1_OOPs t3=new Test2_OOPs_1();
		t3.method1();
		
	//	Test2_OOPs_1 t4=new Test1_OOPs();
		
	}

}
