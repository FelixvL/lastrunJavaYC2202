class Demo{       // FD
	public static void main(String[] args){
		Groen g = new Groen();
		g = new Rood();
	}
}

class Groen{
	Rood rood;
}

class Rood{

	static int a = 34;
	static int a(){
		System.out.println("lightrood");
		a = 55;
		return 66;
	}
}

class LightRood extends Rood{
	static int a = 35;
	static int a(){
		System.out.println("lightrood");
		a = 77;
		return 89;
	}
}