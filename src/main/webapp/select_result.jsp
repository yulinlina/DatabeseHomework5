<%--
  Created by IntelliJ IDEA.
  User: wang haolin
  Date: 2022/10/30
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.Iterator, com.bean.library.TeamMember"  %>
<jsp:useBean id="team_members" class = "java.util.ArrayList" scope = "session"></jsp:useBean>
<html>
<head>
    <title>Title</title>
</head>

<body>
<caption>查询结果</caption>
    <table border="1">   <!---------------------border="1",表格有边框-->
        <tr>
            <th>name</th>
            <th>std_number</th>
            <th>birthday</th>
            <th>hobby</th>
        </tr>
    <%

        Iterator it = team_members.iterator();
        while (it.hasNext())
        {
            TeamMember teamMember = (TeamMember)it.next();
    %>
        <tr>
            <td><%=teamMember.getName()%></td>
            <td><%=teamMember.getStu_number()%></td>
            <td><%=teamMember.getBirthday()%></td>
            <td><%=teamMember.getHobby()%></td>
        </tr>
        <%
        }
        %>
    </table>
<a href="/helloworld_war/index.jsp">返回</a></h2>
</body>
</html>

