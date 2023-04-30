package abtraction;

public  class Child extends Parent{
         int a=20;
	@Override
	 void test() {
		System.out.println("child implement parent method");
	}
	

	public static void main(String[] args) {
		      
		   
	      
	      Parent p=new Child();
	      Parent.show();
	      p.show1();
	      p.test();
	      System.out.println(p.a);
	}
	
	
	
	
	
	
	
}