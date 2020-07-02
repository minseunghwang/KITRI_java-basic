package interfaceExtends;

public class Goliath implements GtoAll{

	@Override
	public void attackGroud() {
		System.out.println("attackGround()");
	}

	@Override
	public void upgrade() {
		System.out.println("upgrade()");
	}
	
	@Override
	public void attackAir() {
		System.out.println("attackAir()");
	}
	
	public static void main(String[] args) {
		Goliath g = new Goliath();
		g.attackAir();
		g.upgrade();
		g.attackGroud();
	}

}
