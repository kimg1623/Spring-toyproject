<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <title>도서 상세정보</title>
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
            <h1 class="display-3">도서 정보</h1>
        </div>
    </div>

    <div class="container">
        <div class="row" >
            <div class="col-md-12">
                <h3>${book.name}</h3>
                <p>${book.description}</p>
                   <br>
                <p><b>도서코드</b> : <span class="badge badge-info">${book.bookId}</span>
                <p><b>저자</b> : ${book.author}
                <p><b>출판사</b> : ${book.publisher}
                <p><b>출판일</b> : ${book.releaseDate}
                <p><b>분류</b> : ${book.category}
                <p><b>재고수</b> : ${book.unitsInStock}
                <h4>${book.unitPrice}원</h4>
                <br>
                <p>
                    <a href="#" class="btn btn-primary">도서주문 &raquo;</a>
                    <a href="<c:url value="/books"/> " class="btn btn-secondary">도서목록 &raquo;</a>
                </p>
            </div>
        </div>
        <hr>
        <footer class="container">
            <p>&copy; JiwonKim</p>
        </footer>
    </div>
</body>
</html>
