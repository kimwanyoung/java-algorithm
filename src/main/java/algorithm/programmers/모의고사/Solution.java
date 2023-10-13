package algorithm.programmers.모의고사;


import java.util.ArrayList;
import java.util.List;

class Student {

    private int[] answers;
    private int studentId;
    private int answerCount = 0;

    public Student(int[] answers, int studentId) {
        this.answers = answers;
        this.studentId = studentId;
    }

    public void checkAnswer(int index, int answer) {
        int i = index % answers.length;;

        if (answers[i] == answer) {
            answerCount++;
        }
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public int getStudentId() {
        return studentId;
    }
}

class StudentGroup {

    private List<Student> studentList = new ArrayList<>();

    public void checkAnswer(int index, int answer) {
        for (Student student : studentList) {
            student.checkAnswer(index, answer);
        }
    }

    public void add(Student student) {
        studentList.add(student);
    }

    public int[] getHighScoredStudent() {
        int max = max();
        List<Integer> students = new ArrayList<>();

        for (Student student : studentList) {
            int studentScore = student.getAnswerCount();
            if (studentScore == max) {
                students.add(student.getStudentId());
            }
        }

        return students.stream().mapToInt(Integer::intValue).toArray();
    }

    private int max() {
        int max = 0;
        for (Student student : studentList) {
            int studentScore = student.getAnswerCount();
            if (studentScore > max) {
                max = studentScore;
            }
        }

        return max;
    }
}

public class Solution {
    public int[] solution(int[] answers) {
        Student first = new Student(new int[]{1, 2, 3, 4, 5}, 1);
        Student second = new Student(new int[]{2, 1, 2, 3, 2, 4, 2, 5}, 2);
        Student third = new Student(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}, 3);

        StudentGroup studentGroup = new StudentGroup();
        studentGroup.add(first);
        studentGroup.add(second);
        studentGroup.add(third);

        for (int i = 0; i < answers.length; i++) {
            studentGroup.checkAnswer(i, answers[i]);
        }

        return studentGroup.getHighScoredStudent();
    }

}
