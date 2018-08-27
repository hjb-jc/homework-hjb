package com.personal.CarMall.web.web;

import com.personal.CarMall.web.dao.CarImplementation;
import com.personal.CarMall.web.dao.CarMallDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CarDel")
public class CarDel extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarMallDAO carMallDAO = new CarImplementation();
        String[] ids = req.getParameterValues("check");
        System.out.println(ids);
        String msg="";
        for (String id : ids) {
            if (carMallDAO.deleteCar(Integer.parseInt(id))){
                msg="删除成功！";
            }else{
                msg="删除失败！";
            }
        }
        req.getSession().setAttribute("msg",msg);
        //resp.sendRedirect("/jsp/carLists");
        req.getRequestDispatcher("/jsp/carLists.jsp").forward(req,resp);
    }
}
