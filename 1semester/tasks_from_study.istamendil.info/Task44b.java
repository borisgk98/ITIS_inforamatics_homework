import java.util.*;

class Faculty {
    private ArrayList<GroupOfStudent> groups = new ArrayList<GroupOfStudent>();
    private String name;
    private int code;
    Faculty(String fName, int fCode) {
        name = fName;
        code = fCode;
    }
    void addGroup(GroupOfStudent group) {
        groups.add(group);
    }
    Double getAverageScore() {
        if (groups.size() == 0) {
            return new Double(0);
        }
        Double sum = new Double(0);
        for (GroupOfStudent el : groups) {
            sum = sum + el.getAverageScore();
        }
        return sum / groups.size();
    }
};

class GroupOfStudent {
    private ArrayList<Student> students = new ArrayList<Student>();
    private int num;
    GroupOfStudent(int gNum) {
        num = gNum;
    }
    void addStudent(Student student) {
        students.add(student);
    }
    Double getAverageScore() {
        if (students.size() == 0) {
            return new Double(0);
        }
        Double sum = new Double(0);
        for (Student el : students) {
            sum = sum + el.getAverageScore();
        }
        return sum / students.size();
    }
};

class Student {
    private String name ;
    private Faculty faculty;
    private GroupOfStudent group;
    private ArrayList<Integer> marks = new ArrayList<Integer>();
    Student(String sName, Faculty sFaculty, GroupOfStudent sGroup) {
        name = sName;
        faculty = sFaculty;
        group = sGroup;
    }
    Student(String sName, Faculty sFaculty, GroupOfStudent sGroup, ArrayList<Integer> sMarks) {
        name = sName;
        faculty = sFaculty;
        group = sGroup;
        marks = new ArrayList<Integer>(sMarks);
    }
    void addMark(Integer mark) {
        marks.add(mark);
    }
    Double getAverageScore() {
        if (marks.size() == 0) {
            return new Double(0);
        }
        Double sum = new Double(0);
        for (Integer el : marks) {
            sum = sum + new Double(el);
        }
        return sum / marks.size();
    }
    Integer getWorstMark() {
        if (marks.size() == 0) {
            return new Integer(-1);
        }
        return Collections.min(marks);
    }
    Integer getBestMark() {
        if (marks.size() == 0) {
            return new Integer(-1);
        }
        return Collections.max(marks);

    }
    void clearMarks() {
        marks.clear();
    }
};

class Task44b {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        Faculty faculty1 = new Faculty("ITIS", 11);
        GroupOfStudent group1 = new GroupOfStudent(704), group2 = new GroupOfStudent(708);
        Student stud1 = new Student("Boris", faculty1, group1);
        Student stud2 = new Student("Renat", faculty1, group1);
        Student stud3 = new Student("Alexander", faculty1, group2);
        stud1.addMark(new Integer(5));
        stud2.addMark(new Integer(5));
        stud3.addMark(new Integer(5));
        stud2.addMark(new Integer(4));
        group1.addStudent(stud1);
        group2.addStudent(stud3);
        group1.addStudent(stud2);
        faculty1.addGroup(group1);
        faculty1.addGroup(group2);
        System.out.println(stud2.getAverageScore());
        System.out.println(group1.getAverageScore());
        System.out.println(group2.getAverageScore());
        System.out.println(faculty1.getAverageScore());
        System.out.println(stud2.getBestMark());
        System.out.println(stud2.getWorstMark());
        stud2.clearMarks();
        System.out.println(stud2.getBestMark());
        System.out.println(stud2.getWorstMark());
    }
}
