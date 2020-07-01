package fifth;

class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	int f_channel;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void gotoPrevChannel() {
		int tmp = channel;
		channel = f_channel;
		f_channel = tmp;
	}

	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		f_channel = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	

}

class Exercise2 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}
}
