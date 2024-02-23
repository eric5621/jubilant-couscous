package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex04Operation")
public class Ex04Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int data1 = Integer.parseInt(request.getParameter("data1"));
	int data2 = Integer.parseInt(request.getParameter("data2"));
	
	// + 연산에 따라 해당 연산을 진행할 수 있는 로직! - > 조건문
	String op = request.getParameter("op");
	
	int result = 0;
	if(op.equals("+")) {
		result = data1+data2;
	} else if(op.equals("-")) {
		result = data1-data2;
	} else if(op.equals("*")) {
		result = data1*data2;
	} else {
		result = data1/data2;
	}
	
	
	// 3. 화면에 결과값이 실행되도록 만들기!
	PrintWriter out = response.getWriter();
	out.print(result);
	
	
	
	
	
	}

}
