package test.json;


public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "asd\"asasd";
		System.out.println(s);
		s = s.replace("\"", "'");
		System.out.println(s);
	}

}
