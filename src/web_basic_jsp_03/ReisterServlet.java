package web_basic_jsp_03;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.util.converter.DateTimeStringConverter;



@WebServlet("/chap04/ReisterServlet")
public class ReisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = utf-8");

		String[] gubun = request.getParameterValues("gubun");
		String subject = request.getParameter("subject");

		String member = request.getParameter("member");
		String stuffs = request.getParameter("stuffs");
		String statis = request.getParameter("statis");

		String subjecter = request.getParameter("subjecter");
		String[] mailing = request.getParameterValues("mailing");
		
		String start =request.getParameter("start");
		String end =request.getParameter("end");
		
		

		PrintWriter out = response.getWriter();

		// 복수선택 가능
		String a = null;
		for (String g : gubun) {
			if (g.equals("gy")) {
				a = "문법";
			} else if (g.equals("wr")) {
				a = "작문";
			} else {
				a = "독해";
			}
			out.printf(a + " 하고싶은거  <br>");
		}

		// 1과목 선택
		if (subject.equals("eng")) {
			out.print("영어회화");
		} else if (subject.equals("ch")) {
			out.print("중국어회화");
		} else {
			out.print("일어회화");
		}
		// 멤버
		out.print("member : " + member + "명<br>");
		out.print("stuffs : " + stuffs + " 개 <br>");
		out.print("statis :  " + statis + " <br>");

		// 1과목
		if (subjecter.equals("speaking")) {
			out.print("subjecter : 회화" + "<br>");
		} else if (subjecter.equals("grammer")) {
			out.print("subjecter : 문법" + "<br>");
		} else {
			out.print("subjecter : 작문" + "<br>");
		}

		// 메일링
		String t = null;
		for (String m : mailing) {
			if (m.equals("news")) {
				t = "해외 단신";
			} else if (m.equals("dialog")) {
				t = "5분 회화";
			}else{
				t = "모닝팝스";
			}
			out.print("메일 : " + t + ", <br>" );
		}
		
		// 조회 기간
		
		out.print("start : " + start  );
		out.print("<br> end : " + end + "<br>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
