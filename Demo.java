class Demo{       // EQ
	public static void main(String[] args) throws Exception{
		Go ab = new Eend();
		ab.wandelen();
		Land l = new Land();
		l.hier().wandelen();
		l.ho = new Eend();
	}
}
class Land{
	Go ho;
	Go hier(){
		System.out.println("in daar");
		return new Eend();
	}
}
interface Go{
	public static final int snelheid = 4;
	void wandelen() throws Exception;
}
class Eend implements Go{
	static int oei = abc();
	static int abc(){
		System.out.println("in hier");
		return 7;
	}
	public void wandelen(){
		System.out.println("Wandelen in Eend" + snelheid);
	}
}