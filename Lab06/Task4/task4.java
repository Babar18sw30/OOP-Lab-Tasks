class Area
{
	public double printArea(double length,  double width)
	{
		return length*width;
	}

	public double printArea(double side)
	{
		return side*side;
	}
}


class MainClass
{
	public static void main(String[] args) {
		Area x = new Area();

		System.out.println(x.printArea(2.6, 4.5));

		System.out.println(x.printArea(10));
		
	}
}