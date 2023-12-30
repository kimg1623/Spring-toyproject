`<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <title>도서 목록</title>
</head>
<body>
    <nav class="navbar navbar-expand navbar-dark bg-dark">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="${pageContext.request.contextPath}/home">Home</a>
            </div>
        </div>
    </nav>

    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3">도서 목록</h1>
        </div>
    </div>

    <div class="container">
        <div class="row" align="center">
            <c:forEach items="${bookList}" var="book">
                <div class="col-md-4">
                    <h3>${book.name}</h3>
                    <p>${book.author}</p>
                    <br>${book.publisher} | ${book.releaseDate}
                    <p align="left">${fn:substring(book.description, 0, 100)}...</p> <!-- JSTL function 태그로 문자열 자르기 (문자열,시작index, 끝index앞) -->
                    <p>${book.unitPrice}원</p>
                    <p><a href="<c:url value="/books/book?id=${book.bookId}"/>" class="btn btn-secondary" role="button">상세정보 &raquo;</a> </p>
                </div>
            </c:forEach>
        </div>
    </div>

    <footer class="container">
        <hr>
        <p>&copy; JiwonKim</p>
    </footer>
</body>
</html>
`