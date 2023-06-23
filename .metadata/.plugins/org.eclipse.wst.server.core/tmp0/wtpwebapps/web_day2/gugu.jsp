
<%@page import="com.woorifis.day2.controller.MakeGugu"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%
      List<Integer> list = MakeGugu.getInstance().getGugu(3);
   
   %>
   <table>
      <tr>
         <th>dan</th>
         <th>i<th>
         <th>result</th>
      </tr>
      <%
         for(int i=0; i<list.size(); i++)  {
            %>
            <tr>
               <td>3</td>
               <td><%=list.get(i) %></td>
            </tr>
            <%
         }
         %>   
   
   </table>
   
</body>
</html>