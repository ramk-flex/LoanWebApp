import com.fasterxml.jackson.databind.ObjectMapper;
import com.loanapp.component.LoanNumberGeneratorComponent;
import com.loanapp.service.LoanService;
import com.loanapp.vo.LoanVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class LoanAppServlet extends HttpServlet {

    private static final Logger _logger = LogManager.getLogger(LoanAppServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        _logger.info("Inside do get method");
        String name = req.getParameter("name");
        String country = req.getParameter("country");
        _logger.info(" Name " + name + "Country " + country);

        /*ServletContext servletContext = req.getServletContext();
        HashMap<String,String> appConfig = (HashMap<String, String>) servletContext.getAttribute("appConfig");
        _logger.info("App Name ====>" + appConfig.get("appName"));
        _logger.info("App Version==> " + appConfig.get("version"));*/
        req.getRequestDispatcher("greet.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }
}
