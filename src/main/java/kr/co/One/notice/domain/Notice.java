package kr.co.One.notice.domain;

import java.sql.Timestamp;

public class Notice {

	private int noticeNo;
	private String noticeSubject;
	private String noticeContent;
	private String noticeProduct;
	private String noticeWriter;
	private Timestamp noticeDate;
	private Timestamp updateDate;
	private String noticeFilename;
	private String noticeFilepath;
	private long noticeFilelength;
	
	
	
	public int getNoticeNo() {
		return noticeNo;
	}



	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}



	public String getNoticeSubject() {
		return noticeSubject;
	}



	public void setNoticeSubject(String noticeSubject) {
		this.noticeSubject = noticeSubject;
	}



	public String getNoticeContent() {
		return noticeContent;
	}



	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}



	public String getNoticeProduct() {
		return noticeProduct;
	}



	public void setNoticeProduct(String noticeProduct) {
		this.noticeProduct = noticeProduct;
	}



	public String getNoticeWriter() {
		return noticeWriter;
	}



	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}



	public Timestamp getNoticeDate() {
		return noticeDate;
	}



	public void setNoticeDate(Timestamp noticeDate) {
		this.noticeDate = noticeDate;
	}



	public Timestamp getUpdateDate() {
		return updateDate;
	}



	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}



	
	public String getNoticeFilename() {
		return noticeFilename;
	}
	public void setNoticeFilename(String noticeFilename) {
		this.noticeFilename = noticeFilename;
	}
	public String getNoticeFilepath() {
		return noticeFilepath;
	}
	public void setNoticeFilepath(String noticeFilepath) {
		this.noticeFilepath = noticeFilepath;
	}
	
	
	public long getNoticeFilelength() {
		return noticeFilelength;
	}
	public void setNoticeFilelength(long noticeFilelength) {
		this.noticeFilelength = noticeFilelength;
	}



	@Override
	public String toString() {
		return "공지사항 [글번호=" + noticeNo + ", 제목=" + noticeSubject + ", 내용=" + noticeContent
				+ ", 상품명=" + noticeProduct + ", 작성자=" + noticeWriter + ", 작성일=" + noticeDate
				+ ", 수정일=" + updateDate + ", 파일이름=" + noticeFilename
				+ ", 파일경로=" + noticeFilepath + ", 파일크기="+ noticeFilelength + "]";
	}



	
	
}
