class Demo{       // AE
	static int a = hoi();
	int b = doei();
	public static void main(String args[]){
		System.out.println("hoi");
		new Demo().go();
		new Demo().go();
	}
	public void go(){
		System.out.println("doei");
	}
	static int hoi(){
		System.out.println("oeps");
		return 7;
	}
	static int doei(){
		System.out.println("anders");
		return 7;
	}
}