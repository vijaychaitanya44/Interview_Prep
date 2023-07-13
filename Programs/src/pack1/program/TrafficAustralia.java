package pack1.program;

public class TrafficAustralia implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficAustralia tc = new TrafficAustralia();
		
	CentralTraffic.yellow();
		
		CentralTraffic c = new TrafficAustralia();
		
		c.green();
		c.red();
		System.out.println(c.a);
		System.out.println(c.ch);
		
		
		
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red red red");
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("goo go go");
	}

	void blue() {
		
		System.out.println("blue");
	}
	
	void yellow(){
		
	}
}
