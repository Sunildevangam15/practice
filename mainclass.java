class Father {
  private void atm()
	{
		System.out.println("dad ka atmuuu");
	}
void car()
{
	System.out.println("dad ka caruuu");
}
protected void bike()
{
	System.out.println("dad ka bikeuuu");
}

public void cycle()
{
	System.out.println("dad ka cycluuu");
}
class Mainclass{

	public static void main(String[] args) {
		Father f1=new Father();
		//f1.atm();
		f1.car();
		f1.bike();
		f1.cycle();

	}

}
}
