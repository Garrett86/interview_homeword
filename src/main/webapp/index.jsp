<%@ page import="tw.com.kai.interview_program.pojo.Mall" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>搜索頁面</title>
</head>
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
<body>
<h1>查詢商品</h1>
<form action="searchServlet" method="get">
    關鍵字：<input type="text" name="keyword" />
    <input type="submit" value="查詢" />
</form>
<hr/>
<h2>搜尋結果</h2>
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

</body>
</html>