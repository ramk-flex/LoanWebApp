import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoanAppStartupServlet extends GenericServlet {

    private static final Logger _logger = LogManager.getLogger(LoanAppStartupServlet.class);

    @Override
    public void init() throws ServletException {
        _logger.info("Initializing the servlet");
        ServletContext context = getServletContext();
        String initParam = getInitParameter("appKey");
        _logger.info("init param ===> " + initParam);
        Map<String,String> appConfig = new HashMap<>();
        appConfig.put("appName","Loan Origination System");
        appConfig.put("version", " 1.0");
        appConfig.put("dbVerson","9.0");
        context.setAttribute("appConfig",appConfig);
        super.init();
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        _logger.info("Starting the servlet");
    }
}
