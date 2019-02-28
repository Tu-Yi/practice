package niliv.haha;

//同一个包的类
public class TestModifiler2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestModifier1 t1 = new TestModifier1("旺财", "男", "12", "警犬");
		//t1.name=""; //The field TestModifier1.name is not visible
		t1.sex=""; //default
		t1.age =""; //protected
		t1.major=""; //public
	}
}
