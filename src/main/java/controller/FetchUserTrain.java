package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TrainDao;
import dto.Train;

public class FetchUserTrain extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		TrainDao dao = new TrainDao();
		List<Train> list = dao.fetchAll();

		if (list.isEmpty()) {
			res.getWriter().print("<h1 style='color:red'>No Railway information Available</h1>");
			req.getRequestDispatcher("UserHome.html").include(req, res);
		}
		else {
			req.setAttribute("list", list);
			req.getRequestDispatcher("UserFetchRailwayInfo.jsp").forward(req, res);
		}
	}

}
