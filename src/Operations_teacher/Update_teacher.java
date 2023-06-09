package Operations_teacher;

public class Update_teacher {
    public static String teacher_update(String cond1,String cond2,String cond3,String cond4,String cond5,String cond6){
        String update=String.format("update teacher set %s%s\"%s\" where %s%s\"%s\"" ,cond1,cond2,cond3,cond4,cond5,cond6);
        return update;
    }
}
