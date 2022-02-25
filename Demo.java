class Demo{       // CB
	public static void main(String[] args){
		System.out.println("Dreft");
		Hoi h = new Hoi();
		try{
			h.go();
			System.out.println("Milka");
		}catch(Exception e){
			System.out.println("Witte Reus");
		}
		System.out.println("Ariel");
	}
}

class Hoi{
	void go(){
		throw new Error();
	}

}