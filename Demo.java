class Demo{       // CY
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
	public abstract void rennen(){
		System.out.println("oei");
	}

}


class Tuin extends Koe{
	void rennen()throws Error{
		throw new RuntimeException();
	}
}