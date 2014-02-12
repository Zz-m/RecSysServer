package ch01.ts;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class TimeClint {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL url = new URL("http://127.0.0.1:9876/RecSysServer?wsdl");
		QName qname = new QName("http://RecSysServer.ch.com/", "TimeServerImplService");
		Service service = Service.create(url, qname);
		TimeServer eif = service.getPort(TimeServer.class);
		System.out.println(eif.getTimeAsString());
		System.out.println(eif.getTimeAsElapsed());
	}

}
