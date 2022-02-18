package day9;

class A extends Thread{
	public void run(){
		System.out.println("Current Id of A : "+Thread.currentThread().getId());
		
	}
}
class B extends Thread{
	public void run(){
		System.out.println("Current Id of B : "+Thread.currentThread().getId());
		
	}
}
class C extends Thread{
	public void run(){
		System.out.println("Current Id of C : "+Thread.currentThread().getId());
		
	}
}
class D implements Runnable{
	public void run(){
		System.out.println("Current Id of D : "+Thread.currentThread().getId());
		
	}
}
public class Multithread {

	public static void main(String[] args) {
		A a = new A();
		a.start();
		B b = new B();
		b.start();	
		C c = new C();
		c.start();
		D d = new D();
		Thread t =new Thread(d);
		t.start();
		System.out.println("Current Id of main method : "+Thread.currentThread().getId());


	}

}
