import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Registration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("First Name");
        String lastname= request.getParameter("Last Name");
        String gender= request.getParameter("Gender");
        String email= request.getParameter("Email");
        String username= request.getParameter("username");
        String password= request.getParameter("password");
        if (username.equals("shoeb")&& password.equals("javajuly"))
        {
            response.sendRedirect("Welcome.jsp");
    }
    else{
        response.sendRedirect("Registration.jsp");
        }
}
}