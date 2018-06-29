package com.travelCompanion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/"})
public class TCController {

    @RequestMapping(value={"/home", "/"}, method = {RequestMethod.GET,RequestMethod.POST})
    public String displayHomePage(ModelMap model) {

        return "homeView";
    }

    @RequestMapping(value={"/error"}, method = {RequestMethod.GET,RequestMethod.POST})
    public String displayErrorPage(ModelMap model) {

        return "errorPageView";
    }


}
