import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		int num1 = Integer.parseInt(request.getParameter("Num1"));
		int num2 = Integer.parseInt(request.getParameter("Num2"));
		
		int result = num1 +num2;
		
		System.out.println("Result ="+result);
	}
}
