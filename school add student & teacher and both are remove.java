package com.mycompany.school;

class School {
    private String[] students;
    private String[] teachers;
    private String[] classes;

    public School(int maxStudents, int maxTeachers, int maxClasses) {
        students = new String[maxStudents];
        teachers = new String[maxTeachers];
        classes = new String[maxClasses];
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public String[] getTeachers() {
        return teachers;
    }

    public void setTeachers(String[] teachers) {
        this.teachers = teachers;
    }

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    public boolean addStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return true;
            }
        }
        return false;
    }

    public boolean removeStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].equals(student)) {
                students[i] = null;
              
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    public boolean addTeacher(String teacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                return true;
            }
        }
        return false;
    }

    public boolean removeTeacher(String teacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].equals(teacher)) {
                teachers[i] = null;
                
                for (int j = i; j < teachers.length - 1; j++) {
                    teachers[j] = teachers[j + 1];
                }
                teachers[teachers.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    public boolean createClass(String className) {
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] == null) {
                classes[i] = className;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        School school = new School(5, 3, 4);

        
        school.addStudent("John");
        school.addStudent("Alice");

       
        school.addTeacher("Mr. Smith");

       
        school.createClass("Math 101");

       
        school.removeStudent("John");

      
        school.removeTeacher("Mr. Smith");
    }
}

