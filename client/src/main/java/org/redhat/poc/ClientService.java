package org.redhat.poc;

import com.redhat.fusetraining.learning.webservice.Administration;
import com.redhat.fusetraining.learning.webservice.AdministrationImplService;
import com.redhat.fusetraining.learning.webservice.Course;
import com.redhat.fusetraining.learning.webservice.Student;

import java.util.List;

public class ClientService {

    Administration admin;
    Course course;

    AdministrationImplService adminService;

    public ClientService() {
        AdministrationImplService adminService = new AdministrationImplService();
        admin = adminService.getAdministrationImplPort();
        course = new Course();
        course.setContent("terrific");
    }

    public List<Student> getStudents() {
        return admin.getStudentList(course);
    }

    public List<Course> getCourses() {
        return admin.getCourseList();
    }

}
