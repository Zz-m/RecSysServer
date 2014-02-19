package server;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import util.JsonHelper;

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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Item item = getItem();
		JSONObject jobj = JsonHelper.toJSON(item);
		String jString = jobj.toString();
		response.setContentType("text/json;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println(jString);
		out.flush();
		out.close();
	}

	private Item getItem() {
		Item item = new Item();
		item.setName(getName());
		item.setSummary(getSummary());
		item.setImageUri(getImage());
		return item;
	}

	private String getSummary() {
		String summary = "某部电影de 简介";
		return summary;
	}

	private String getName() {
		String name = "某部电影";
		return name;
	}

	private String getImage() {
		String imageUri = "192.168.1.105/RecSysServer/image/cat.jpg";
		return imageUri;

	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");// 乱码-->中文格式化
		PrintWriter out = response.getWriter();

		String result = request.getParameter("str");
		if (result.equals("get")) {
			out.write("接受get成功！");
			System.out.println("接受get成功！");
		}
		if (result.equals("post")) {
			out.write("接受post成功！");
			System.out.println("接受post成功！");
		}

		out.flush();
		out.close();

	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
