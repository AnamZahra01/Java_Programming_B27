package office_hours_practice.constructor_intro.database_management_system;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDataBase {
    static ArrayList<Student> students = new ArrayList<>();
    static {
        Student student1 = new Student("Adam", 101);
        Student student2 = new Student("Lucy", 102);
        Student student3 = new Student("Harry", 103);
        Student student4 = new Student("Gull", 104);
        Student student5 = new Student("Rul", 105);

        students.addAll(Arrays.asList(student1,student2,student3,student4,student5));
    }
    //addNewStudent
    public void addStudent(Student student){
        students.add(student);
    }

    // getAll
    public ArrayList<Student> getAll(){
        return students;
    }

    //deleteStudent(int id)
    public void deleteStudent(int id){
        students.removeIf(p -> p.id == id);
    }

//  //  getStudentsContain(char ch) -> return studentList
    public ArrayList<Student> getStudentsContain(String value) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student each : students) {
            if (each.name.contains(value)) {
                result.add(each);
            }
        }
        return result;
    }

    //    getStudentsIdBiggerThan(int id)
    public ArrayList<Student> getStudentIdBiggerThan(int id){
        ArrayList<Student> result = new ArrayList<>();
        for(Student each : students){
            if(each.id > id){
                result.add(each);
            }
        }
        return result;
    }

    //    deleteStudentContainsName(char ch) -> has ch 'a'
    public ArrayList<Student> deleteStudentContainsChar(String value){
        ArrayList<Student> result = new ArrayList<>(students);

        result.removeIf(p -> p.name.contains(value));

        return result;

    }


    }

