package com.personal.CarMall.web.web;

import com.personal.CarMall.web.dao.CarImplementation;
import com.personal.CarMall.web.dao.CarMallDAO;
import com.personal.CarMall.web.entity.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CarQuery")
public class CarQuery extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String query =req.getParameter("query");
        CarMallDAO carMallDAO = new CarImplementation();
        List<Car> car = carMallDAO.getCarByName(query);
        req.setAttribute("car",car);

       req.getRequestDispatcher("/jsp/carListAll.jsp").forward(req, resp);
    }
}
