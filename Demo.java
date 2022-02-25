class Demo{       // CA	
	public static void main(String[] args){
		System.out.println("Dreft");
		Hoi h = new Hoi();
		h.go();
		System.out.println("Ariel");
	}
}

class Hoi{
	void go(){
		throw new Error();
	}

}