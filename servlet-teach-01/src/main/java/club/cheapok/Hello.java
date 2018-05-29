package club.cheapok;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/hello")
public class Hello extends HttpServlet {
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        String iaka = req.getParameter("first_name");
        int intParam = Integer.parseInt(iaka);
        req.setAttribute("last_name",intParam*2);
        req.getRequestDispatcher("views/hello.jsp").forward(req,resp);
    }
}
