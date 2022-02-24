class Demo{       // BI
	public static void main(String[] args){
		Maker m = new Maker();
		(Fiets)m.gaan().voortgaan();

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