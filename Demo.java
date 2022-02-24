class Demo{       // BE
	public static void main(String[] args){
		Maker m = new Maker();
		m.gaan().voortgaan();
		System.out.println(m.gaan().a);

	}
}


class Fiets extends Voertuig{
	void voortgaan(){
		System.out.println("in gaan fiets");
	}
	
}

class Maker{
	Fiets gaan(){
		System.out.println("in gaan");
		return new Fiets();
	}

}

class Voertuig{
	int a;
}