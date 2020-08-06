package com.ft.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LogOutServlet extends HttpServlet {

    private static final Logger _logger = LogManager.getLogger(LogOutServlet.class);

    @RequestMapping(value="/logout", method = RequestMethod.POST)
    public String registerNewLoan(HttpServletRequest request){
        _logger.info("Logging out");
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
        return "login";
    }
}
