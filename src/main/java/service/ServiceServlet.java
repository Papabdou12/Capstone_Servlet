package service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Student;

/**
 * Servlet implementation class ServiceServlet
 */

public class ServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static List<Student> stud = new ArrayList<>();


    static {
    	stud.add(new Student("Abdou","Niang",LocalDate.of(1995, 06, 23),"6th month",LocalDate.of(2021, 1, 25)));
    	stud.add(new Student("anna","ka",LocalDate.of(2000, 11, 6),"12th month",LocalDate.of(2021, 1, 25)));
    	stud.add(new Student("ousseynou","thiaw",LocalDate.of(1997, 12, 3),"6th month",LocalDate.of(2021, 1, 22)));
    	stud.add(new Student("Nogaye Fall","yade",LocalDate.of(1998, 5, 16),"12th month",LocalDate.of(2021, 1, 26)));
    }

    public void showList(HttpServletRequest request,
                               HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("stud", stud);
        request.getRequestDispatcher("/WEB-INF/views/formulaire.jsp")
                .forward(request, response);
    }
    
    public void listStudent(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

request.setAttribute("stud", stud);
request.getRequestDispatcher("/WEB-INF/views/welcome.jsp")
.forward(request, response);
}

    public void createStudent(HttpServletRequest request,
                           HttpServletResponse response) throws IOException {
    	Student student = new Student();

//		String sid = request.getParameter("id");
    	student.setId(Integer.parseInt(request.getParameter("id")));
    	student.setFirstName(request.getParameter("firstName"));
    	student.setLastName(request.getParameter("lastName"));
        student.setDateofBirth(LocalDate.parse(request
                .getParameter("dateofBirth")));
        student.setTrainingDuration(request.getParameter("trainingDuration"));
        student.setRegistrationDate(LocalDate.parse(request
                .getParameter("registrationDate")));


        stud.add(student);

        response.sendRedirect("/list.do");
    }


    public void retrieveTodo(HttpServletRequest request,
                             HttpServletResponse response) throws ServletException, IOException {
        int id1 = Integer.parseInt(request.getParameter("id"));
        Student student = new Student();
        student.setId(id1);
        for(Student t : stud){
            if (t.equals(student)){
                student = t;
                break;
            }
        }
        request.setAttribute("student", student);
        request.setAttribute("stud", stud);

        request.getRequestDispatcher("/WEB-INF/views/update.jsp")
                .forward(request, response);
    }

    public void updateStudent(HttpServletRequest request,
                           HttpServletResponse response) throws IOException {
        Student student = new Student();
        student.setId(Integer.parseInt(request.getParameter("id")));
        //Creation du nouveau Todo
        Student newstudent = new Student();
        newstudent.setId(Integer.parseInt(request.getParameter("id")));
    	newstudent.setFirstName(request.getParameter("firstName"));
    	newstudent.setLastName(request.getParameter("lastName"));
        newstudent.setDateofBirth(LocalDate.parse(request.getParameter("dateofBirth")));
        newstudent.setTrainingDuration(request.getParameter("trainingDuration"));
        newstudent.setRegistrationDate(LocalDate.parse(request.getParameter("registrationDate")));
        

        stud.set(stud.indexOf(student), newstudent);

        response.sendRedirect("/list.do");
    }
    
    public void findStudent(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
    	String first =request.getParameter("firstName");
    	Student student = new Student();
    	student.setFirstName(first);
    	
    	for(Student st: stud) {
    		if(student.getFirstName().equalsIgnoreCase(first)) {
    			
    			student = st;
    		}
    		
    	}

        response.sendRedirect("/list.do");
   
}

	public void deleteStudent(HttpServletRequest request, HttpServletResponse  response) throws IOException {
		// TODO Auto-generated method stub
		int id1= Integer.parseInt(request.getParameter("id"));
        /*System.out.println(todoName);*/
		Student student = new Student();
        student.setId(id1);
        stud.remove(student);
        response.sendRedirect("/listdo");
	}

}
