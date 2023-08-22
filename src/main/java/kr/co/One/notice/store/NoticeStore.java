package kr.co.One.notice.store;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.co.One.notice.domain.Notice;
import kr.co.One.notice.domain.PageInfo;

public interface NoticeStore {

	/**
	 * 공지사항 등록 Store
	 * @param session
	 * @param notice
	 * @return int
	 */
	int insertNotice(SqlSession session, Notice notice);

	/**
	 * 공지사항 조회 Store
	 * @return List
	 */
	List<Notice> selectNoticeList(SqlSession session, PageInfo pInfo);

	/**
	 * 공지사항 갯수 조회 Store
	 * @return
	 */
	int selectListCount(SqlSession session);

	/**
	 * 공지사항 제목으로 조회 Store
	 * @param session
	 * @param searchKeyword
	 * @return
	 */
	List<Notice> selectNoticeByTitle(SqlSession session, String searchKeyword);

	/**
	 * 공지사항 작성자로 조회 Store
	 * @param session
	 * @param searchKeyword
	 * @return
	 */
	List<Notice> selectNoticeByWriter(SqlSession session, String searchKeyword);

	
	/**
	 * 공지사항 내용으로 조회 Store
	 * @param session
	 * @param searchKeyword
	 * @return
	 */
	List<Notice> selectNoticeByContent(SqlSession session, String searchKeyword);

	/**
	 * 공지사항 전체로 조회 Store
	 * @param session
	 * @param searchKeyword
	 * @return
	 */
	List<Notice> selectNoticeAll(SqlSession session, String searchKeyword);

	/**
	 * 공지사항 조건에 따라 키워드로 조회 Store
	 * @param session
	 * @param searchCondition
	 * @param searchKeyword
	 * @return
	 */

	List<Notice> selectNoticeByKeyword(SqlSession session, PageInfo pInfo, Map<String, String> paramMap);

	/**
	 * 공지사항 검색 게시물 전체 갯수 조회 Store
	 * @param session
	 * @param paramMap
	 * @return
	 */
	int selectListCount(SqlSession session, Map<String, String> paramMap);

}
