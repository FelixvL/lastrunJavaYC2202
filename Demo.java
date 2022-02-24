class Demo{       // BC
	public static void main(String[] args){
		System.out.println("vrijdag");
		Fiets f = new Fiets();
		f.mhhh = 3;
		Fiets f2 = new Fiets();
		System.out.println(f2.mhhh);

	}
}


class Fiets{
	int hmmm;
	static int mhhh = jo();
	void Fiets(){
		System.out.println("maandag");
	}
	static int jo(){
		System.out.println("5");
		return 6;
	}
	
}