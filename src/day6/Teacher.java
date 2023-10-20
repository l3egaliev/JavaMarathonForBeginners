package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String evaluate(Student student){
        Random random = new Random();
        int score = random.nextInt(2,6);
        String resultScore;
        if (score == 5)
            resultScore = "�������";
        else if(score == 4)
            resultScore = "������";
        else if(score == 3)
            resultScore = "�����������������";
        else
            resultScore = "�������������������";
        return "������������� "+name+" ������ �������� "+student.getName()+" �� �������� "+subject+" " +
                "�� ������ "+resultScore;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
