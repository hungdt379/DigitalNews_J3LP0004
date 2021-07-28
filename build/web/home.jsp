<%-- 
    Document   : home
    Created on : Mar 17, 2020, 9:11:56 PM
    Author     : dangt
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Digital News</title>
        <link href="css/home.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>

        <div class="preheader"></div>
        <div class="header"><b>My Digital News</b></div>
        <div class="menu"><a href="home">News</a></div>
        <div class="main">
            <div class="left-main">
                <a href="#" class="title">${curNew.title}</a> 
                <div class="eyes">
                    <img src="image/${curNew.image}">

                </div>
                <div class="text">${curNew.description}
                </div>
                <hr/>
                <div class="author">
                    <div class="content-author">By ${curNew.author} | ${curNew.getPostTime()}</div>
                </div>
            </div>
            <div class="right-main">
                <div class="option">Digital News</div>
                <div class="text">
                    ${listTop5.get(0).shortDes}
                </div>
                <div class="option">Search</div>
                <form action="search" method="post">
                    <div class="search">
                        <input type="text" id="search" placeholder="input text here... " name="inputSearch"><input class="btn-go" type="submit" value="Go">
                    </div>
                </form>
                <div class="option">Last Articles</div>
                <div class="link">
                    <c:forEach items="${listTop5}" var="n">
                        <a href="home?id=${n.id}" class="text">${n.title}</a> 
                    </c:forEach>

                </div>
            </div>

        </div>
        <div class="footer">

        </div>

    </body>
</html>
