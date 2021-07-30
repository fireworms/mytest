package org.mymy.domain;

import java.util.Date;

public class BoardVO {

	/*create table tbl_board(
	bno int(10) NOT NULL auto_increment PRIMARY key,
	title varchar(200) not null,
	content varchar(2000) not null,
	writer varchar(50) not null,
	regdate datetime default CURRENT_TIMESTAMP(),
	updatedate datetime default CURRENT_TIMESTAMP(),
	replycnt int default 0
	);*/
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updatedate;
	private int replycnt;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public int getReplycnt() {
		return replycnt;
	}
	public void setReplycnt(int replycnt) {
		this.replycnt = replycnt;
	}
	
	
}
