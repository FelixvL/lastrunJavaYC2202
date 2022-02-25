class Demo{       // CW
	public static void main(String[] args){
		Koe koe = new Tuin();
		System.out.println(koe);
		koe.rennen();

	}
}


abstract class Koe{
	public String toString(){
		return "moeee";
	}
	public void rennen(){
		System.out.println("oei");
	}

}


class Tuin extends Koe{
	public void rennen(String oei)throws Exception{
		throw new Exception();
	}
}