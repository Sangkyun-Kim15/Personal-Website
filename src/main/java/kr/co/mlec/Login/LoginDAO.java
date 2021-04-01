package kr.co.mlec.Login;

import java.util.List;

import kr.co.mlec.BoardVO.LoginVO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void loginInsert(LoginVO loginVO) {
		sqlSessionTemplate.insert("kr.co.mlec.Login.LoginDAO.loginInsert", loginVO);
	}
	
	public List<LoginVO> check() {
		return sqlSessionTemplate.selectList("kr.co.mlec.Login.LoginDAO.check");
	}
}
