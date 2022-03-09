package com.duranco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.duranco.model.Produit;

@RestController
public class MainController {
@GetMapping("")
public ModelAndView accueil()
{
ModelAndView mv=new ModelAndView("menu.html");
return mv;
}
@GetMapping("p1")
public String p1()
{
Produit a=new Produit(1,"Dell", "Dell i7", 1200);
return a.toString();

}
@GetMapping("p2")
public String p2()
{
Produit b=new Produit(1,"toshiba", "Toshiba sattelite i5", 1100);
return b.toString();

}
@GetMapping("p3")
public String p3()
{
Produit c=new Produit(1,"samsung Note", "Galaxy note", 2200);
return c.toString();

}
}
