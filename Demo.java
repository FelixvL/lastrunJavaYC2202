class Demo{       // AM
	static final public void main(String[] ebc){
		System.out.println("great");
		Boven b = new Onder();
		b.hoi(7);
	}
}


class Boven{
	void hoi(){
		System.out.println("ik ben boven");
	}
}

class Onder extends Boven{
	void hoi(int a){
		System.out.println("ik ben beneden");
	}

}