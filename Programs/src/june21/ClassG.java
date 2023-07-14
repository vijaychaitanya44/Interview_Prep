package june21;

public class ClassG implements InterFaceG {

	

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println(b-a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassG g= new ClassG();
		InterFaceG.c();
		g.a();
		g.b();
				
	}
	
	
}
