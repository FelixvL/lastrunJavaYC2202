class Demo{       // CS
	public static void main(String[] args){
		Koe koe = new Tuin();
		System.out.println(koe);

	}
}


abstract class Koe{
	public String toString(){
		return "moeee";
	}

}


class Tuin extends Koe{

}