
public class JavaUser {

	private String mText;
	private int mVal;
	
	public JavaUser() {
		System.out.println(this.getClass().getName() + "()");
	}

	public JavaUser(String pText, int pVal) {
		System.out.println(this.getClass().getName() + "() pText=" + pText + " pVal=" + pVal);

		mText = pText;
		mVal = pVal;
	}

	public String getText() {
		System.out.println(this.getClass().getName() + "::" + new Object() {}.getClass().getEnclosingMethod().getName() + "()");

		return mText;
	}

	public void setText(String pText) {
		System.out.println(this.getClass().getName() + "::" + new Object() {}.getClass().getEnclosingMethod().getName() + "()");

		mText = pText;
	}

	public int getVal() {
		System.out.println(this.getClass().getName() + "::" + new Object() {}.getClass().getEnclosingMethod().getName() + "()");

		return mVal;
	}

	public void setVal(int pVal) {
		System.out.println(this.getClass().getName() + "::" + new Object() {}.getClass().getEnclosingMethod().getName() + "()");

		mVal = pVal;
	}

}
