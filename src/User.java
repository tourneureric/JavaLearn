
public class User {

	private String mText;
	private int mVal;
	
	public User() {
		System.out.println("User::User()");
	}

	public User(String pText, int pVal) {
		System.out.println("User::User() pText=" + pText + " pVal=" + pVal);

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
