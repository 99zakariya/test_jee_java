import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Index")
public class Index extends HttpServlet {
    	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    java.io.PrintWriter out= response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>\r\n"
                + "<html>\r\n"
                + "<head>\r\n"
                + "    <title></title>\r\n"
                + "</head>\r\n"
                + "<body>\r\n"
                + "    <h1>Ticket Booking for events</h1>\r\n"
                + "    <form action=\"TicketBooking\">\r\n"
                + "        Enter the type of event(Stage show/Exhibition):\r\n"
                + "        <input type=\"text\" name=\"eventType\">\r\n"
                + "        <input type=\"submit\" id=\"bookEvent\" value=\"Book event\">\r\n"
                + "    </form>\r\n"
                + "</body>\r\n"
                + "</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	}

}
