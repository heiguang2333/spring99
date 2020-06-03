package com.hzit.controller;

import com.hzit.model.Person;
import com.hzit.model.Student;
import com.hzit.service.IPersonService;
import com.hzit.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/log")
public class controller extends HttpServlet {
    @Autowired
    private Student student;
    @Autowired
    private IPersonService iPersonService;
    @Autowired
    private Person person;
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext application=this.getServletContext();
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,application);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       student.say();
       //参数带name的
       iPersonService.save("la");
       //有return的
       iPersonService.findAll();

        //参数带person的
       iPersonService.savePerson(person);
       // super.service(req, resp);
    }
}
