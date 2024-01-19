
class Point{
	int x;
	int y;
	Point(){ x=0; y=0;}
	Point(int a, int b){x=a; y=b;}
	public void get(){
		System.out.println("position of point is :- "+x+" "+y);		
	}
}
class Main{
	public static void main(String args[]){
		Point p = new Point(4,5);
		p.get();
		String st = new String("praveen");
		System.out.println(st);
	}
}