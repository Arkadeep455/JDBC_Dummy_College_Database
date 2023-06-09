package Operations_Dept;

public class Delete_dept {
    public static String dept_delete(String cond){
        String delete=String.format("delete from department where dept_id=\"%s\"",cond);
        return delete;
    }
}
