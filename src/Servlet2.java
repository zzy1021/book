import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet2", value = "/Servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        ServletContext servletContext = getServletContext();
//        Object name = servletContext.getAttribute("name");
//        System.out.println(name);
//        System.out.println(name);
//        System.out.println(name);
        String name = request.getParameter("name");
        request.setAttribute("key1","servlet2已盖章");
        request.getRequestDispatcher("/servlet3").forward(request,response);
        System.out.println("11");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
