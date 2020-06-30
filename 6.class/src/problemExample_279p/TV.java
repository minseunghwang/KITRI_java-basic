package problemExample_279p;

public class TV {
	public static void main(String[] args) {
		TV_info tvinfo = new TV_info();
		tvinfo.setSize(100);
		tvinfo.setBrand("삼성");
		tvinfo.setPannel("QLED");
		
		System.out.println("나의 티비는 " + tvinfo.getSize() + "인치 짜리 이고, " + tvinfo.getBrand() + " 브랜드이며, " + tvinfo.getPannel() + "패널이다");
		
		TV_tech tvtech = new TV_tech();
		tvtech.power();
		tvtech.power();
		tvtech.power();
		tvtech.volumeup();
		tvtech.volumeup();
		tvtech.volumeup();
		tvtech.volumeup();
		tvtech.volumedown();
		tvtech.silent();
		tvtech.silent();
		tvtech.channel_input(13);
		tvtech.channel_input(25);
		tvtech.channel_input(28);
		tvtech.f_ch();
		
	}
}
class TV_tech{
	
	private boolean onoff = false;
	private int[] volume = new int[2];
	private int max_volume = 100;
	private int min_volume = 1;
	private int channel;
	private int f_channel;
	
	void power() {
		if(onoff) {
			onoff = false;
			System.out.println("티비 끄기");
		}else {
			onoff = true;
			System.out.println("티비 켜기");
		}
	}
	
	void silent(){
		if (volume[1] != 0) {
			volume[0] = volume[1];
			volume[1] = 0;
			System.out.println("음소거, 현재볼륨 : " + volume[1]);}
		else {
			volume[1] = volume[0];
			System.out.println("음소거 해제, 현재볼륨 : " + volume[1]);
		}
		
	}
	
	void volumeup() {
		if (volume[1] < 100)
			volume[1] += 1;
			System.out.println("볼륨 증가, 현재볼륨 : " + volume[1]);
			
	}
	
	void volumedown() {
		if (volume[1] > 1)
			volume[1] -= 1;
			System.out.println("볼륨 감소, 현재볼륨 : " + volume[1]);
	}
	
	int channel_input(int channel) {
		f_channel = this.channel;
		this.channel = channel;
		System.out.println(channel + "번으로 채널 변경");
		return channel;
	}
	
	void f_ch() {
		channel = f_channel;
		System.out.println("이전 채널 " + channel);
	}
}


class TV_info{
	private int size;
	private String brand;
	private String pannel;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPannel() {
		return pannel;
	}
	public void setPannel(String pannel) {
		this.pannel = pannel;
	}
}