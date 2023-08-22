package kr.co.One.member.store.Logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.One.member.domain.Member;
import kr.co.One.member.store.MemberStore;

@Repository
public class MemberStoreLogic implements MemberStore{

	@Override
	public int insertMember(SqlSession session, Member member) {
		int result = session.insert("MemberMapper.insertMember", member);
		return result;
	}

	@Override
	public Member checkMemberLogin(SqlSession session, Member member) {
		Member mOne = session.selectOne("MemberMapper.checkMemberLogin", member);
		return mOne;
	}

	@Override
	public Member showOneById(SqlSession session, String memberId) {
		Member mOne = session.selectOne("MemberMapper.showOneById", memberId);
		return mOne;
	}

	@Override
	public int updateMember(SqlSession session, Member mOne) {
		int result = session.update("MemberMapper.updateMember", mOne);
		return result;
	}
	@Override
	public int deleteMember(SqlSession session, String memberId) {
		int result = session.update("MemberMapper.deleteMember", memberId);
		return result;
	}

}
