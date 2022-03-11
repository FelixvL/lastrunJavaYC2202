class Demo{       // FJ
	public static void main(String[] args){
			System.out.println("b");
			V v = new V();
			D d = v.zetten();
			double w = d.a();
			System.out.println(w);
	}
}
abstract class A{
	double a(){
		System.out.println("a in A");
		return 5.6;
	}

}

class D extends A{
	double a(int a){
		System.out.println("a in D");
		throw new RuntimeException();
	}
}

class V{
	D zetten(){
		return new D();
	}
	
}