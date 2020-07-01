package fifth;

public class Exercise6 {
	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		
		System.out.println("면적의 합:" + sumArea(arr));
	}

	private static double sumArea(Shape[] arr) {
		double sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}


}
