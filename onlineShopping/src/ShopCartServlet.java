

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShopCartServlet
 */
@WebServlet("/ShopCartServlet")
public class ShopCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String[] compbooks =  HistBooksServlet.getSelectedbooks();
		String[] selectedbooks=request.getParameterValues("Books");
		String[] totalbooks = new String[6];
		
		PrintWriter out=response.getWriter();
		out.println("<html><body><h1> Your selected books are");
		out.println("<ul>");
		for(String s:selectedbooks)
		{
			out.print("<li>" + s +"</li>");
		}
		out.println("</ul>");
		out.println("</h1><form action='controller?forward=logout' method = 'POST'><input type='submit' value='LogOut'>");
		out.print("</form></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
