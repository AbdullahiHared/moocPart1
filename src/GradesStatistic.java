import java.util.ArrayList;
import java.util.Scanner;

public class GradesStatistic {
    private ArrayList<Integer> grades;
    Scanner scanner = new Scanner(System.in);
    public  GradesStatistic() {
        this.grades = new ArrayList<>();
    }

    public void start() {
        System.out.println("Enter grades: ");
        while(true) {
            String grade = scanner.nextLine();
            int gradeValue = Integer.valueOf(grade);
            if(gradeValue == -1) {
                break;
            }
            addGrade(gradeValue);
        }
        getAverage();
    }

    public void addGrade(int gradeValue) {
        if(gradeValue >= 0 && gradeValue <= 100) {
            this.grades.add(gradeValue);
        }
    }

    public void getAverage() {
        int sum = 0;
        for(int grade : this.grades) {
            sum += grade;
        }

        int average = sum / this.grades.size();
        System.out.println("Average: " + average);

        if(average >=50) {
            System.out.println("Passing grade");
        } else {
            System.out.println("Failing grade");
        }
    }

}
