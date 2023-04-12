
import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.persistence.PersistenceContext;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Inject
    MyInterface myInterface;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        out.println("<html><head><title>home1</title></head><body>");
        out.println("<h1>hii</h1>");
        String s = myInterface.sayHello();
        out.println(s);
        out.println("<h1>hii</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
