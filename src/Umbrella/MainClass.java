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
		 System.out.println("circle drawn");
	 }
}
class Rectangle implements MainClass{
	 @Override
	 public void draw()
	 {
		 System.out.println("rectangle drawn");
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
		 MainClass cir=shapeFactory.getShape("Circle");
		 cir.draw();
		 MainClass rec= shapeFactory.getShape("Square");
		 rec.draw();
	 }
}
