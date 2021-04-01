package kr.co.mlec.Login;

import java.util.List;

import kr.co.mlec.BoardVO.LoginVO;

public interface LoginService {
	
	public void loginInsert(LoginVO loginVO) throws Exception;
	
	public List<LoginVO> check() throws Exception;
}
