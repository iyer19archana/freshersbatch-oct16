

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HistBooksServlet
 */
@WebServlet("/HistBooksServlet")
public class HistBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static String[] selectedbooks;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HistBooksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		selectedbooks=request.getParameterValues("Books");
		
		out.print("<html><body>"
				+ "<form action='controller?forward=ShopCart' method = 'POST'>"
				+ "<input type='checkbox' name='Books' value='History1'> h1"
				+ "<input type='checkbox' name='Books' value='History2'> h2"
				+ "<input type='checkbox' name='Books' value='History3'> h3"
				+ "<input type='checkbox' name='Books' value='History4'> h4"
				+ "<input type='submit'  value='Show'></form>"
				+ "</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static String[] getSelectedbooks() {
		return selectedbooks;
	}

	public void setSelectedbooks(String[] selectedbooks) {
		this.selectedbooks = selectedbooks;
	}

	
	
}
