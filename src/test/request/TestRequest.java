package test.request;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

public class TestRequest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strURL = "http://192.168.1.105:8080/RecSysServer/servlet/GetList";
		try {
			String result = getDataFromURL(strURL, null);
			System.out.println(result);//输出获取到的内容，测试用
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("连接url错误");
		}
	}

	public static String getDataFromURL(String strURL, Map<String, Object> param) throws Exception {
		URL url = new URL(strURL);
		URLConnection conn = url.openConnection();
		conn.setDoOutput(true);

		OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
		final StringBuilder sb; 
		if (param != null) {
			sb = new StringBuilder(param.size() << 4);// 4次方
			final Set<String> keys = param.keySet();
			for (final String key : keys) {
				final Object value = param.get(key);
				sb.append(key); // 不能包含特殊字符
				sb.append('=');
				sb.append(value);
				sb.append('&');
			}
			// 将最后的 '&' 去掉
			sb.deleteCharAt(sb.length() - 1);
		}else{
			sb = new StringBuilder(100 << 4);
		}
		// writer.write("email=fd3589@163.com&password=123");
		writer.write(sb.toString());
		writer.flush();
		writer.close();

		InputStreamReader reder = new InputStreamReader(conn.getInputStream(), "utf-8");

		BufferedReader breader = new BufferedReader(reder);

		//BufferedWriter w = new BufferedWriter(new FileWriter("d:/1.txt"));//获取内容输出到指定文件

		String content = null;
		String result = null;
		while ((content = breader.readLine()) != null) {
			result += content;
		}
		//w.write(result);
		//w.flush();
		//w.close();
		
		return result;

	}
}
