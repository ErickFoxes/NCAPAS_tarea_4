package com.uca.capas.tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tarea4.domain.Producto;

@Controller
public class MainController {
	@RequestMapping("/index")
	public ModelAndView producto() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/producto")
	public ModelAndView procesar(@Valid @ModelAttribute Producto prod, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) { //Hay errores, redirigimos a la pantalla del formulario
			mav.setViewName("index");
		}
		else {
			mav.addObject("code", prod.getCode());
			mav.addObject("name", prod.getName());
			mav.addObject("marca", prod.getMarca());
			mav.addObject("desc", prod.getDesc());
			mav.addObject("exis", prod.getExis());
			mav.addObject("fecI", prod.getFecI());
			mav.setViewName("resultados");
		}
		return mav;
	}
	
	
}
