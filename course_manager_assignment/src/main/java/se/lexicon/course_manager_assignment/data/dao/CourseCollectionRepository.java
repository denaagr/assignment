package se.lexicon.course_manager_assignment.data.dao;



import se.lexicon.course_manager_assignment.model.Course;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class CourseCollectionRepository implements CourseDao{

    private Collection<Course> courses;


    public CourseCollectionRepository(Collection<Course> courses) {
        this.courses = courses;
    }

    @Override
    public Course createCourse(String courseName, LocalDate startDate, int weekDuration) {
        return null;
    }

    @Override
    public Course findById(int id) {
        for (Course c : courses) {
            if (c.getId() == id) {
                return c;
            }
        }return null;
    }

    @Override
    public Collection<Course> findByNameContains(String name) {
        return null;
    }

    @Override
    public Collection<Course> findByDateBefore(LocalDate end) {
        return null;
    }

    @Override
    public Collection<Course> findByDateAfter(LocalDate start) {
        return null;
    }

    @Override
    public Collection<Course> findAll() {
        return courses;
    }

    @Override
    public Collection<Course> findByStudentId(int studentId) {
        for (Course c : courses) {
            if (c.getId() == studentId) {
                return courses;
            }
        }return null;
    }

    @Override
    public boolean removeCourse(Course course) {
        return false;
    }

    @Override
    public void clear() {
        this.courses = new HashSet<>();
    }
}
