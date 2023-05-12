package model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate dateofBirth;
	private String  trainingDuration;
	private LocalDate registrationDate;
	
	
	public Student() {}

	private static long num= 0;
	
	public Student(Long id, String firstName, String lastName, LocalDate dateofBirth, String trainingDuration,
			LocalDate registrationDate) {
		this.id = num;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.trainingDuration = trainingDuration;
		this.registrationDate = registrationDate;
		num=num++;
	}

	public Student( String firstName, String lastName, LocalDate dateofBirth, String trainingDuration,
			LocalDate registrationDate) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.trainingDuration = trainingDuration;
		this.registrationDate = registrationDate;
	}

	public Long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalDate getDateofBirth() {
		return dateofBirth;
	}


	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}


	public String getTrainingDuration() {
		return trainingDuration;
	}


	public void setTrainingDuration(String trainingDuration) {
		this.trainingDuration = trainingDuration;
	}


	public LocalDate getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}


	@Override
	public String toString() {
		return "Student id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateofBirth="
				+ dateofBirth + ", trainingDuration=" + trainingDuration + ", registrationDate=" + registrationDate
				;
		
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}




	
	
	
	
	
}
