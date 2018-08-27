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
@WebServlet("/CarDetails")
public class CarDetails extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收客户端传给来的id
        int id=Integer.parseInt(req.getParameter("id"));
        CarMallDAO carMallDAO= new CarImplementation();
        //调用功能类getCarByid（）方法
        Car car= carMallDAO.getCarByid(id);
        //设置属性存值
        req.setAttribute("car",car);
        //请求转发会带着car属性过去包含值
        req.getRequestDispatcher("/jsp/carDetails.jsp").forward(req,resp);
    }
}
