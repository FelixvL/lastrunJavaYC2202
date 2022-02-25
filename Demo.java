class Demo{       // EW
	public static void main(String[] args) throws Exception{
		new Makkelijk();
		new Makkelijk();
	}
}

class Makkelijk{
	static{
		System.out.println("c");
	}
	{
		System.out.println("b");
	}
	Makkelijk(){
		System.out.println("a");
	}
	{
		System.out.println("d");
	}
	static{
		System.out.println("e");
	}
}