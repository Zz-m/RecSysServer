package RecSysServer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author adj
 *
 */
public class GetList extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public GetList() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String[] data = getData();
		/*<?xml version="1.0" encoding="ISO-8859-1"?>
		<note>
		<to>George</to>
		<from>John</from>
		<heading>Reminder</heading>
		<body>Don't forget the meeting!</body>
		</note>*/
		response.setContentType("text/xml;charset=utf-8");
		request.setCharacterEncoding("utf-8"); 
		PrintWriter out = response.getWriter();
		out.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		out.println("<item>");
		out.println("  <image>this is a image</image>");
		out.println("  <name>");
		out.println(data[0]);
		out.println("  </name>");
		out.println("  <summary>");
		out.println(data[1]);
		out.println("  </summary>");
		out.println("</item>");
		out.flush();
		out.close();
	}

	private String[] getData() {
		String[] data = {"电影名字", "电影简介"};
		return data;
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
