class Demo{       // BM
	public static void main(String[] args){
		System.out.println("s");
		R r = new R();
		r.t();
		System.out.println("e");
	}
}


class R{
	void t(){
		System.out.println("t");
		throw new Exception();
	}

}