package com.myproject.community;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public int signUp(MemberDTO memberDTO) {
		return sqlSession.insert("member.sign_up", memberDTO);
	}
}
