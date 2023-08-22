package kr.co.One.notice.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.co.One.notice.domain.Notice;
import kr.co.One.notice.domain.PageInfo;

public interface NoticeService {

	/**
	 * 공지사항 등록 Service
	 * @param notice
	 * @return int
	 */
	int insertNotice(Notice notice);

	/**
	 * 공지사항 조회 Service
	 * @return List
	 */
	List<Notice> selectNoticeList(PageInfo pInfo);

	/**
	 * 공지사항 전체 갯수 조회 Service
	 * @return
	 */
	int getListCount();

	/**
	 * 공지사항 제목으로 검색 Service
	 * @param searchKeyword
	 * @return
	 */
	List<Notice> searchNoticeByTitle(String searchKeyword);

	/**
	 * 공지사항 작성자로 검색 Service
	 * @param searchKeyword
	 * @return
	 */
	List<Notice> searchNoticeByWriter(String searchKeyword);

	
	/**
	 * 공지사항 내용으로 검색
	 * @param searchKeyword
	 * @return
	 */
	List<Notice> searchNoticeByContent(String searchKeyword);

	/**
	 * 공지사항 전체 검색
	 * @param searchKeyword
	 * @return
	 */
	List<Notice> searchNoticeAll(String searchKeyword);

	/**
	 * 공지사항 조건에 따라 키워드로 검색 Service
	 * @param searchCondition
	 * @param searchKeyword
	 * @return
	 */

	List<Notice> searchNoticeByKeyword(PageInfo pInfo, Map<String, String> paramMap);

	/**
	 * 공지사항 검색 게시물 전체 갯수 Service
	 * @param paramMap
	 * @return
	 */
	int getListCount(Map<String, String> paramMap);

}
