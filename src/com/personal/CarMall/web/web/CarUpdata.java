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

@WebServlet("/CarUpdata")
public class CarUpdata extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id =Integer.parseInt(req.getParameter("id"));
        CarMallDAO carMallDAO = new CarImplementation();
        Car car=carMallDAO.getCarByid(id);
        req.setAttribute("car",car);
        req.getRequestDispatcher("/jsp/carUpdata.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id =Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        String model= req.getParameter("model");
        String color= req.getParameter("color");
        float price= Float.parseFloat(req.getParameter("price"));

        Car car= new Car(id,name,model,color,price);
        CarMallDAO carMallDAO= new CarImplementation();
        carMallDAO.updataCar(car);
        req.getSession().setAttribute("msg","更新成功");

        resp.sendRedirect("/jsp/carLists.jsp");
    }
}
