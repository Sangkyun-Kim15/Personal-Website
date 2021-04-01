<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<style type="text/css">
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript">


</script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>
	<h3><strong> sign up </strong></h3>
	<form name="sform" action="<%=request.getContextPath() %>/login/insert.do" method="post" >
	<table  width="600px" align="center">
			<tr> 
			<th width="" align="right"><font color="red">*</font> 이름 </th> <td> <input type="text"  name="name" id="name"/>    </td>
			</tr>

			<tr> 
			<th width="" align="right">아이디 </th> <td> <input type="text"  name="id" id="id"  />&nbsp;  <span id="sid" ></span> </td>
			</tr>

			<tr> 
			<th width="" align="right">비밀번호 </th> <td> <input type="password"  name="password" id="password"/></td>
			</tr>

			<tr> 
			<th width="" align="right">비밀번호 확인 </th> <td> <input type="password"   name="passwordcheck" id="passwordcheck" /><span></span>  </td>
			</tr>
			
			<tr> 
			<th width="" align="right">이메일 </th> <td> <input type="text"   name="email" id="email"/>&nbsp; 
				<select>
					 <option value="1">직접입력</option>
					 <option>naver.com</option>
					 <option>daum.net</option>
 					 <option>gmail.com</option>	 				
				</select>
			  </td>
			</tr>			

			<tr> 
			<th width="" align="center" colspan="2"> <input type="submit" value="다음"> <input type="button"  value="취소" />  </th>
			</tr>			
			
	</table>
	</form>
</body>
</html>