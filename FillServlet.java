import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class FillServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        if ("admin".equals(username) && "password".equals(password)) {
            out.println("<h1>Login Successful!</h1>");
            out.println("<p>Welcome, " + username + "!</p>");
        } else {
            out.println("<h1>Login Failed!</h1>");
            out.println("<p>Invalid username or password.</p>");
            out.println("<a href='index.htm'>Try again</a>");
        }
        out.println("</body></html>");
    }
}
