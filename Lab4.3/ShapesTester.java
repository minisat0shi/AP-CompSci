import java.awt.Color;
public class ShapesTester {
	public static void main(String[] args){
		StdDraw.setPenRadius(.01); //setting thickness for all, man does it need to be small..
		//testing parallelogram
		Coord coord1 = new Coord(.1,.1);
		Coord coord2 = new Coord(.2,.1);
		Coord coord3 = new Coord(.2,.2);
		Coord coord4 = new Coord(.1,.2);
		Parallelogram.draw(coord1, coord2, coord3, coord4);
		//testing Trapezoid
		coord1.setX(.05); coord2.setX(0.1); coord3.setX(0.1); coord4.setX(.05);
		coord1.setY(.05); coord2.setY(.05); coord3.setY(0.1); coord4.setY(0.1);
		Trapezoid.draw(coord1, coord2, coord3, coord4);
		//testing RegularHexagon
		RegularHexagon.draw(.1);
		//testing EquilateralTriangle
		EquilateralTriangle.draw(.15);
		//testing RightTriangle
		coord1.setX(.385); coord1.setY(0.495);
		RightTriangle.draw(coord1, .12, .07);
		//creating a random Ngon tester
		coord1.setX(0.3); coord1.setY(0.4);
		Ngon.draw(coord1, 7, 0.1);
	}	
}	
