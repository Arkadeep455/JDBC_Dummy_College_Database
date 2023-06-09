package Operations_Student;

public class Update_student {
    public static String student_update(String cond1,String cond2,String cond3,String cond4,String cond5,String cond6){
        String update=String.format("update student set %s%s\"%s\" where %s%s\"%s\"" ,cond1,cond2,cond3,cond4,cond5,cond6);
        return update;
    }
}
