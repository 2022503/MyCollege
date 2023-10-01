/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycollege;

/**
 *
 * @author User
 */
public class  Course extends Students {

    public Course(int courseId, String courseName, String fname, String lname, int studentId) {
        super(fname, lname, studentId);
        this.courseId = courseId;
        this.courseName = courseName;
    }
     
    private int courseId;
    private String courseName;

   

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}
