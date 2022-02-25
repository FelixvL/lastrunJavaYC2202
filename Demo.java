class Demo{       // CK 
	public static void main(String[] args){
		GGG ggg = new UUU();
		try{
			ggg.ggg();
		}catch(RuntimeException e){
			System.out.println("iets");
		}catch(AB a){
			System.out.println("beter");
		}finally{
			System.out.println("niets");
		}
		System.out.println("Toch");
	}
}


class GGG{
	void ggg()throws Exception{
		System.out.println("ggg");
	}

}
class UUU extends GGG{
	void ggg() throws Exception{
		throw new AB();
	}
	
}

class AB extends Exception{}