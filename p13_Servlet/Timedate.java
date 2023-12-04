// Purpose: Display the current time and date.

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Timedate extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Time and Date</title></head>");
        out.println("<body><h1>Time and Date</h1>");
        Date date = new Date();
        out.println("<p>The time is: " + date.toString() + "</p>");
        out.println("</body></html>");

    }

}