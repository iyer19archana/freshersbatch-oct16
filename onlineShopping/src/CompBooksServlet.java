

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CompBooksServlet
 */
@WebServlet("/CompBooksServlet")
public class CompBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompBooksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		PrintWriter out=response.getWriter();
		out.print("<html><body><h1>Welcome "+session.getAttribute("name")+"</h1><form action='controller?forward=HistBooks' method = 'POST'>"
				+ "<input type='checkbox' name='Books' value='C'> C"
				+ "<input type='checkbox' name='Book' value='C++'> C++"
				+ "<input type='checkbox' name='Books' value='JAVA'> JAVA"
				+ "<input type='checkbox' name='Books' value='PYTHON'> Python"
				+ "<input type='submit' value='Next'></form>"
				+ "</button></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
