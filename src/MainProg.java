
public class MainProg {

	public static void main(String[] args) {
		ResizableCircle r = new ResizableCircle(4);
		System.out.println(r.getArea());
		r.resize(10);
		System.out.println(r.getArea());
		
	}

}
