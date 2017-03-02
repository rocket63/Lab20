package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("welcome","message","Hello World");

    }

    @RequestMapping("welcome")

    public ModelAndView helloWorld2()
    {
        return new
                ModelAndView("welcome2","message","Hello World2");

    }

    @RequestMapping("userRegistration")

    public ModelAndView userInfo(
            @RequestParam("FName") String fName,
            @RequestParam("LName") String lName,
            @RequestParam("EMail") String eMail,
            @RequestParam("PhoneNum") String phoneNum,
            @RequestParam("PassWord") String passWord) {

        String hello = "Hello " + fName;
        return new ModelAndView("viewName", "greeting", hello);
    }

    @RequestMapping("getInfo")
    public ModelAndView getUserInfo(){
        String welcomeMessage = "Welcome! Please provide your information!";

        return new ModelAndView("userRegistration", "display", welcomeMessage);
    }


}
