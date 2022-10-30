<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<h1>team_member</h1>
<caption>人员信息表</caption> <!---------------------给表格设置一个标题-->
<body>
    <table border="1">   <!---------------------border="1",表格有边框-->
        <tr>
            <th>name</th>
            <th>std_number</th>
            <th>birthday</th>
            <th>hobby</th>
        </tr>
        <tr>
            <td>牛佳文</td>
            <td>2019</td>
            <td>'2002-07-05'</td>
            <td>coding</td>

        </tr>
        <tr>
            <td>王昊霖</td>
            <td>2020141440041</td>
            <td>2001-02-22'</td>
            <td>badminton</td>
        </tr>
        <tr>
            <td>丁国峰</td>
            <td>2019141410259</td>
            <td>2022-02-22'</td>
            <td>coding</td>
        </tr>
        <tr>
            <td>陈俊予</td>
            <td>2020141500041</td>
            <td>2002-10-31'</td>
            <td>reading</td>
        </tr>
    </table>

<form action="/helloworld_war/servlet/SelectServlet" method="post">
    <table>
        <tr>
            <td>按学号查询:</td>
            <td><input type="text" name="stu_number"></td>
            <td><input type="submit" value="提交"></td>
        </tr>

    </table>
</form>

<form action="/helloworld_war/servlet/SelectBynameServlet" method="post">
    <table>
        <tr>
            <td>按姓名查询:</td>
            <td><input type="text" name="name"></td>
            <td><input type="submit" value="提交"></td>
        </tr>

    </table>
</form>

<form action="/helloworld_war/servlet/SelectByhobbyServlet" method="post">
    <table>
        <tr>
            <td>按爱好查询:</td>
            <td><input type="text" name="hobby"></td>
            <td><input type="submit" value="提交"></td>
        </tr>

    </table>
</form>

</body>
</html>