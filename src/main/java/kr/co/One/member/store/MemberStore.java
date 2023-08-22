package kr.co.One.member.store;

import org.apache.ibatis.session.SqlSession;

import kr.co.One.member.domain.Member;

public interface MemberStore {

	int insertMember(SqlSession session, Member member);

	Member checkMemberLogin(SqlSession session, Member member);

	Member showOneById(SqlSession session, String memberId);

	int updateMember(SqlSession session, Member mOne);

	int deleteMember(SqlSession session, String memberId);

}
