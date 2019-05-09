
public class JavaDebug {

	public JavaDebug () {
		System.out.println("JavaTypes::JavaDebug()");
	}

	public void main() {

		System.out.println(this.getClass().getName() + "::" + new Object() {}.getClass().getEnclosingMethod().getName() + "()");
		
		User ju1 = new User("moi", 1);
		User ju2 = new User("toi", 2);
		
		System.out.println(this.getClass().getName() + "() ju1.getText() = " + ju1.getText());
		System.out.println(this.getClass().getName() + "() ju1.getVal() = " + ju1.getVal());
		
		ju2.setText("pas toi");
		ju2.setVal(-2);
		
		System.out.println(this.getClass().getName() + "() ju2.getText() = " + ju2.getText());
		System.out.println(this.getClass().getName() + "() ju2.getVal() = " + ju2.getVal());

	}

}
