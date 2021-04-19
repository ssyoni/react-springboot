<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>View Test Page</title></head>
<body><h2>Hello! ${name}</h2>
<div>JSP List Test</div>
<table style="width:100%">
    <tr>
      <th>no</th>
      <th>제목</th>
      <th>내용</th>
      <th>작성자</th>
    </tr>
    <c:forEach var="item" items="${list}" varStatus="idx"> ${idx.index}, ${item.title} <br/> 
       <tr>
        <td>${item.no}</td>
        <td>${item.title}</td>
        <td>${item.content}</td>
        <td>${item.writer}</td>
      </tr>
    </c:forEach>
  </table>

</body>

</html>