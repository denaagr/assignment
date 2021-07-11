package se.lexicon.course_manager_assignment.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class Course {
    int id;
    String coursName;
    LocalDate startDate;

    int weekDuration;
    Collection<Student> students;

    public Course(int id, String coursName, LocalDate startDate, int weekDuration, Collection<Student> students) {
        this.id = id;
        this.coursName = coursName;
        this.startDate = startDate;
        this.weekDuration = weekDuration;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursName() {
        return coursName;
    }

    public void setCoursName(String coursName) {
        this.coursName = coursName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {

        this.students = students;
    }

    public boolean enrollStudent(Student student){
       if(students.contains(student)){
            System.out.println("student is already  enrolled");
         }else{
            students.add(student);
            return true;
        }
        return false;
//        HashSet<Student> hash=new HashSet<>();
//        hash.addAll(students);

        }

    public boolean unenrollStudent(Student student){
        if(students.contains(student)){
            students.remove(student);
        }
        return true;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id && weekDuration == course.weekDuration && coursName.equals(course.coursName) && startDate.equals(course.startDate) && students.equals(course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, coursName, startDate, weekDuration, students);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Course{" +
                "id=" + id +
                ", coursName='" + coursName + '\'' +
                ", startDate=" + startDate +
                ", weekDuration=" + weekDuration +
                ", students=" + students +
                '}';
    }
}
