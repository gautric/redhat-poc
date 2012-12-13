package com.redhat.fusetraining.learning.webservice;

import java.util.List;

import javax.jws.WebService;

import com.redhat.fusetraining.learning.model.Course;
import com.redhat.fusetraining.learning.model.Student;

@WebService
public interface Administration {

	List<Course> getCourseList();

	void register(Student student, Course course);

	List<Student> getStudentList(Course course);

}
