package test.image;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImageTest {
public static void main(String[] args) {
	BufferedInputStream in;
	ByteArrayOutputStream out2;

	
		try {
			in = new BufferedInputStream(new FileInputStream(
					"D:/apache-tomcat-7.0.50/webapps/RecSysServer/cat.jpg"));
			out2 = new ByteArrayOutputStream(1024);
			System.out.println("Available bytes:" + in.available());
			byte[] temp = new byte[1024];
			int size = 0;
			while ((size = in.read(temp)) != -1) {
				out2.write(temp, 0, size);
			}
			in.close();
			byte[] content = out2.toByteArray();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
