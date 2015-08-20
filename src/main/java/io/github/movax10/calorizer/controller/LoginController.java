package io.github.movax10.calorizer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController extends AbstractController{

   @RequestMapping("/login")
   public String login()
   {
      return "login";
   }

   @RequestMapping("/registration")
   public String registration()
   {
      return "registration";
   }
}
