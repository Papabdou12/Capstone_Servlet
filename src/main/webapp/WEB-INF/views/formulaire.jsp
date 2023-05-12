<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../css/bootstrap.min.css" type = "text/css">
</head>
<body>

	 <nav class="navbar navbar-light bg-info">
          <div class="container-fluid" >
            <a class="navbar-brand">Student Management Application</a>
            <a class="navbar-brand" href = "/">List</a>
            <form class="d-flex">
             <a type="button" class="btn btn-outline-light" href="/logout.do">Log Out</a>
            </form>
          </div>
        </nav>
     <!-- <% String username = (String) request.getSession().getAttribute("username"); %>
        <h1>Welcome <%=username%></h1> -->
          <div class="container col-md-5" style="margin-top: 15%;">
            <div class="card">
              <div class="card-body">
        <fieldset class="form-group" >
        	<form action="list.do" metod="post">
                 <div>
                     <label>FirstName</label> <input type="text"
                    value="" class="form-control" name="firstName" required="required">
                    </div>
                 
                    <div>
                    <label>LastName</label>
                     <input type="text" value="" class="form-control"	name="lastName">
                      </div>
                  
                    <div>
                     <label>Date Of Birthday</label> 
                     <input type="Date" value="" class="form-control" name="dateofBirth">
                    </div>
                 
                    <div>
                    <label>Training Duration</label> 
                    <input type="text" value="" class="form-control" name="trainingDuration">
                    </div>
                    <div>
                    <label>Registration Date</label> 
                    <input type="Date" value="" class="form-control" name="registrationDate">
                    </div>
                  
                    <div style="margin-top: 5px;">
                      <button type="submit" class="btn btn-success" value="">Save</button>
                      </div>
                </form>
              </fieldset>
              </div>
            </div>
          </div>
  
<!-- Java Script CSS -->
<script type= "text/javascript" src= "js/boostrap.min.js"></script>
</body>
</html>