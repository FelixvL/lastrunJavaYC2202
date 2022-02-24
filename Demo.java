class Demo{       // BB
	public static void main(String[] args){
		System.out.println("vrijdag");
		Fiets f = new Fiets();
		f.mhhh = 3;
		Fiets f2 = new Fiets();
		System.out.println(f2.hmmm);
		System.out.println(f2.mhhh);
	}
}


class Fiets{
	int hmmm;
	static int mhhh;
	Fiets(){
		System.out.println("maandag");
	}
	
}