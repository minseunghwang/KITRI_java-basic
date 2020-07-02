package p396;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}

interface DataAccessObject{
	public void select();
	public void insert();
	public void update();
	public void delete();
}

class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle DB 검색");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB 삽입");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB 수정");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB 삭제");
	}
	
}
class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Mysql DB 검색");
	}

	@Override
	public void insert() {
		System.out.println("Mysql DB 삽입");
	}

	@Override
	public void update() {
		System.out.println("Mysql DB 수정");
	}

	@Override
	public void delete() {
		System.out.println("Mysql DB 삭제");
	}
	
}
