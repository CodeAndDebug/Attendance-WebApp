<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<title>View Employee</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<!--===============================================================================================-->
</head>

<body>

	<div class="limiter">
		<div class="container-login100" style="background-image: url('images/bg-01.jpg');">
			<div class="container table-responsive py-5">
				<table class="table table-bordered table-hover">
					<thead class="thead-dark">
						<tr>
							<th scope="col">#</th>
							<th scope="col">Name</th>
							<th scope="col">Email</th>
							<th scope="col">Age</th>
							<th scope="col">Address</th>
							<th scope="col" colspan="3"></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th scope="row">1</th>
							<td>Mark</td>
							<td>mark@gmail.com</td>
							<td>@22</td>
							<td>Faridabad</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="viewHistory.jsp">
										<button class="login100-form-btn">View History</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="addEmployee.jsp">
										<button class="login100-form-btn">Edit</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="#">
										<button class="login100-form-btn">Delete</button>
									</a>
								</div>
							</td>
						</tr>
						<tr>
							<th scope="row">2</th>
							<td>Jacob</td>
							<td>Thornton</td>
							<td>@fat</td>
							<td>Faridabad</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="viewHistory.jsp">
										<button class="login100-form-btn">View History</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="addEmployee.jsp">
										<button class="login100-form-btn">Edit</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="#">
										<button class="login100-form-btn">Delete</button>
									</a>
								</div>
							</td>
						</tr>
						<tr>
							<th scope="row">3</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="viewHistory.html">
										<button class="login100-form-btn">View History</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="addEmployee.html">
										<button class="login100-form-btn">Edit</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="#">
										<button class="login100-form-btn">Delete</button>
									</a>
								</div>
							</td>
						</tr>
						<tr>
							<th scope="row">4</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<a class="txt1" href="viewHistory.html">
									<div class="container-login100-form-btn mt-3 mb-3">
										<button class="login100-form-btn">View History</button>
									</div>
								</a>
							</td>
							<td>
								<a class="txt1" href="addEmployee.html">
									<div class="container-login100-form-btn mt-3 mb-3">
										<button class="login100-form-btn">Edit</button>
									</div>
								</a>
							</td>
							<td>
								<a class="txt1" href="#">
									<div class="container-login100-form-btn mt-3 mb-3">
										<button class="login100-form-btn">Delete</button>
									</div>
								</a>
							</td>
						</tr>
						<tr>
							<th scope="row">5</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<a class="txt1" href="viewHistory.html">
									<div class="container-login100-form-btn mt-3 mb-3">
										<button class="login100-form-btn">View History</button>
									</div>
								</a>
							</td>
							<td>
								<a class="txt1" href="addEmployee.html">
									<div class="container-login100-form-btn mt-3 mb-3">
										<button class="login100-form-btn">Edit</button>
									</div>
								</a>
							</td>
							<td>
								<a class="txt1" href="#">
									<div class="container-login100-form-btn mt-3 mb-3">
										<button class="login100-form-btn">Delete</button>
									</div>
								</a>
							</td>
						</tr>
						<tr>
							<th scope="row">6</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<a class="txt1" href="viewHistory.html">
									<div class="container-login100-form-btn mt-3 mb-3">
										<button class="login100-form-btn">View History</button>
									</div>
								</a>
							</td>
							<td>
								<a class="txt1" href="addEmployee.html">
									<div class="container-login100-form-btn mt-3 mb-3">
										<button class="login100-form-btn">Edit</button>
									</div>
								</a>
							</td>
							<td>
								<a class="txt1" href="#">
									<div class="container-login100-form-btn mt-3 mb-3">
										<button class="login100-form-btn">Delete</button>
									</div>
								</a>
							</td>
						</tr>
						<tr>
							<th scope="row">7</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="viewHistory.html">
										<button class="login100-form-btn">View History</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="addEmployee.html">
										<button class="login100-form-btn">Edit</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="#">
										<button class="login100-form-btn">Delete</button>
									</a>
								</div>
							</td>
						</tr>
						<tr>
							<th scope="row">8</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="viewHistory.html">
										<button class="login100-form-btn">View History</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="addEmployee.html">
										<button class="login100-form-btn">Edit</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="#">
										<button class="login100-form-btn">Delete</button>
									</a>
								</div>
							</td>
						</tr>
						<tr>
							<th scope="row">9</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="viewHistory.html">
										<button class="login100-form-btn">View History</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="addEmployee.html">
										<button class="login100-form-btn">Edit</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="#">
										<button class="login100-form-btn">Delete</button>
									</a>
								</div>
							</td>
						</tr>
						<tr>
							<th scope="row">10</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="viewHistory.html">
										<button class="login100-form-btn">View History</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="addEmployee.html">
										<button class="login100-form-btn">Edit</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="#">
										<button class="login100-form-btn">Delete</button>
									</a>
								</div>
							</td>
						</tr>
						<tr>
							<th scope="row">11</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="viewHistory.html">
										<button class="login100-form-btn">View History</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="addEmployee.html">
										<button class="login100-form-btn">Edit</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="#">
										<button class="login100-form-btn">Delete</button>
									</a>
								</div>
							</td>
						</tr>
						<tr>
							<th scope="row">12</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="viewHistory.html">
										<button class="login100-form-btn">View History</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="addEmployee.html">
										<button class="login100-form-btn">Edit</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="#">
										<button class="login100-form-btn">Delete</button>
									</a>
								</div>
							</td>
						</tr>
						<tr>
							<th scope="row">13</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="viewHistory.html">
										<button class="login100-form-btn">View History</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="addEmployee.html">
										<button class="login100-form-btn">Edit</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="#">
										<button class="login100-form-btn">Delete</button>
									</a>
								</div>
							</td>
						</tr>
						<tr>
							<th scope="row">14</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="viewHistory.html">
										<button class="login100-form-btn">View History</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="addEmployee.html">
										<button class="login100-form-btn">Edit</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="#">
										<button class="login100-form-btn">Delete</button>
									</a>
								</div>
							</td>
						</tr>
						<tr>
							<th scope="row">15</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
							<td>Faridabad</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="viewHistory.html">
										<button class="login100-form-btn">View History</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="addEmployee.html">
										<button class="login100-form-btn">Edit</button>
									</a>
								</div>
							</td>
							<td>
								<div class="container-login100-form-btn mt-3 mb-3">
									<a class="txt1" href="#">
										<button class="login100-form-btn">Delete</button>
									</a>
								</div>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

		</div>
	</div>


	<div id="dropDownSelect1"></div>

	<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>

</html>