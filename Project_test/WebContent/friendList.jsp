<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="user.User2DAO"%>
<%@ page import="user.User2"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Friend List!!!</title>

<!-- Bootstrap core CSS -->
<link href="./Resource/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="./Resource/css/shop-homepage.css" rel="stylesheet">
</head>
<body>
	<!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">Start Bootstrap</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="index.jsp">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Services</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<h1 class="my-4">Shop Name</h1>
				<div class="list-group">
					<a href="#" class="list-group-item">Category 1</a>
					<a href="#" class="list-group-item">Category 2</a>
					<a href="#"	class="list-group-item">Category 3</a>
				</div>
			</div>
			<!-- /.col-lg-3 -->

			<div class="col-lg-9">
				<div id="carouselExampleIndicators" class="carousel slide my-4"	data-ride="carousel">
					<ol class="carousel-indicators">
						<li data-target="#carouselExampleIndicators" data-slide-to="0"
							class="active"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
					</ol>
					<div class="carousel-inner" role="listbox">
						<div class="carousel-item active">
							 <img class="d-block img-fluid" src="https://lh3.googleusercontent.com/proxy/2um5I3iocelIizSyUmFBnEq7fRVNdiYB_RA8QCHw4oJKtpzzQlS2IF1LeMJthgC5dDeJlezn1heeaFHoe3qCOPtETDoHMhQu5duqhU7c3q6bpEVnbrXvJ9am2n9Z1t2F-tcShWhnZ1Srt1mRt2P3mhJWvCi837wsQ7ZgSi-TiCC0ETnu0ohIxS2Wlo2SI4F8DGWE8gslt-t99yzEPKCQf6bAPuO10X3PTlaI02iOnr9iCF40MzGDpTABT9kyh1AypJsD2HWzYnoKlzOhQeH9K-VA4_9hmMEMHkOGc76djLED" style="max-width: 750px; height: 440px;" alt="First slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" src="https://yanolja.in/wp-content/uploads/2018/07/%EC%B2%A8%EB%B6%801-%EC%B4%88%ED%8A%B9%EA%B0%80-%EC%95%BC%EB%86%80%EC%9E%90-%EA%B4%91%EA%B3%A0-2%ED%83%84-%EC%98%81%EC%83%81-%EC%BA%A1%EC%B2%98-%EC%82%AC%EC%A7%84-01.jpg" style="max-width: 750px; height: 440px;" alt="Second slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" src="https://file.mk.co.kr/meet/neds/2020/04/image_readtop_2020_447843_15882129734183157.jpg" style="max-width: 750px; height: 440px;" alt="Third slide">
						</div>
					</div>
					<a class="carousel-control-prev" href="#carouselExampleIndicators"
						role="button" data-slide="prev"> <span
						class="carousel-control-prev-icon" aria-hidden="true"></span> <span
						class="sr-only">Previous</span>
					</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
						role="button" data-slide="next"> <span
						class="carousel-control-next-icon" aria-hidden="true"></span> <span
						class="sr-only">Next</span>
					</a>
				</div>


				<div class="row">
					<%
						User2DAO user2DAO = new User2DAO();
						ArrayList<User2> list = user2DAO.getList();
						for (int i = 0; i < list.size(); i++) {
					%>
					<div class="col-lg-4 col-md-6 mb-4">
						<div class="card h-100">
							<a href="#"><img class="card-img-top"
								src="https://t1.daumcdn.net/cfile/blog/990CE63F5B563DA12D" alt=""></a>
							<div class="card-body">
								<h4 class="card-title">
									<a href="userInfo.jsp"><%=list.get(i).getU_name()%></a>(<%= list.get(i).getU_age() %>)
								</h4>
								<h5><%=list.get(i).getU_loc()%></h5>
								<p class="card-text"><%=list.get(i).getU_hobby() %></p>
								<p class="card-text"><%=list.get(i).getU_talent() %></p>
							</div>
							<div class="card-footer">
							성향 : <%= list.get(i).getU_mbti() %>
								<small class="text-muted">&#9733; &#9733; &#9733;
									&#9733; &#9734;</small>
							</div>
						</div>
					</div>
					<%
						}
					%>
				</div>
				<!-- /.row -->

			</div>
			<!-- /.col-lg-9 -->

		</div>
		<!-- /.row -->

	</div>
	<!-- /.container -->

	<!-- Footer -->
	<footer class="py-5 bg-dark">
		<div class="container">
			<p class="m-0 text-center text-white">Copyright &copy; Your
				Website 2020</p>
		</div>
		<!-- /.container -->
	</footer>

	<!-- Bootstrap core JavaScript -->
	<script src="./Resource/jquery/jquery.min.js"></script>
	<script src="./Resource/js/bootstrap.bundle.min.js"></script>

</body>
</html>