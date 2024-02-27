package com.myproject.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDAO memberDAO;
	
	public int signUp(MemberDTO memberDTO) {
		return memberDAO.signUp(memberDTO);
	}
}
