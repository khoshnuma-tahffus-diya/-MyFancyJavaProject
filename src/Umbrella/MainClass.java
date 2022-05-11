package Umbrella;

public class MainClass {
    public MainClass ()
    {
        HiddenClass hc=new HiddenClass("khoshnuma");
    }
}
class Circle implements MainClass{
	 @Override
	 public void draw()
	 {
		 System.out.println("a circle drawn");
	 }
}
class Rectangle implements MainClass{
	 @Override
	 public void draw()
	 {
		 System.out.println("a rectangle drawn");
	 }
}
class UmbrellaShapeFactory{ 
	 public MainClass getShape(String type) throws Exception {
		 switch (type) {
			 case "Circle":
				 return new Circle();
			 case "Rectangle":
				 return new Rectangle();
			 default:
				 throw new Exception( "Shape type : "+type+" cannot be instantiated");
		 }
	 }
}
class PaintUmbrella{
	 public static void main(String[] args) throws Exception	 {
		 
		 UmbrellaShapeFactory shapeFactory = new UmbrellaShapeFactory();
		 MainClass circle=shapeFactory.getShape("Circle");
		 circle.draw();
		 MainClass rectangle = shapeFactory.getShape("Square");
		 square.draw();
	 }
}
