package com.myproject.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	
	public void signUp(MemberDTO memberDTO, Model model) {
		memberService.signUp(memberDTO);
	}
}
