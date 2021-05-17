import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Display")
public class Display extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    String k= request.getParameter("eventType");
        
        java.io.PrintWriter out= response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>\r\n"
                + "<html>\r\n"
                + "<head>\r\n"
                + "    <title></title>\r\n"
                + "</head>\r\n"
                + "<body>\r\n"
                + "    <h1>Welcome to "+k+"</h1>\r\n"
                + "    <p>The total ticket cost for the type Silver and number of tickets 3 is 450.0 only.</p>\r\n"
                + "\r\n"
                + "</body>\r\n"
                + "</html>\r\n"
                + "");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	}

}
