import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

//public class WelcomeServlet implements Servlet{}
public class WelcomeServlet extends HttpServlet {



    //@Override
    //public void init(ServletConfig servletConfig) throws ServletException {
        //System.out.println("inside ServletConfig");


    @Override
    public ServletConfig getServletConfig() {
        System.out.println("inside getServletConfig");
        return null;

    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("inside service");
        //PrintWriter printWriter= servletResponse.getWriter();
        PrintWriter printWriter=resp.getWriter();
        //printWriter.print("<html><body>");
        //printWriter.print("<h1>Welcome to servlet programming.</h1>");
        //printWriter.print("</body></html>");
        //ServletConfig config= getServletConfig();
        //String greeting= config.getInitParameter("greeting");
        //System.out.println(greeting);
        //PrintWriter printWriter1= servletResponse.getWriter();
        //if ("/welcome".equals(req.getRequestURI())){
            RequestDispatcher requestDispatcher= req.getRequestDispatcher("welcome2");
        }
        else if("/welcome2".equals(req.getRequestURI())){
        System.out.println("changes made");
            printWriter.print("<html><body>");
            printWriter.print("<h1>Welcome to servlet programming.</h1>");
            printWriter.print("</body></html>");

        }
        }
        //ServletContext context= getServletContext();
        //System.out.println(context.getInitParameter("name"));


    @Override
    public String getServletInfo() {
        System.out.println("inside getServiceInfo method");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("inside destroy method");

    }

}
