package loop;
//Using Math.random generate the radius 10 times and with every radius try to find out the areaof a circle
public class Math_Loop {
public static void main(String[] args) {
	for(int i=1;i<=10;i++) {
		double radius=Math.random();
		double area=Math.PI*radius*radius;
		System.out.println(area);
	}
}
}
