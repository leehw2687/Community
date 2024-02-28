package com.myproject.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public void login(MemberDTO memberDTO, Model model) {
		memberService.login(memberDTO);
	}
	
	@RequestMapping("sign_up")
	public void signUp(MemberDTO memberDTO, Model model) {
		memberService.signUp(memberDTO);
	}
}
