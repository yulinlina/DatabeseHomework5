package com.controller.library;
import com.bean.library.TeamMember;
import com.dao.library.JdbcTest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SelectBynameServlet extends HttpServlet{

    public void service(HttpServletRequest request, HttpServletResponse response){
        try
        {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        String name= request.getParameter("name");
        TeamMember teamMember = new TeamMember(null, null, null, null);


        if (name!= null) {
            teamMember.setName(name);
            JdbcTest jdbcTest = new JdbcTest();
            try {
                request.getSession().setAttribute("team_members",  jdbcTest.sqyByName(teamMember));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        try
        {
            response.sendRedirect("/helloworld_war/select_result.jsp");
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
