package com.myproject.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BbsController {
	
	@Autowired
	BbsService BbsService;

}
