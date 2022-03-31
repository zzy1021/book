import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletConfig().getServletContext();
        String get = servletContext.getInitParameter("GET");
        System.out.println(get);
        System.out.println(servletContext.getContextPath());
        System.out.println(servletContext.getRealPath("/"));
        System.out.println(servletContext.getRealPath("/web/vive/index.html"));
        ServletContext servletContext1 = getServletContext();
        servletContext1.setAttribute("name","valss");
        Object name = servletContext1.getAttribute("name");
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
