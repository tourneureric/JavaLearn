
public class JavaTestTemplate {

	public JavaTestTemplate () {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::" + this.getClass().getName() + "()");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [begin]");

		if (JavaLearn.JL_RUN) {

		}

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [end]");

	}

}
