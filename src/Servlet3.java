import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "Servlet3", value = "/servlet3")
public class Servlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("uri"+request.getRequestURI());
      //  System.out.println("url"+request.getRequestURL());
//        System.out.println("客户端地址"+request.getRemoteHost());
//        System.out.println("方法"+request.getMethod());
//        String usetname = request.getParameter("usetname");
//        String pwd = request.getParameter("password");
//        String[] hobbies = request.getParameterValues("hobby");
//        System.out.println(usetname);
//        System.out.println(pwd);
//        System.out.println(Arrays.asList(hobbies));
        Object ke1 = request.getAttribute("key1");
        System.out.println("是否盖章\t\t"+ke1);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("utf-8");
        String usetname = request.getParameter("usetname");
        String pwd = request.getParameter("password");
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println(usetname);
        System.out.println(pwd);
        System.out.println(Arrays.asList(hobbies));
    }
}
