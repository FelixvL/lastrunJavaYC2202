class Demo{       // EJ
	public static void main(String[] args){
		Go ab = new Eend();
		ab.wandelen();
		

	}
}

interface Go{
	void wandelen();
}

class Eend implements Go{
	void wandelen(){
		System.out.println("Wandelen in Eend");
	}
}