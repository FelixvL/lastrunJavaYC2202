class Demo{       // FM
	public static void main(String[] args) throws Exception{
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
	double a() throws Exception{
		System.out.println("a in D");
		throw new DException();
	}
}

class V{
	D zetten(){
		return new D();
	}
	
}

class DException extends Exception{}