<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="tw.com.kai.interview_program.pojo.Mall" %><%--
  Created by IntelliJ IDEA.
  User: Garrett  Lyu
  Date: 2024/11/28
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查詢結果</title>
    <style>
        table {
            border-collapse: separate; /* 使用分離邊框模式 */
            border-spacing: 10px; /* 格子之間的距離 */
            width: 100%;
        }

        th,td{
            border: 1px solid black;
            padding: 10px;
        }
        tr{
            text-align: center;
        }
    </style>
</head>
<body>
<h1>查詢結果</h1>
<p>關鍵字:<%=request.getAttribute("keyword")%>
</p>
<table>
    <tr>
        <th>ID</th>
        <th>商品名稱</th>
        <th>價格</th>
        <th>賣出數量</th>
        <th>庫存數量</th>
    </tr>
    <%
        List<Mall> malls = (List<Mall>) request.getAttribute("listMall");
        if (malls != null && !malls.isEmpty()) {
            for (Mall mall : malls) {
    %>

    <tr>
        <td><%= mall.getId()%>
        </td>
        <td><%= mall.getName()%>
        </td>
        <td><%= mall.getPrice()%>
        </td>
        <td><%= mall.getSaleCount()%>
        </td>
        <td><%= mall.getBreadCount()%>
        </td>
    </tr>
    <%
        }
    } else {

    %>
    <tr>
        <td colspan="3">查無資料</td>
    </tr>
    <%
        }
    %>
</table>
<a href="index.jsp">重新查詢</a>
</body>
</html>
