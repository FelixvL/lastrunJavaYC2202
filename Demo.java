class Demo{       // EM
	public static void main(String[] args){
		Go ab = new Eend();
		ab.wandelen();
		

	}
}

interface Go{
	int snelheid;
	void wandelen();
}

class Eend implements Go{
	public void wandelen(){
		System.out.println("Wandelen in Eend" + snelheid++);
	}
}