package com.myproject.community;

public class MemberDTO {
	private String member_id;
	private String member_pw;
	private String member_email;
	private String member_phone;
	private String member_nickname;
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	public String getMember_nickname() {
		return member_nickname;
	}
	public void setMember_nickname(String member_nickname) {
		this.member_nickname = member_nickname;
	}
	
	@Override
	public String toString() {
		return "MemberVO [member_id=" + member_id + ", member_pw=" + member_pw + ", member_email=" + member_email
				+ ", member_phone=" + member_phone + ", member_nickname=" + member_nickname + "]";
	}	
}
