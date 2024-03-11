package package2;
class A{
	public void a1(){
		System.out.println("ml al");
	}
}
class B extends A{
	public void b1() {
		System.out.println("ml b1");
	}
}
class C extends B{
	public void c1() {
		System.out.println("ml c1");
	}
}
public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    A a= new A();
    a.a1();
    System.out.println("-----------");
    
    B b= new B();
    b.b1();
    b.a1();
    System.out.println("-----------");
    C c= new C();
    c.a1();
    c.b1();
    c.c1();
	}

}
