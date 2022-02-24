class Demo{       // AN
	static final public void main(String[] ebc){
		System.out.println("great");
		hoezo().hoi();
	}
	static Boven hoezo(){
		return new Onder();
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