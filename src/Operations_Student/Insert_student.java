package Operations_Student;

import com.sun.tools.javac.Main;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.text.MessageFormat;

public class Insert_student  {

    public static String student_insert(String std_id, String firstname, String lastname, String email, String phonenumber, String address, String bloodgroup, String dept, String grade, String year, String sem){

        String student_insert= String.format("insert into student(std_id,Firstname,Lastname,email,phonenumber,address,bloodgroup,dept,grade,year,sem) values(\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\")",std_id,firstname,lastname,email,phonenumber,address,bloodgroup,dept,grade,year,sem);

        return student_insert;

    }
}
