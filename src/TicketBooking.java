import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TicketBooking")
public class TicketBooking extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    String type= request.getParameter("eventType");
        
        java.io.PrintWriter out= response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>\r\n"
                + "<html>\r\n"
                + "<head>\r\n"
                + "    <title></title>\r\n"
                + "</head>\r\n"
                + "<body>\r\n"
                + "    <h1>Welcome to "+type+"</h1>\r\n"
                + "    <form action=\"Display\">\r\n"
                + "        Select seat type:\r\n"
                + "        <select name=\"type\">\r\n"
                + "            <option value=\"Platinum\">Platinum</option>\r\n"
                + "            <option value=\"Gold\">Gold</option>\r\n"
                + "            <option value=\"Silver\">Silver</option>\r\n"
                + "        </select>\r\n"
                + "        Enter the no. of tickets\r\n"
                + "        <input type=\"hidden\" name=\"eventType\" value=\""+type+"\">\r\n"
                + "        <input type=\"number\" name=\"tickets\">\r\n"
                + "\r\n"
                + "        <input type=\"submit\" id=\"getCost\" value=\"Get amount\">\r\n"
                + "    </form>\r\n"
                + "</body>\r\n"
                + "</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	}

}
