package computer;

public class Computer extends Calculator{
	@Override
	double areaCircle (double r) {
		if(r>10) {
			return 3.14 * r * r; 
		} else {
			return super.areaCircle(r);		// 상속해준(Calculator) 의 areaCircle 메서드 적용
		}
	}
	
	@Override
	int plus(int xx, int yy) {
		return xx + xx + yy;
	}
}
