package com.workday.webapp;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("home")
//    @ResponseBody
    public ModelAndView home(@RequestParam("name") String myName){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", myName);
        mv.setViewName("home");
        return mv;
//        public String home(@RequestParam("name") String myName, HttpSession session){
//    public String home(HttpServletRequest request){
//        System.out.println("hi");
//        HttpSession session = request.getSession();
//        String name = request.getParameter("name");
//        System.out.println("Welcome "+myName);
//        session.setAttribute("name", name);
//        return "home";
    }
}
