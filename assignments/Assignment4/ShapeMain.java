abstract class Shape
{
	abstract void draw();
}

class Line extends Shape
{
	public void draw()
	{
		System.out.println("A line is drawn");
	}
}
class Rect extends Shape{
	public void draw()
	{System.out.println("A rectangle is drawn");
	}
}

class Cube extends Shape
{

	public void draw()
	{
		System.out.println("A cube is drawn");
	}
}

public class ShapeMain
{
	public static void main(String args[])
	{
		Shape s[]=new Shape[3];
		s[0]=new Line();
		s[1]=new Rect();
		s[2]=new Cube();
		for(int i=0;i<s.length;i++)
		{
			s[i].draw();
		}
		
	}
}