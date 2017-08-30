package com.chandana.sample.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lakmali on 8/30/2017.
 */
@Controller
@RequestMapping("/")
public class WebController {

    @RequestMapping(method = RequestMethod.GET)
    public String landing(ModelMap model) {
        model.addAttribute("message", "Spring 4 MVC Hello World");
        return "welcome";

    }

    @RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
    public ModelAndView welcome(@PathVariable("name") String name) {
        ModelAndView model = new ModelAndView();
        model.setViewName("welcome");
        model.addObject("msg", name);
        return model;

    }
}
