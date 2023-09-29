/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycollege;

/**
 *
 * @author User
 */
public class Students {

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
   private String fname;
   private String lname;
   private int studentId;
}
