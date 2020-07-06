package to0709;

class Exercise2 {
	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
	}
}

class UnsupportedFuctionException extends RuntimeException{
	final private int ERR_CODE = 100;
	
	UnsupportedFuctionException(String str, int i){};
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "[100]지원하지 않는 기능입니다."; 
	}
	
}
