package io.github.movax10.calorizer.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

   @PreAuthorize("isAnonymous()")
   @RequestMapping("/login")
   public String login() {
      return "login";
   }

   @PreAuthorize("isAnonymous()")
   @RequestMapping("/registration")
   public String registration() {
      return "registration";
   }
}
