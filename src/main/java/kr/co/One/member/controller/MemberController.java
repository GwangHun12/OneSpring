package kr.co.One.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.One.member.domain.Member;
import kr.co.One.member.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;

	@RequestMapping(value="/member/register.do", method=RequestMethod.GET)
	public String showRegisterForm() {
		return "member/register";
	}
	
	@RequestMapping(value="/member/register.do", method=RequestMethod.POST)
	public String registerMember(
			@ModelAttribute Member member
			, Model model) {
		try {
			int result = service.insertMember(member);
			if(result > 0) {
				return "member/login";
			} else {
				model.addAttribute("msg", "회원가입이 완료되지 않았습니다.");
				model.addAttribute("error", "회원가입 실패");
				model.addAttribute("url", "/member/register.do");
				return "common/errorPage";
			}
		} catch (Exception e) {
			model.addAttribute("msg", "관리자에게 문의해주세요.");
			model.addAttribute("error", e.getMessage());
			model.addAttribute("url", "/member/register.do");
			return "common/errorPage";
		}
	}
	
	@RequestMapping(value="/member/login.do", method=RequestMethod.GET)
	public String memberLoginform() {
		return "member/login";
	}
	@RequestMapping(value="/member/login.do", method=RequestMethod.POST)
	public String memberLoginCheck(
			@ModelAttribute Member member
			, HttpSession session
			, Model model) {
		try {
			Member mOne = service.checkMemberLogin(member);
			if(mOne != null) {
				session.setAttribute("memberId", mOne.getmemberId());
				session.setAttribute("pass", mOne.getpass());
				return "redirect:/index.jsp";
			} else {
				model.addAttribute("msg", "로그인이 완료되지 않았습니다.");
				model.addAttribute("error", "로그인 실패");
				model.addAttribute("url", "/member/login.do");
				return "common/errorPage";
			}
		} catch (Exception e) {
			model.addAttribute("msg", "관리자에게 문의해주세요.");
			model.addAttribute("error", e.getMessage());
			model.addAttribute("url", "/member/register.do");
			return "common/errorPage";
		}
	}
	
	@RequestMapping(value="/member/logout.do", method=RequestMethod.GET)
	public String memberLogout(HttpSession session, Model model) {
		if(session != null) {
			session.invalidate();
			return "redirect:/index.jsp";
		} else {
			model.addAttribute("error", "로그아웃을 완료하지 못하였습니다.");
			model.addAttribute("msg", "로그아웃 실패");
			model.addAttribute("url", "/index.jsp");
			return "common/errorPage";
		}
	}
	
	@RequestMapping(value="/member/mypage.do", method=RequestMethod.GET)
	public String showDetailMember(
			HttpServletRequest request
			, HttpServletResponse response
			, @RequestParam("memberId") String memberId
			, Model model) {
		try {
			Member mOne = service.showOneById(memberId);
			if(mOne != null) {
				model.addAttribute("member", mOne);
				return "member/mypage";
			} else {
				model.addAttribute("error", "회원정보를 가져오지 못하였습니다.");
				model.addAttribute("msg", "회원정보 조회 실패.");
				model.addAttribute("url", "/index.jsp");
				return "common/errorPage";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("error", "관리자에게 문의하세요.");
			model.addAttribute("msg", e.getMessage());
			model.addAttribute("url", "/index.jsp");
			return "common/errorPage";
		}
	}
	
	@RequestMapping(value="/member/update.do", method=RequestMethod.GET)
	public String showModifyForm(
			String memberId
			, Model model) {
		Member mOne = service.showOneById(memberId);
		model.addAttribute("member", mOne);
		return "member/modify";
	}
	
	@RequestMapping(value="/member/update.do", method=RequestMethod.POST)
	public String modifyMember(
			@ModelAttribute Member mOne
			, Model model) {
		try {
			int result = service.updateMember(mOne);
			if(result > 0) {
				return "redirect:/index.jsp";
			} else {
				model.addAttribute("error", "회원정보 수정이 완료되지 않았습니다.");
				model.addAttribute("msg", "회원정보 수정 실패");
				model.addAttribute("url", "/member/mypage.do?memberId"+mOne.getmemberId());
				return "common/errorPage";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("error", "회원정보 수정 실패.");
			model.addAttribute("msg", e.getMessage());
			model.addAttribute("url", "/index.jsp");
			return "common/errorPage";
		}
	}


@RequestMapping(value="/member/delete.do", method=RequestMethod.GET)
public String outServiceMember(
		@RequestParam("memberId") String memberId
		, Model model) {
	try {
		int result = service.deleteMember(memberId);
		if(result > 0) {
			return "redirect:/member/logout.do";
		} else {
			model.addAttribute("error", "회원 탈퇴가 완료되지 않았습니다.");
			model.addAttribute("msg", "회원탈퇴 실패");
			model.addAttribute("url", "/index.jsp");
			return "common/errorPage";
		}
	} catch (Exception e) {
		e.printStackTrace();
		model.addAttribute("error", "회원탈퇴 실패.");
		model.addAttribute("msg", e.getMessage());
		model.addAttribute("url", "/index.jsp");
		return "common/errorPage";
	}
}
}
