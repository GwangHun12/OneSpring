package kr.co.One.member.service;

import kr.co.One.member.domain.Member;

public interface MemberService {

	/**
	 * 회원가입 Service
	 * @param member
	 * @return
	 */
	int insertMember(Member member);

	Member checkMemberLogin(Member member);

	Member showOneById(String memberId);

	int updateMember(Member mOne);

	int deleteMember(String memberId);

}
