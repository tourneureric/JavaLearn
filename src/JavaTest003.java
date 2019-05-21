
public class JavaTest003 {

	public JavaTest003 () {
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::" + this.getClass().getName() + "()");
		
	}

	public void main() {
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [begin]");

		User ju1 = new User("moi", 1);
		User ju2 = new User("toi", 2);
		
		System.out.println(this.getClass().getName() + "() ju1.getText() = " + ju1.getText());
		System.out.println(this.getClass().getName() + "() ju1.getVal() = " + ju1.getVal());
		
		ju2.setText("pas toi");
		ju2.setVal(-2);
		
		System.out.println(this.getClass().getName() + "() ju2.getText() = " + ju2.getText());
		System.out.println(this.getClass().getName() + "() ju2.getVal() = " + ju2.getVal());
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [end]");

	}

}
