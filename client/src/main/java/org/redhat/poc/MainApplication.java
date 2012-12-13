package org.redhat.poc;

import com.redhat.fusetraining.learning.webservice.Course;
import com.redhat.fusetraining.learning.webservice.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MainApplication {

    static final Logger logger = LoggerFactory.getLogger(MainApplication.class);

    static ClientService clientService;

    public static void main(String [] args) {

        clientService = new ClientService();

        // Call getStudents
        logger.info(">> Get Students");
        List<Student> students = clientService.getStudents();
        for(Student student : students) {
            logger.info("Student First Name : " + student.getFirstName());
            logger.info("Last Name : " + student.getLastName());
            logger.info("City : " + student.getCity());
            logger.info("Email : " + student.getEmail());
            logger.info("Birthday : " + student.getBirthday());
            logger.info("***************");
        }

        // Call getCourses
        logger.info(">> Get Courses");
        List<Course> courses = clientService.getCourses();
        for(Course course : courses) {
            logger.info("Course : " + course.getContent());
            logger.info("Title : " + course.getTitle());
            logger.info("Max : " + course.getMaxStudent());
            logger.info("Exam Date : " + course.getExamDate());
            logger.info("***************");
        }

    }

}
