import Operations_Dept.Dept_fields;
import Operations_Dept.Insert_dept;
import Operations_course.Course_fields;
import Operations_course.Delete_course;
import Operations_course.Insert_course;
import Operations_course.Update_course;
import Operations_teacher.Delete_teacher;
import Operations_teacher.Insert_Teacher;
import Operations_teacher.Teacher_fields;
import Operations_teacher.Update_teacher;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import Operations_Student.*;
import java.text.*;
import java.sql.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{


        Scanner id=new Scanner(System.in);
        Scanner firstname=new Scanner(System.in);
        Scanner lastname=new Scanner(System.in);
        Scanner email=new Scanner(System.in);
        Scanner phonenumber =new Scanner(System.in);
        Scanner address =new Scanner(System.in);
        Scanner bloodgroup =new Scanner(System.in);
        Scanner dept =new Scanner(System.in);
        Scanner grade =new Scanner(System.in);
        Scanner year =new Scanner(System.in);
        Scanner sem =new Scanner(System.in);
        Scanner name =new Scanner(System.in);
        Scanner qualification =new Scanner(System.in);
        Scanner salary =new Scanner(System.in);
        Scanner xc=new Scanner(System.in);
        Scanner yc=new Scanner(System.in);
        Scanner ycc=new Scanner(System.in);
        Scanner designation =new Scanner(System.in);
        Scanner fee =new Scanner(System.in);
        Scanner duration =new Scanner(System.in);
        Scanner seats =new Scanner(System.in);
        Scanner labs =new Scanner(System.in);


        String url = "jdbc:mysql://localhost:3306/college";
        String un = "root";
        String pw = "Pdnejoh@1234";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, un, pw);
        Statement st = con.createStatement();


        System.out.println("\n--------------\n|   TABLES   |\n--------------\n[   STUDENT  ]\n[   TEACHER  ]\n[ DEPARTMENT ]\n[   COURSE   ]\n--------------");
        System.out.print("Enter a table name from above options: ");
        String in = xc.next();

        Table_name t=Table_name.valueOf(in.toUpperCase());

       //Objects of fields
        Student_fields sf=new Student_fields();
        Teacher_fields tf=new Teacher_fields();
        Course_fields cf=new Course_fields();
        Dept_fields df=new Dept_fields();






        String on;

             String x1="",y1="",z1="",k1="",m1="",n1="";
       boolean cond=true;
       boolean inner_cond=true;
              int x=0,y=0;
              String xy="";

          switch (t) {
              case STUDENT -> {
                  System.out.print("Choose an operation [I] INSERT  [D] DELETE  [U] UPDATE  [S] SELECT: ");
                  on = xc.next();
                  Operations OP = Operations.valueOf(on.toUpperCase());


                  switch (OP) {
                      case I -> {
                          System.out.println("INSERT:\n-------");

                          System.out.print("Enter STUDENT id: ");

                          sf.setStd_id(id.next());
                          System.out.print("Enter Firstname: ");
                          sf.setFirstname(firstname.next());
                          System.out.print("Enter Lastname: ");
                          sf.setLastname(lastname.next());
                          System.out.print("Enter email: ");
                          sf.setEmail(email.next());
                          System.out.print("Enter phonenumber: ");
                          sf.setPhonenumber(phonenumber.next());
                          System.out.print("Enter address: ");
                          sf.setAddress(address.next());
                          System.out.print("Enter blood group: ");
                          sf.setBloodgroup(bloodgroup.next());

                          System.out.print("Enter department: ");
                          sf.setDept(dept.next());

                          System.out.print("Enter grade: ");
                          sf.setGrade(grade.next());
                          System.out.print("Enter year: ");
                          sf.setYear(year.next());
                          System.out.print("Enter Semester:");
                          sf.setSem(sem.next());


                          xy = Insert_student.student_insert(sf.getStd_id(), sf.getFirstname(), sf.getLastname(), sf.getEmail(), sf.getPhonenumber(), sf.getAddress(), sf.getBloodgroup(), sf.getDept(), sf.getGrade(), sf.getYear(), sf.getSem());
                          x = st.executeUpdate(xy.toString());
                          Print_message.insert_message(x);
                          break;
                      }

                      case D -> {
                          System.out.println("DELETE:\n-------");
                          System.out.print("Enter student id to delete: ");
                          sf.setStd_id(xc.next());
                          xy = Delete_student.student_delete(sf.getStd_id());
                          y = st.executeUpdate(xy);
                          Print_message.delete_message(y);
                          break;

                      }
                      case S -> {
                          System.out.println("SELECT:\n-------");

                          ResultSet rs = st.executeQuery("select * from STUDENT");
                          while (rs.next()) {
                              System.out.println("STUDENT ID: " + rs.getString(1) + "  ||  FIRST NAME: " + rs.getString(2) + "  ||  LAST NAME: " + rs.getString(3) + "  ||  EMAIL: " + rs.getString(4) + "  ||  PHONENUMBER: " + rs.getString(5) + "  ||  ADDRESS: " + rs.getString(6) + "  ||  BLOODGROUP: " + rs.getString(7) + "  ||  DEPARTMENT: " + rs.getString(8) + "  ||  GRADE: " + rs.getString(9)+ "  ||  YEAR: " + rs.getString(10)+ "  ||  SEMESTER: " + rs.getString(11));
                          }

                          break;
                      }
                      case U -> {
                          System.out.println("UPDATE:\n--------");
                          System.out.println("Enter the condition below, complete the query");
                          System.out.print("UPDATE STUDENT ");
                          System.out.print("SET ");
                          x1 = xc.next();
                          y1 = xc.next();
                          z1 = xc.next();
                          System.out.print(" WHERE ");
                          k1 = xc.next();
                          m1 = xc.next();
                          n1 = xc.next();

                          xy = Update_student.student_update(x1, y1, z1, k1, m1, n1);
                          x = st.executeUpdate(xy);
                          Print_message.update_message(x);
                          break;
                      }
                      case E -> {
                          break;
                      }
                  }}



              case TEACHER -> {
                  System.out.print("Choose an operation [I] INSERT  [D] DELETE  [U] UPDATE  [S] SELECT:  ");
                  on = xc.next();
                  Operations OP = Operations.valueOf(on.toUpperCase());
                  switch (OP) {
                      case I -> {
                          System.out.println("INSERT:\n-------");

                          System.out.print("Enter Faculty id: ");
                          tf.setFaculty_id(id.next());
                          System.out.print("Enter Faculty Name: ");
                          tf.setFaculty_name(name.next());

                          System.out.print("Enter email: ");
                          tf.setEmail(email.next());
                          System.out.print("Enter phonenumber: ");
                          tf.setPhonenumber(phonenumber.next());
                          System.out.print("Enter address: ");
                          tf.setAddress(address.next());

                          System.out.print("Enter salary: ");
                          tf.setSalary(salary.next());
                          System.out.print("Enter qualification: ");
                          tf.setDept(qualification.next());

                          System.out.print("Enter department: ");
                          tf.setDept(dept.next());



                          System.out.print("Enter designation: ");
                          tf.setDesignation(designation.next());



                          xy = Insert_Teacher.teacher_insert(tf.getFaculty_id(),tf.getFaculty_name(),tf.getEmail(),tf.getPhonenumber(),tf.getAddress(),tf.getSalary(),tf.getQualification(),tf.getDept(),tf.getDesignation());
                          x = st.executeUpdate(xy.toString());
                          Print_message.insert_message(x);
                          break;
                      }

                      case D -> {
                          System.out.println("DELETE:\n-------");
                          System.out.print("Enter faculty id to delete: ");
                          tf.setFaculty_id(yc.next());
                          xy = Delete_teacher.teacher_delete(tf.getFaculty_id());
                          y = st.executeUpdate(xy);
                          Print_message.delete_message(y);
                          break;

                      }
                      case S -> {
                          System.out.println("SELECT:\n-------");

                          ResultSet rs = st.executeQuery("select * from teacher");
                          while (rs.next()) {
                              System.out.println("FACULTY ID: " + rs.getString(1) + "  ||  FACULTY NAME: " + rs.getString(2) + "  ||  EMAIL: " + rs.getString(3) + "  ||  PHONENUMBER: " + rs.getString(4) + "  ||  ADDRESS: " + rs.getString(5) + "  ||  SALARY: " + rs.getString(6) + "  ||  QUALIFICATION: " + rs.getString(7) + "  ||  DEPARTMENT: " + rs.getString(8) + "  ||  DESIGNATION: " + rs.getString(9) );
                          }

                          break;
                      }
                      case U -> {
                          System.out.println("UPDATE:\n--------");
                          System.out.println("Enter the condition below, complete the query");
                          System.out.print("UPDATE TEACHER ");
                          System.out.print("SET ");
                          x1 = xc.next();
                          y1 = xc.next();
                          z1 = xc.next();
                          System.out.print(" WHERE ");
                          k1 = xc.next();
                          m1 = xc.next();
                          n1 = xc.next();

                          xy = Update_teacher.teacher_update(x1, y1, z1, k1, m1, n1);
                          x = st.executeUpdate(xy);
                          Print_message.update_message(x);
                          break;
                      }
                      case E -> {
                          System.out.println("EXIT :)");

                          break;
                      }


                  }

          }

              case COURSE -> {
                  System.out.print("Choose an operation [I] INSERT  [D] DELETE  [U] UPDATE  [S] SELECT: ");
                  on = xc.next();
                  Operations OP = Operations.valueOf(on.toUpperCase());
                  switch (OP) {
                      case I -> {
                          System.out.println("INSERT:\n-------");

                          System.out.print("Enter course id: ");
                          cf.setCourse_id(id.next());
                          System.out.print("Enter course name: ");
                          cf.setCourse_name(name.next());
                          System.out.print("Enter course fee: ");
                          cf.setCourse_fee(fee.next());
                          System.out.print("Enter course duration: ");
                          cf.setDuration(duration.next());
                          System.out.print("Enter number of seats available: ");
                          cf.setSeats(seats.next());


                          xy = Insert_course.course_insert(cf.getCourse_id(),cf.getCourse_name(),cf.getCourse_fee(),cf.getDuration(),cf.getSeats());
                                  x = st.executeUpdate(xy.toString());
                          Print_message.insert_message(x);
                          break;
                      }

                      case D -> {
                          System.out.println("DELETE:\n-------");
                          System.out.print("Enter course id to delete: ");
                          cf.setCourse_id(ycc.next());
                          xy = Delete_course.course_delete(cf.getCourse_id());
                          y = st.executeUpdate(xy);
                          Print_message.delete_message(y);
                          break;

                      }
                      case S -> {
                          System.out.println("SELECT:\n-------");

                          ResultSet rs = st.executeQuery("select * from COURSE");
                          while (rs.next()) {
                              System.out.println("COURSE ID: " + rs.getString(1) + "  ||  COURSE NAME: " + rs.getString(2) + "  ||  COURSE FEE: " + rs.getString(3) + "  ||  DURATION: " + rs.getString(4) + "  ||  SEATS: " + rs.getString(5) );
                          }

                          break;
                      }
                      case U -> {
                          System.out.println("UPDATE:\n--------");
                          System.out.println("Enter the condition below, complete the query");
                          System.out.print("UPDATE COURSE ");
                          System.out.print("SET ");
                          x1 = xc.next();
                          y1 = xc.next();
                          z1 = xc.next();
                          System.out.print(" WHERE ");
                          k1 = xc.next();
                          m1 = xc.next();
                          n1 = xc.next();

                          xy = Update_course.course_update(x1, y1, z1, k1, m1, n1);
                          x = st.executeUpdate(xy);
                          Print_message.update_message(x);
                          break;
                      }
                      case E -> {
                          System.out.println("EXIT :)");

                          break;
                      }
                  }
                  }
              case DEPARTMENT -> {
                  System.out.print("Choose an operation [I] INSERT  [D] DELETE  [U] UPDATE  [S] SELECT: ");
                  on = xc.next();
                  Operations OP = Operations.valueOf(on.toUpperCase());
                  switch (OP) {
                      case I -> {
                          System.out.println("INSERT:\n-------");

                          System.out.print("Enter department id: ");
                          df.setDept_id(id.next());
                          System.out.print("Enter department: ");
                          df.setDept(dept.next());
                          System.out.print("Enter faculty name: ");
                          df.setFaculty_name(name.next());
                          System.out.print("Enter designation: ");
                          df.setDesignation(designation.next());
                          System.out.print("Enter number of labs: ");
                          df.setLabs(labs.next());


                          xy = Insert_dept.dept_insert(df.getDept_id(),df.getDept(),df.getFaculty_name(),df.getDesignation(),df.getLabs());
                      x = st.executeUpdate(xy.toString());
                          Print_message.insert_message(x);
                          break;
                      }

                      case D -> {
                          System.out.println("DELETE:\n-------");
                          System.out.print("Enter department id to delete: ");
                          df.setDept_id(xc.next());
                          xy = Delete_course.course_delete(df.getDept_id());
                          y = st.executeUpdate(xy);
                          Print_message.delete_message(y);
                          break;

                      }
                      case S -> {
                          System.out.println("SELECT:\n-------");

                          ResultSet rs = st.executeQuery("select * from Department");
                          while (rs.next()) {
                              System.out.println("DEPARTMENT ID: " + rs.getString(1) + "  ||  DEPARTMENT: " + rs.getString(2) + "  ||  FACULTY: " + rs.getString(3) + "  ||  DESIGNATION: " + rs.getString(4) + "  ||  LABS: " + rs.getString(5) );
                          }

                          break;
                      }
                      case U -> {
                          System.out.println("UPDATE:\n--------");
                          System.out.println("Enter the condition below, complete the query");
                          System.out.print("UPDATE DEPARTMENT ");
                          System.out.print("SET ");
                          x1 = xc.next();
                          y1 = xc.next();
                          z1 = xc.next();
                          System.out.print(" WHERE ");
                          k1 = xc.next();
                          m1 = xc.next();
                          n1 = xc.next();

                          xy = Update_course.course_update(x1, y1, z1, k1, m1, n1);
                          x = st.executeUpdate(xy);
                          Print_message.update_message(x);
                          break;
                      }
                      case E -> {
                          System.out.println("EXIT :)");

                          break;
                      }}



        }}
        st.close();
          con.close();

           }}




















