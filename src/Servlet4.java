import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet4", value = "/Servlet4")
public class Servlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/a/b/c.jsp").forward(request,response);
//        response.setCharacterEncoding("utf-8" );
//        response.setHeader("Content-type","text/html;charset=utf-8");
        response.setContentType("text/html;charset=utf-8");
        String contentType = response.getContentType();
        System.out.println(contentType);
        System.out.println(response.getCharacterEncoding());
        response.getWriter().write("马阁很帅 ");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
