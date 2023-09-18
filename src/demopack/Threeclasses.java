package demopack;

public class Threeclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//class one

		System.out.println("class one");
		System.out.println(One.a);
		One o1 = new One();

		System.out.println(o1.d);

		o1.displayone();

		o1.showone();

		//class two

		System.out.println("class two");

		System.out.println(Two.ch);

		Two t2 = new Two();

		System.out.println(t2.st);

		t2.displayTwo();

		t2.ShowTwo();

		//class three

		System.out.println("class three");

		System.out.println(Three.b);

		Three t3 = new Three();

		System.out.println(t3.bo);

		t3.displayThree();

		t3.showThree();

		}

		}



		class One{

		static int a=20;

		double d = 1.9;

		public static void displayone() {

		System.out.println("one class static");

		}

		public void showone() {

		System.out.println("one class non static");

		}

		}

		class Two{

		static char ch = 'a';

		String st = "yash";

		public static void displayTwo() {

		System.out.println("two class static");

		}

	

		

		public void ShowTwo() {

		System.out.println("two class non static");

		}

		}

		class Three{

		static int b = 20;

		boolean bo = true;

		public static void displayThree() {

		System.out.println("Three class static");

		}

		public void showThree() {

		System.out.println("Three class non static");

		}

		}


