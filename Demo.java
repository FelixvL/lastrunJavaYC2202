class Demo{       // BO
	public static void main(String[] args){
		System.out.println("s");
		R r = new R();
		try{
			r.t();
		}catch(Exception e){
			System.out.println("f");
		}
		System.out.println("e");
	}
}


class R{
	void t() throws Exception{
		System.out.println("t");
		throw new Exception();
	}

}