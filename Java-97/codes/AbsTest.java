class AbsTest 
{
	public static void main(String[] args) 
	{

		Shape sh = new Shape("yellow"){
		 public void area(){
			System.out.println("area");
		 }
		};
	}
}
