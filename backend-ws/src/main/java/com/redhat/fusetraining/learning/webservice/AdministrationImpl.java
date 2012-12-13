package com.redhat.fusetraining.learning.webservice;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.jws.WebService;

import com.redhat.fusetraining.learning.model.Course;
import com.redhat.fusetraining.learning.model.Student;

@WebService(endpointInterface = "com.redhat.fusetraining.learning.webservice.Administration")
public class AdministrationImpl implements Administration {
	
	

	@Override
	public List<Course> getCourseList() {
		// TODO Auto-generated method stub
		return generateCourses();
	}

	@Override
	public void register(Student student, Course course) {
		
	}

	@Override
	public List<Student> getStudentList(Course course) {
		// TODO Auto-generated method stub
		return generateStudentList();
	}

	private static List<Student> generateStudentList() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Marc", "Zottner", new GregorianCalendar(), "Stuttgart", "mzottner@redhat.com"));
		list.add(new Student("Martin", "Swales", new GregorianCalendar(), "Birmingham", "mswales@redhat.com"));
		list.add(new Student("Bernard", "Tison", new GregorianCalendar(), "Bruxelles", "btison@redhat.com"));
		list.add(new Student("Paolo", "Antinori", new GregorianCalendar(), "Farnborough", "pantinor@redhat.com"));
		return list;
	}

	private static List<Course> generateCourses() {
		List<Course> list = new ArrayList<Course>();
		list.add(new Course("Fuse Enterprise MQ", "terrific", new GregorianCalendar(), new GregorianCalendar(), new GregorianCalendar(), 10));
		list.add(new Course("JBoss Integrator", "fanstastic", new GregorianCalendar(), new GregorianCalendar(), new GregorianCalendar(), 10));
		list.add(new Course("JBoss Enterprise Application Platform 7", "futuristic", new GregorianCalendar(), new GregorianCalendar(), new GregorianCalendar(), 0));
		list.add(new Course("JBoss SOAP 6", "innovative", new GregorianCalendar(), new GregorianCalendar(), new GregorianCalendar(), 10));
		return list;
	}

}
