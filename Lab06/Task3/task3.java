class IntChar{
	private int num;
	private char c;

	public IntChar(int num, char c)
	{
		this.num = num;
		this.c = c;
	}

	public IntChar(char c, int num)
	{
		this.c = c;
		this.num = num;
	}


	
	public void intChar(){
		System.out.println(num +" "+c);
	}

	
	public void charInt(){
		System.out.print(c+" "+num);
	}

}

class MainClass{
	public static void main(String[] args) {
		
		IntChar obj = new IntChar(2, 'a');
		obj.intChar();

		IntChar obj1 = new IntChar('a', 2);
		obj1.charInt();
	}
}