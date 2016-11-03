

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward=request.getParameter("forward");
		RequestDispatcher rd;
		if(forward.equals("Login"))
				{
					rd=request.getRequestDispatcher("LoginServlet");
			       rd.forward(request, response);
				}
		else if(forward.equals("CompBooks"))
		{
			rd=request.getRequestDispatcher("CompBooksServlet");
	       rd.forward(request, response);
		}
		else if(forward.equals("HistBooks"))
		{
			rd=request.getRequestDispatcher("HistBooksServlet");
	       rd.forward(request, response);
		}
		else if(forward.equals("ShopCart"))
		{
			rd=request.getRequestDispatcher("ShopCartServlet");
	       rd.forward(request, response);
		}else if(forward.equals("logout")){
			rd=request.getRequestDispatcher("Logout");
		       rd.forward(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
