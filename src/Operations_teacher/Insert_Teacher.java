package Operations_teacher;

import java.text.MessageFormat;

public class Insert_Teacher {
    public static String teacher_insert(String fid, String name, String email, String phonenumber, String address, String salary,String quali, String dept, String designation){

        String student_insert= String.format("insert into teacher(faculty_id,faculty_name,email,phonenumber,address,salary,qualification,dept,designation) values(\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\")",fid,name,email,phonenumber,address,salary,quali,dept,designation);

        return student_insert;

    }
}
