package Operations_course;

public class Insert_course {
    public static String course_insert(String course_id,String course_name,String course_fee,String duration,String seats){

        String course_insert= String.format("insert into course(course_id,course_name,course_fee,duration,seats) values(\"%s\",\"%s\",\"%s\",\"%s\",\"%s\")",course_id,course_name,course_fee,duration,seats);

        return course_insert;

    }
}
