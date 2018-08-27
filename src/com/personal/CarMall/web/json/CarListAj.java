package com.personal.CarMall.web.json;

import com.google.gson.Gson;
import com.personal.CarMall.web.dao.CarImplementation;
import com.personal.CarMall.web.dao.CarMallDAO;
import com.personal.CarMall.web.entity.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CarListAj extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json,charset=utf-8");
        resp.setCharacterEncoding("utf-8");

        CarMallDAO carMallDAO= new CarImplementation();
        List<Car> cars= carMallDAO.getCarInfoAll();

        Gson gson=new Gson();
        PrintWriter out= resp.getWriter();
        String carjson= gson.toJson(cars);
        out.write(carjson);
        out.close();
    }
}
