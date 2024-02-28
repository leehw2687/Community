package com.myproject.community;

import java.util.Date;

import lombok.Data;

@Data
public class BbsDTO {
	private int bbs_no;
	private String bbs_memberId;
	private String bbs_title;
	private String bbs_content;
	private Date bbs_date;
	private String bbs_img;
	private String bbs_category;	
}
