package fifth;

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

class Circle extends Shape{
	
	double r;
	Circle(double r){
		this.r=r;
	}
	
	@Override
	double calcArea() {
		return r * r * Math.PI;
	}
}


class Rectangle extends Shape{
	double width;
	double height;
	Rectangle(int i, int j) {
		width = i;
		height = j;
	}
	
	boolean isSquare() {
		if(width == height && width != 0) {
			return true;
		}
		return false;
	}

	@Override
	double calcArea() {
		return width * height;
	}
}