package kr.co.One.member.domain;

public class Member {
	private String memberId;
	private String pass;
	private String repass;
	private String memberYn;
	
	public Member() {}
	

	public Member(String memberId, String pass) {
		super();
		this.memberId = memberId;
		this.pass = pass;
	}
	public String getmemberId() {
		return memberId;
	}
	public void setmemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getpass() {
		return pass;
	}
	public void setpass(String pass) {
		this.pass = pass;
	}
	public String getrepass() {
		return repass;
	}
	public void setrepass(String repass) {
		this.repass = repass;
	}
	
	public Member(String memberId, String pass, String repass) {
		super();
		this.memberId = memberId;
		this.pass = pass;
		this.repass = repass;
	}
	
	
	public String getMemberYn() {
		return memberYn;
	}


	public void setMemberYn(String memberYn) {
		this.memberYn = memberYn;
	}


	@Override
	public String toString() {
		return "회원 [아이디=" + memberId + ", 비밀번호=" + pass + ", 비밀번호 재확인=" + repass + ", 회원여부=" + memberYn + "]";
	}
	
	
}
