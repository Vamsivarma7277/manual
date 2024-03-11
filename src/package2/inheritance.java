package package2;


public class inheritance {
	
		class A{
			public void a1() {
				System.out.print("am a1");
			}
		}

		class B extends A {
			public void b1() {
			System.out.print("am b1");	
			}
		}
		public class singleinheritance{
			public void main(String[] args) {
				 A a = new A();
				a.a1();
				System.out.println("---------");
				B b = new B();
				b.a1();
				b.b1();
		}
		}
		}

