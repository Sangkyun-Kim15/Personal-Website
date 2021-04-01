package kr.co.mlec.Login;

import java.util.List;

import kr.co.mlec.BoardVO.LoginVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServieImpl implements LoginService {

		@Autowired
		private LoginDAO loginDAO;
		
		public void loginInsert(LoginVO loginVO) throws Exception {
			loginDAO.loginInsert(loginVO);
		}
		
		public List<LoginVO> check() throws Exception {
			return loginDAO.check();
		}
}
