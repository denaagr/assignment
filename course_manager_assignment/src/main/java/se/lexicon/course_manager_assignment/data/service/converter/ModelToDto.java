package se.lexicon.course_manager_assignment.data.service.converter;

import org.springframework.stereotype.Component;
import se.lexicon.course_manager_assignment.data.dao.StudentDao;
import se.lexicon.course_manager_assignment.dto.views.CourseView;
import se.lexicon.course_manager_assignment.dto.views.StudentView;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ModelToDto implements Converters {

    @Override
    public StudentView studentToStudentView(Student student) {
        StudentView studentV=new StudentView(student.getId(),student.getName(),student.getEmail(),student.getAddress());
        return studentV;
    }

    @Override
    public CourseView courseToCourseView(Course course) {
        List<StudentView> students = studentsToStudentViews(course.getStudents());
        CourseView courseV=new CourseView(course.getId(),course.getCoursName(),course.getStartDate(),course.getWeekDuration(), students);
        return courseV;
    }

    @Override
    public List<CourseView> coursesToCourseViews(Collection<Course> courses) {
        List<CourseView> courseViewList=new ArrayList<CourseView>();
        for(Course c:courses){
            courseViewList.add(courseToCourseView(c));
        }
        return courseViewList;
    }

    @Override
    public List<StudentView> studentsToStudentViews(Collection<Student> students) {
        List<StudentView> studentV =new ArrayList<>();
        for(Student s : students){
           // StudentView studentView=new StudentView(s.getId(),s.getName(),s.getEmail(),s.getAddress());
           // StudentView studentView=studentToStudentView(s);
            studentV.add(studentToStudentView(s));
        }

        return studentV;
    }
}
