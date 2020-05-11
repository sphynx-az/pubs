package az.sphynx.pubs.controller;

import az.sphynx.pubs.entity.Pub;
import az.sphynx.pubs.entity.User;
import az.sphynx.pubs.dao.UserDataInter;
import az.sphynx.pubs.service.inter.PubServiceInter;
import az.sphynx.pubs.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "/adminPanel")

public class AdminController {
    @Autowired
    UserServiceInter userServiceInter;
    @Autowired
    UserDataInter userDataInter;
    @Autowired
    PubServiceInter pubServiceInter;

    @GetMapping
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("admin/admin");
        return modelAndView;
    }

    //<<<<<<<<<<<<<<<<<<<<<<<<<Users started here>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @RequestMapping(value = "/addNewUser")
    public ModelAndView addSubUser(ModelAndView modelAndView) {
        modelAndView.addObject("users", userServiceInter.findAll());
        modelAndView.setViewName("admin/addUser");
        return modelAndView;
    }

    @RequestMapping(value = "/addUser")
    public ModelAndView addUser(ModelAndView modelAndView, @Valid User user, BindingResult result) {
        int r = userServiceInter.save(user);
        if (r == -1) {
            result.rejectValue("email", "email", "exist");
        }
        modelAndView.setViewName("redirect:/adminPanel/addNewUser");
        return modelAndView;
    }

    @RequestMapping(value = "/updateUser")
    public ModelAndView updateUser(ModelAndView modelAndView, @RequestParam("id") Integer id, @RequestParam("email") String email, @RequestParam("password") String password) {
        User newUser = userServiceInter.findById(id);
        userServiceInter.save(newUser);
        return new ModelAndView("redirect:/adminPanel/addNewUser");

    }

    @RequestMapping(value = "/deleteUser")
    public ModelAndView deleteUser(@RequestParam("id") Integer id) {
        userDataInter.deleteById(id);
        return new ModelAndView("redirect:/adminPanel/addNewUser");
    }

    //Users ended here


    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<Pubs Started Here>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @RequestMapping("/pub/index")
    public ModelAndView pubIndex(ModelAndView modelAndView) {
        modelAndView.addObject("pubs", pubServiceInter.findAll());
        modelAndView.addObject("pub", new Pub());
        modelAndView.setViewName("admin/pub");
        return modelAndView;
    }

    @PostMapping("/pub/add")
    public ModelAndView pubAdd(@ModelAttribute("pub") @Valid Pub pub, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("redirect:/adminPanel/pub/index");
        pubServiceInter.save(pub);
        return modelAndView;
    }

    @RequestMapping("/pub/delete")
    public ModelAndView pubDelete(@RequestParam("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/adminPanel/pub/index");
        pubServiceInter.deleteById(id);
        return modelAndView;
    }

    //Pubs ended here
}