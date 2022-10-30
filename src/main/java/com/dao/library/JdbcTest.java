package com.dao.library;

import  java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bean.library.TeamMember;

public class JdbcTest {

    public List<TeamMember> jdbc(TeamMember teamMember) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password ="123";

        Class.forName("org.postgresql.Driver");

        Connection connection= DriverManager.getConnection(url,username,password);
        if (connection!= null) System.out.println("Connected to the database!");
        else {
            System.out.println("Failed to make connection!");
        }

        Statement statement= connection.createStatement();
        String number=teamMember.getStu_number();
        System.out.println(number);
        String sql ="select * from team_member where stu_number like ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,number+"%");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<TeamMember> teamMembers =new ArrayList<TeamMember>();
        while (resultSet.next())
        {
            System.out.println("name = "+resultSet.getObject("name"));
            teamMember =new TeamMember();
            teamMember.setName(resultSet.getString("name"));
            teamMember.setStu_number(resultSet.getString("stu_number"));
            teamMember.setBirthday(resultSet.getDate("birthday"));
            teamMember.setHobby(resultSet.getString("hobby"));
            teamMembers.add(teamMember);

        }
        resultSet.close();
        statement.close();
        connection.close();
        return teamMembers;

    }

    public List<TeamMember> sqyByName(TeamMember teamMember) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password ="123";

        Class.forName("org.postgresql.Driver");

        Connection connection= DriverManager.getConnection(url,username,password);
        if (connection!= null) System.out.println("Connected to the database!");
        else {
            System.out.println("Failed to make connection!");
        }

        Statement statement= connection.createStatement();
        String name=teamMember.getName();
        String sql ="select * from team_member where name like ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,'%'+name+'%');
        ResultSet resultSet = preparedStatement.executeQuery();

        List<TeamMember> teamMembers =new ArrayList<TeamMember>();
        while (resultSet.next())
        {
            System.out.println("name = "+resultSet.getObject("name"));
            teamMember =new TeamMember();
            teamMember.setName(resultSet.getString("name"));
            teamMember.setStu_number(resultSet.getString("stu_number"));
            teamMember.setBirthday(resultSet.getDate("birthday"));
            teamMember.setHobby(resultSet.getString("hobby"));
            teamMembers.add(teamMember);

        }
        resultSet.close();
        statement.close();
        connection.close();
        return teamMembers;

    }
    public List<TeamMember> sqyByHobby(TeamMember teamMember) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password ="123";

        Class.forName("org.postgresql.Driver");

        Connection connection= DriverManager.getConnection(url,username,password);
        if (connection!= null) System.out.println("Connected to the database!");
        else {
            System.out.println("Failed to make connection!");
        }

        Statement statement= connection.createStatement();
        String hobby=teamMember.getHobby();
        String sql ="select * from team_member where hobby like ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,hobby+"%");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<TeamMember> teamMembers =new ArrayList<TeamMember>();
        while (resultSet.next())
        {
            System.out.println("name = "+resultSet.getObject("name"));
            teamMember =new TeamMember();
            teamMember.setName(resultSet.getString("name"));
            teamMember.setStu_number(resultSet.getString("stu_number"));
            teamMember.setBirthday(resultSet.getDate("birthday"));
            teamMember.setHobby(resultSet.getString("hobby"));
            teamMembers.add(teamMember);

        }
        resultSet.close();
        statement.close();
        connection.close();
        return teamMembers;

    }
}
