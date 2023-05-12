<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List" %>
<%@page import="model.Student" %>
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
            <a type="text" class="" href="/todos.do">Add Student</a>
           
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
               <% List<Student> stud = (List<Student>) request.getAttribute("stud"); %>
        <fieldset class="form-group" >
              <table>
            <thead>
            <tr>
            <div>
            <th>ID</th>
            </div>
            <div>
            <th>FIRSTNAME</th>
            </div>
                <div>
                <th>LASTNAME</th>
                </div>
                <div>
                <th>DATE OF BIRTH</th>
                </div>
                <div>
                <th>TRAINING DURATION</th>
                </div>
                <div>
                 <th>REGISTRATION DATE</th>
                </div>
                
                
                
               
            </tr>
            </thead>
            <tbody>
            <% for(Student student : stud) { %>
            <tr>
            	<td><%= student.getId() %></td>
                <td><%= student.getFirstName() %></td>
                <td><%= student.getLastName() %></td>
                <td><%= student.getDateofBirth() %></td>
                <td><%= student.getTrainingDuration() %></td>
                <td><%= student.getRegistrationDate() %></td>
                <td></td>
                <td>
                    <a class="btn btn-danger" href="/delete-todo.do?name=<%=student.getId()%>">Delete</a>
                    <a class="btn btn-info" href="/update-todo.do?name=<%=student.getFirstName()%>">Update</a>
                 <a  href="/search-todo.do?name=<%=student.getFirstName()%>">Update</a>
                </td>
            </tr>
            <% } %>
            </tbody>
        </table>
                    
                
              </fieldset>
              </div>
            </div>
          </div>
  
<!-- Java Script CSS -->
<script type= "text/javascript" src= "js/boostrap.min.js"></script>
</body>
</html>