class Demo{       // CG
	public static void main(String[] args){
		GGG ggg = new GGG();
		ggg.ggg();
		System.out.println("Toch");
	}
}


class GGG{
	void ggg(){
		System.out.println("ggg");
	}

}
class UUU extends GGG{
	void ggg(){
		throw new RuntimeException();
	}
	
}