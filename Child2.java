package abtraction;

public class Child2 extends Parent {

	@Override
	void test() {
		System.out.println("implementation of parent to child and child1 implent");
	}
	
	
	public static void main(String[] args) {
		     Parent p=new Child2();
		     p.test();
	         
	}
	
	
	}

	
	

