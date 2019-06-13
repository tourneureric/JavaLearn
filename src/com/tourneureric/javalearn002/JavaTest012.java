package com.tourneureric.javalearn002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JavaTest012 {

	Scanner sc;

	private ArrayList<HashMap<String, String>> mLabelArrayListHashMap;
	private HashMap<String, String> mLabelHashMapLangEn;
	private HashMap<String, String> mLabelHashMapLangFr;
	private HashMap<String, String> mLabelHashMapLangPt;
	private HashMap<String, String> mLabelHashMapLangZh;
	
	private void doitLangEn() {
		
		mLabelHashMapLangEn = new HashMap<String, String>();

		mLabelHashMapLangEn.put("app_name", "Top Quiz");
		mLabelHashMapLangEn.put("activity_main_lib_001", "Welcome to TopQuiz.\\nWhat is your first name ?");
		mLabelHashMapLangEn.put("activity_main_lib_002", "Enter your first name");
			
	}
	
	private void doitLangFr() {
		
		mLabelHashMapLangFr = new HashMap<String, String>();

		mLabelHashMapLangFr.put("app_name", "Top Quiz");
		mLabelHashMapLangFr.put("activity_main_lib_001", "Welcome to TopQuiz.\\nWhat is your first name ?");
		mLabelHashMapLangFr.put("activity_main_lib_002", "Enter your first name");
		
	}
	
	private void doitLangPt() {
		
		mLabelHashMapLangPt = new HashMap<String, String>();

		mLabelHashMapLangPt.put("app_name", "Top Quiz");
		mLabelHashMapLangPt.put("activity_main_lib_001", "Welcome to TopQuiz.\\nWhat is your first name ?");
		mLabelHashMapLangPt.put("activity_main_lib_002", "Enter your first name");
		
	}
	
	private void doitLangZh() {
		
		mLabelHashMapLangZh = new HashMap<String, String>();

		mLabelHashMapLangZh.put("app_name", "Top Quiz");
		mLabelHashMapLangZh.put("activity_main_lib_001", "Welcome to TopQuiz.\\nWhat is your first name ?");
		mLabelHashMapLangZh.put("activity_main_lib_002", "Enter your first name");
		
	}

	private void doit() {

		Log.log(Log.LOG_DEBUG, "JavaTestTemplate::doit() [begin]");

		mLabelArrayListHashMap = new ArrayList<HashMap<String, String>>();

		doitLangEn();
		doitLangFr();
		doitLangPt();
		doitLangZh();

		mLabelArrayListHashMap.add(C.LANG_EN, mLabelHashMapLangEn);
		mLabelArrayListHashMap.add(C.LANG_FR, mLabelHashMapLangFr);
		mLabelArrayListHashMap.add(C.LANG_PT, mLabelHashMapLangPt);
		mLabelArrayListHashMap.add(C.LANG_ZH, mLabelHashMapLangZh);
		
		P.print(mLabelArrayListHashMap.get(C.LANG_EN).get("app_name"));

		Log.log(Log.LOG_DEBUG, "JavaTestTemplate::doit() [end]");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, "JavaTestTemplate::main() [begin]");

		if (JavaLearn.JL_RUN) {

			try {

				String again = "n";

				sc = new Scanner(System.in);

				do {

					doit();

					P.print("Voulez-vous continuer (o/n) ?");
					again = sc.nextLine();

				} while (again.equalsIgnoreCase("o"));

				P.print("Fin");
				sc.close();

			} catch (Exception e) { Log.error("in main()"); throw e; }

			Log.log(Log.LOG_DEBUG, "JavaTestTemplate::main() [end]");

		}

	}

	public JavaTest012 () {

		Log.log(Log.LOG_DEBUG, "JavaTestTemplate::JavaTestTemplate() [begin]");

		Log.log(Log.LOG_DEBUG, "JavaTestTemplate::JavaTestTemplate() [end]");

	}

}
