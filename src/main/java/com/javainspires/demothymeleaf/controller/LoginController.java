package com.javainspires.demothymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javainspires.demothymeleaf.dao.LoginDao;
import com.javainspires.demothymeleaf.form.LoginForm;
import com.javainspires.demothymeleaf.model.Login;

@Controller
public class LoginController {
	

	@Autowired
	private LoginDao loginDao;
	
	@RequestMapping(value="/loginList", method = RequestMethod.GET)
	private  String LoginList(Model model) {
		List<Login> empList = loginDao.findAll();
		
		model.addAttribute("empList", empList);
		return "loginlist";
	}
	
	
	//pegar o formulário da página login
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginForm() {
		//retorna o nome da página html
		return "login";	
	}
	
	//checar as credenciais 
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model) {
		
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
		
		if("admin".equals(username) && "admin".equals(password)) {
			//se o usuário e a senha estiverem corretos retornaremos a página inicial
			return "home";
		}
		// se
		model.addAttribute("Invalido", true);
		
		return "login";
	
	}
	
}
