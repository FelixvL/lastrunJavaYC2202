class Demo{       // BF
	public static void main(String[] args){
		Maker m = new Maker();
		m.gaan().voortgaan();
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
	Fiets gaan(){
		System.out.println("in gaan");
		return new Fiets();
	}

}

class Voertuig{
	
}