package kr.co.mlec.Login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.HttpSession;

import kr.co.mlec.BoardVO.LoginVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping("/insert.do")
	public ModelAndView loginInsert(LoginVO loginVO) throws Exception{
		service.loginInsert(loginVO);
		ModelAndView mav = new ModelAndView("main");
		
		return mav;
	}
	
	@RequestMapping("/check.do")
	@ResponseBody
	public List<LoginVO> check() throws Exception {
		List<LoginVO> list = service.check();
		
		return list;
	}
	
	@RequestMapping("/login.do")
	public ModelAndView login(HttpServletRequest req, HttpServletResponse res , LoginVO loginVO) throws Exception {
		HttpSession session = req.getSession();
		String id = loginVO.getId();
		session.setAttribute("id", id);
		ModelAndView mav = new ModelAndView("main");
		mav.addObject("id", id);
		
		return mav;
	}
	
	@RequestMapping("/logout.do")
	public ModelAndView logout(HttpServletRequest req, HttpServletResponse res, @RequestParam(value = "id") String id) throws Exception{
		HttpSession session = req.getSession();
		session.removeAttribute("id");
		ModelAndView mav = new ModelAndView("main");
		
		return mav;
	}
}
