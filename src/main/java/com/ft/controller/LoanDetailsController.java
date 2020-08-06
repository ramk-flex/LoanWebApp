package com.ft.controller;

import com.ft.validators.LoanDetailsValidator;
import com.ft.view.model.LoanDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

// http://localhost:8080/lwa/api/loan/create

@Controller
public class LoanDetailsController {
    private static final Logger _logger = LogManager.getLogger(LoanDetailsController.class);

    @Autowired
    LoanDetailsValidator loanDetailsValidator;

    @RequestMapping(value="/loan/create", method = RequestMethod.GET)
    public ModelAndView createNewLoan(){
        _logger.info("LoanDetailsController ===> Create New Loan");
        LoanDetails loanDetails = new LoanDetails();
        loanDetails.setMortgageType("conventional");

        ModelAndView loanDetailsView = new ModelAndView();
        loanDetailsView.setViewName("LoanDetails");
        loanDetailsView.addObject("loanDetails",loanDetails);

        return loanDetailsView;
    }

    @RequestMapping(value="/loan/register", method = RequestMethod.POST)
    public ModelAndView registerNewLoan(@ModelAttribute LoanDetails loanDetails,
                                        BindingResult result, SessionStatus sessionStatus,
                                        HttpServletRequest request){
        _logger.info("LoanDetailsController ===> Register A New Loan");
        _logger.info("Loan Details ===> " + loanDetails.toString());



        /*String mortgageType = request.getParameter("mortgageType");
        String loanAmount   = request.getParameter("loanAmount");
        String loanTerm     = request.getParameter("loanTerm");
        String loanProduct  = request.getParameter("productType");
        Integer loanTermInt = Integer.parseInt(loanTerm);

        LoanDetails customLd = new LoanDetails();
        customLd.setMortgageType(mortgageType);
        customLd.setLoanAmount(BigDecimal.valueOf(Long.parseLong(loanAmount)));
        customLd.setLoanTerm(Integer.parseInt(loanTerm));
        customLd.setProductType(loanProduct);

        _logger.info("Custom Loan Details ===> " + customLd.toString());*/

        loanDetailsValidator.validate(loanDetails,result);

        if(result.hasErrors()){
            ModelAndView loanDetailsView = new ModelAndView();
            loanDetailsView.setViewName("LoanDetails");
            loanDetailsView.addObject("loanDetails",loanDetails);
            return loanDetailsView;
        }else {
            ModelAndView loanConfirmationView = new ModelAndView();
            loanConfirmationView.setViewName("LoanConfirmation");
            return loanConfirmationView;
        }

    }
}
