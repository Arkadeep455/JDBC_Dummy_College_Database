package Operations_Dept;

public class Insert_dept {
    public static String dept_insert(String dept_id,String dept,String faculty_name,String designation,String labs){

        String dept_insert= String.format("insert into department(dept_id,dept,faculty_name,designation,labs) values(\"%s\",\"%s\",\"%s\",\"%s\",\"%s\")",dept_id,dept,faculty_name,designation,labs);

        return dept_insert;

    }
}
