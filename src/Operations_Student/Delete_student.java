package Operations_Student;

public class Delete_student {
     public static String student_delete(String cond){
         String delete=String.format("delete from student where std_id=\"%s\"",cond);
         return delete;
     }

}
