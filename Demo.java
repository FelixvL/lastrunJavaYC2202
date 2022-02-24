class Demo{       // AI
	static final public void main(String[] ebc){
		System.out.println("great");
		Boven b = new Onder();
		b.hoi();
	}
}


class Boven{
	void hoi(){
		System.out.println("ik ben boven");
	}
}

class Onder extends Boven{
	void hoi(){
		System.out.println("ik ben beneden");
	}

}