package com.ft.controller;

import com.loanapp.service.LoanService;
import com.loanapp.vo.LoanVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestLoanDataController {

    private static final Logger _logger = LogManager.getLogger(RestLoanDataController.class);

    @Autowired
    LoanService loanService;

    // http://localhost:8080/lwa/api/rest/loan/search/1000000009
    @GetMapping(value="/rest/loan/search/{loanNumber}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody LoanVO searchByLoanNumber(@PathVariable String loanNumber,@RequestParam boolean isRush){
        _logger.info("Searching For Loan Number ..... " + loanNumber);
        LoanVO loanVO = loanService.findLoanByLoanNumber(loanNumber);

        return loanVO;
    }


    //http://localhost:8080/lwa/api/rest/loan/create

    @PostMapping(value="/rest/loan/create",
                    consumes = MediaType.APPLICATION_JSON_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String createNewLoan(@RequestBody LoanVO loanVO){
        _logger.info("Creating A New Loan");
        loanVO = loanService.createNewLoan(loanVO);

        return "Created A New Loan With Loan Number ===> " + loanVO.getLoanNumber();
    }


}
