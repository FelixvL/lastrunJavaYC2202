class Demo{       // AC
	int a = hoi();
	public static void main(String args[]){
		new Demo().go();
		System.out.println("hoi");
		new Demo().go();
	}
	public void go(){
		System.out.println("doei");
	}
	int hoi(){
		System.out.println("oeps");
		return 7;
	}
}