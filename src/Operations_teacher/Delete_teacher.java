package Operations_teacher;

public class Delete_teacher {
    public static String teacher_delete(String cond){
        String delete=String.format("delete from teacher where faculty_id=\"%s\"",cond);
        return delete;
    }
}
