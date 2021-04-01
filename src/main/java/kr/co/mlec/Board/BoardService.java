package kr.co.mlec.Board;

import java.util.List;
import java.util.Map;

import kr.co.mlec.BoardVO.BoardVO;
import kr.co.mlec.BoardVO.CommentVO;
import kr.co.mlec.BoardVO.SearchVO;

public interface BoardService {

	public List<BoardVO> boardSelect() throws Exception;

	public int boardInsert(BoardVO board) throws Exception;
	
	public BoardVO boardDetail(int boardNo) throws Exception;
	
	public void boardDelete(int boardNo) throws Exception;
	
	public void boardUpdate(BoardVO board) throws Exception;
	
	public List<CommentVO> commentSelect(int boardNo) throws Exception;
}
