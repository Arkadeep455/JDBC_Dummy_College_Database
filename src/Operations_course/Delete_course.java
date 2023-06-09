package Operations_course;

public class Delete_course {
    public static String course_delete(String cond){
        String delete=String.format("delete from course where course_id=\"%s\"",cond);
        return delete;
    }
}
