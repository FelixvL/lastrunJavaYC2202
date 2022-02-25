class Demo{       // CD
	public static void main(String[] args){
		System.out.println("Dreft");
		Hoi h = new Hoi();
		try{
			h.go();
			System.out.println("Milka");
		}catch(Exception e){   
			System.out.println("Witte Reus");
		}finally{
			System.out.println("Unox");
		}
		System.out.println("Ariel");
	}
}

class Hoi{
	boolean eum;
	void go(){
		if(eum){
			throw new Error(); 
		}else{
			throw new Exception();
		} 
	}

}