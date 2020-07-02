package problem;

public interface IStack {
	// 현재 데이터 개수
	public abstract int length();
	
	// 추출
	public abstract Object Pop();
	
	// 삽입
	public abstract boolean push(Object ob);
	
	// 읽기
	public abstract Object peek();
	
	// 데이터 존재 유무
	public abstract boolean imEmpty();
}
