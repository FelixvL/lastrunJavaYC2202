class Demo{       // FI
	public static void main(String[] args){
		Y r = new R();
		S p = (S)r;
		System.out.println("gelukt");		
	}
}
class P{
}
class R implements Y{

	public void ijen(){
		System.out.println("ijen in R");
	}
}

class U extends R{
	public void ijen(){
		System.out.println("ijen in U");
	}
}
interface Y{
	void ijen();	
}

interface S{

}