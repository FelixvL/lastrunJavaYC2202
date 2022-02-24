class Demo{       // AK
	static final public void main(String[] ebc){
		System.out.println("great");
		Onder b = new Onder();
		b.hoi();
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