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
@WebServlet("/CarAdd")
public class CarAdd extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id =Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        String model=req.getParameter("model");
        String color=req.getParameter("color");
        float price= Float.parseFloat(req.getParameter("price"));

        Car cars= new Car(id,name,model,color,price);
        CarMallDAO carMallDAO= new CarImplementation();
        Car car=carMallDAO.addCar(cars);
        req.getSession().setAttribute("msg","添加成功！");
        req.getRequestDispatcher("/jsp/carLists.jsp").forward(req,resp);
    }
}
