public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord annaRecord = new StudentRecord();
        StudentRecord beahRecord = new StudentRecord();
        StudentRecord crisRecord = new StudentRecord();
        annaRecord.setName("Anna");
        annaRecord.setName("Beah");
        annaRecord.setName("Cris");
        System.out.println(annaRecord.getName());
        System.out.println("Count="+StudentRecord.getStudentCount());
    }
}
