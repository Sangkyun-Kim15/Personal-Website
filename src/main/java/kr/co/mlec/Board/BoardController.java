package kr.co.mlec.Board;

import java.util.List;
import java.util.Map;

import kr.co.mlec.BoardVO.BoardVO;
import kr.co.mlec.BoardVO.CommentVO;
import kr.co.mlec.BoardVO.PageVO;
import kr.co.mlec.BoardVO.SearchVO;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("/select.do")
	public ModelAndView boardSelect(SearchVO param) throws Exception {
		ModelAndView mav = new ModelAndView("board/list");
		
		//int listSize = 5;
		//int pageNo = param.getPageNo();
		//int start = (pageNo - 1) * listSize + 1;
		//int end = pageNo * listSize;
		//param.setStart(start);
		//param.setEnd(end);
		
		// Map<String, Object> result = service.boardSelect(param);
		List<BoardVO> list = service.boardSelect();
		// int count = (Integer)result.get("count");
		// PageVO pageVO = new PageVO("select.do", pageNo, count);
		
		mav.addObject("list", list);
		// mav.addObject("pageVO", pageVO);
		
		return mav;
	}
	
	@RequestMapping("/insert.do")
	public String boardInsert(BoardVO board) throws Exception {
		ModelAndView mav = new ModelAndView("board/list");
		service.boardInsert(board);
		
		return "redirect:select.do";
	}
	
	@RequestMapping("/detail.do")
	public ModelAndView boardDetail(@RequestParam(value="boardNo") int boardNo ) throws Exception {
		ModelAndView mav = new ModelAndView("board/detail");
		BoardVO board = service.boardDetail(boardNo);
		
		mav.addObject("board", board);
		return mav;
	}
	
	@RequestMapping("/delete.do")
	public String boardDelete(@RequestParam(value="boardNo") int boardNo) throws Exception {
		ModelAndView mav = new ModelAndView("board/list");
		service.boardDelete(boardNo);
		return "redirect:select.do?call=D";
	}
	
	@RequestMapping("/updateForm.do")
	public ModelAndView updateForm(@RequestParam(value="boardNo") int boardNo) throws Exception {
		ModelAndView mav = new ModelAndView("board/updateForm");
		BoardVO board = service.boardDetail(boardNo);
		mav.addObject("board", board);
		
		return mav;
	}
	
	@RequestMapping("/update.do")
	public String boardUpdate(BoardVO board) throws Exception {
		ModelAndView mav = new ModelAndView("board/list");
		service.boardUpdate(board);
		
		return "redirect:select.do?call=U";
	}
	
	@RequestMapping("/cmtList.json")
	@ResponseBody
	public List<CommentVO> listComment(int boardNo) throws Exception {
		ModelAndView mav = new ModelAndView("board/detail");
		List<CommentVO> list = service.commentSelect(boardNo);
		
		return list;
	}
}
