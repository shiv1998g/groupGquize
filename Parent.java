package abtraction;

public abstract  class Parent {

	int a=10;                                 //variable 
	abstract void test();
	
	Parent(){
		System.out.println("parent constructor");}//constructor
	
	static void show() {
		System.out.println(" static method");}//static method
	
	
	void show1() {
		  System.out.println("instance method");//instance method
	  }

	
}
