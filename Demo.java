class Demo{       // BG
	public static void main(String[] args){
		Maker m = new Maker();
		m.gaan().voortgaan();
		Fiets f = new Fiets();
		System.out.println(m.gaan().a++);
		System.out.println(m.gaan().a++);

	}
}


class Fiets extends Voertuig{
	int a;
	void voortgaan(){
		System.out.println("in gaan fiets");
	}
	
}

class Maker{
	Fiets defiets = new Fiets();
	Voertuig gaan(){
		System.out.println("in gaan");
		return defiets;
	}

}

class Voertuig{
	
}