package kr.co.mlec.Board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.mlec.BoardVO.BoardVO;
import kr.co.mlec.BoardVO.CommentVO;
import kr.co.mlec.BoardVO.SearchVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	public List<BoardVO> boardSelect() throws Exception {
		return boardDAO.boardSelect();
	}
	
	public int boardInsert(BoardVO board) throws Exception{
		return boardDAO.boardInsert(board);
	}
	
	public BoardVO boardDetail(int boardNo) throws Exception {
		return boardDAO.boardDetail(boardNo);
	}
	
	public void boardDelete(int boardNo) throws Exception {
		boardDAO.boardDelete(boardNo);
	}
	
	public void boardUpdate(BoardVO board) throws Exception {
		boardDAO.boardUpdate(board);
	}
	
	public List<CommentVO> commentSelect(int boardNo) throws Exception {
		return boardDAO.commentSelect(boardNo);
	}
}
