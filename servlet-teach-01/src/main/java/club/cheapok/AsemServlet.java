package club.cheapok;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/go")
public class AsemServlet extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String iaka = req.getParameter("iaka");
        int intParam = Integer.parseInt(iaka);

        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1> Iaka Rez: "+doMathiMagic(intParam)+" </h1>");
        writer.println("</body>");
        writer.println("</html>");
    }

    private int doMathiMagic(final int intParam) {
        return intParam*2;
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
