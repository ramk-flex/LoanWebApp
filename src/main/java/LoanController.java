import com.loanapp.service.LoanService;
import com.loanapp.vo.LoanVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoanController extends HttpServlet {

    private static final Logger _logger = LogManager.getLogger(LoanController.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        _logger.info("Inside do get method");

        String type = req.getParameter("type");
        String region = req.getParameter("region");


        /*ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(req.getServletContext());
        LoanService loanService = (LoanService)context.getBean("loanService");
        LoanVO loanVO = loanService.createNewLoan();*/


        /*resp.getOutputStream().print("<html>" +
                                        "<body> " +
                                            "<h2> Enter Loan Information</h2>" +
                                            "<form>"+
                                                "<table>"+
                                                    "<tr><td>Enter Loan Amount</td><td><input type='text' name='loanAmount'/></td></tr>"+
                                                "</table>"+
                                            "</form>"+
                                        "</body>" +
                                     "</html>");*/

        req.getRequestDispatcher("LoanInfo.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doPost(req, resp);
    }


}
