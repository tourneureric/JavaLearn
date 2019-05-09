
public class JavaDebug {
	
	public JavaDebug () {
		System.out.println("JavaTypes::JavaDebug()");
	}

	public void javaDebug() {

		System.out.println(this.getClass().getName() + "()");
		
		JavaUser ju1 = new JavaUser("moi", 1);
		JavaUser ju2 = new JavaUser("toi", 2);
		
		System.out.println(this.getClass().getName() + "() ju1.getText() = " + ju1.getText());
		System.out.println(this.getClass().getName() + "() ju1.getVal() = " + ju1.getVal());
		
		ju2.setText("pas toi");
		ju2.setVal(-2);
		
		System.out.println(this.getClass().getName() + "() ju2.getText() = " + ju2.getText());
		System.out.println(this.getClass().getName() + "() ju2.getVal() = " + ju2.getVal());


	}

}
