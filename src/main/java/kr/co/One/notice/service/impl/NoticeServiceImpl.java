package kr.co.One.notice.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.One.notice.domain.Notice;
import kr.co.One.notice.domain.PageInfo;
import kr.co.One.notice.service.NoticeService;
import kr.co.One.notice.store.NoticeStore;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	private SqlSession session;
	@Autowired
	private NoticeStore nStore;
	
	@Override
	public int insertNotice(Notice notice) {
		int result = nStore.insertNotice(session, notice);
		return result;
	}

	@Override
	public List<Notice> selectNoticeList(PageInfo pInpo) {
		List<Notice> nList = nStore.selectNoticeList(session, pInpo);
		return nList;
	}

	@Override
	public int getListCount() {
		int result = nStore.selectListCount(session);
		return result;
	}

	@Override
	public List<Notice> searchNoticeByTitle(String searchKeyword) {
		List<Notice> searchList = nStore.selectNoticeByTitle(session, searchKeyword);
		return searchList;
	}

	@Override
	public List<Notice> searchNoticeByWriter(String searchKeyword) {
		List<Notice> searchList = nStore.selectNoticeByWriter(session, searchKeyword);
		return searchList;
	}

	@Override
	public List<Notice> searchNoticeByContent(String searchKeyword) {
		List<Notice> searchList = nStore.selectNoticeByContent(session, searchKeyword);
		return searchList;
	}

	@Override
	public List<Notice> searchNoticeAll(String searchKeyword) {
		List<Notice> searchList = nStore.selectNoticeAll(session, searchKeyword);
		return searchList;
	}


	@Override
	public List<Notice> searchNoticeByKeyword(PageInfo pInfo, Map<String, String> paramMap) {
		List<Notice> searchList = nStore.selectNoticeByKeyword(session, pInfo, paramMap);
		return searchList;
	}

	@Override
	public int getListCount(Map<String, String> paramMap) {
		int result = nStore.selectListCount(session, paramMap);
		return result;
	}

}
