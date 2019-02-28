package niliv.oop;

public class TestObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		System.out.println(c1);
        c1.changeColor("红色");
        c1.showColor();
        System.out.println(Car.tyreNum);
        System.out.println(c1.tyreNum);
        Car c2 = new Car();
        System.out.println(c2);
        Engine e = new Engine();
        System.out.println(e);
        e.speed = 1000;
        e.weight = 10;
        c2.engine = e;
        c2.color = "黑色";
        c2.tyreNum = 10;
        System.out.println(c2.engine.speed);
        System.out.println(c2.engine.weight);
        System.out.println(c2.color);
        System.out.println(c1.color);
        System.out.println(c1.tyreNum);
	}
}
class Car {
    static int tyreNum = 4;
    Engine engine;
    String color; // char sequence :字符序列
 
    void changeColor(String c) {
        color = c;
    }
 
    void showColor() {
        System.out.println("我的颜色是：" + color);
    }
}
 
class Engine {
    int speed;
    int weight;
}
