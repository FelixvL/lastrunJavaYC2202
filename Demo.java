class Demo{       // FC
	public static void main(String[] args){
		Groen g = new Groen();
		g.rood = new LightRood();
		System.out.println(g.rood.a);
		System.out.println("kleur");
		g.rood.a();
		System.out.println(g.rood.a)
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