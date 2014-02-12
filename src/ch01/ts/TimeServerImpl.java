package ch01.ts;

import java.util.Date;
import javax.jws.WebService;

@WebService(endpointInterface = "com.ch.RecSysServer.TimeServer")
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		// TODO Auto-generated method stub
		return new Date().toString();
	}

	@Override
	public long getTimeAsElapsed() {
		// TODO Auto-generated method stub
		return new Date().getTime();
	}

}
