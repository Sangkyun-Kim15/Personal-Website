package kr.co.mlec.Board;

import java.util.List;

import kr.co.mlec.BoardVO.BoardVO;
import kr.co.mlec.BoardVO.CommentVO;
import kr.co.mlec.BoardVO.SearchVO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<BoardVO> boardSelect() {
		return sqlSessionTemplate.selectList("kr.co.mlec.Board.BoardDAO.boardSelect");
	}
	
	public int boardInsert(BoardVO board) {
		sqlSessionTemplate.insert("kr.co.mlec.Board.BoardDAO.boardInsert", board);
		return board.getBoardNo();
	}
	
	public BoardVO boardDetail(int boardNo) {
		return sqlSessionTemplate.selectOne("kr.co.mlec.Board.BoardDAO.boardDetail", boardNo);
	}
	
	public void boardDelete(int boardNo) {
		sqlSessionTemplate.delete("kr.co.mlec.Board.BoardDAO.boardDelete", boardNo);
	}
	
	public void boardUpdate(BoardVO board) {
		sqlSessionTemplate.update("kr.co.mlec.Board.BoardDAO.boardUpdate", board);
	}
	
	public List<CommentVO> commentSelect(int boardNo) {
		return sqlSessionTemplate.selectList("kr.co.mlec.Board.BoardDAO.commentSelect", boardNo);
	}
}
