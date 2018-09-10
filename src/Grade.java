import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Grade {

    public double percent;
    public double mark;
    public double finalGrade;
    public List paper;
    public int sum;

    public Grade(){this.paper = new ArrayList();}

    public void Assignment(){
        System.out.println("How much was this assignment worth: ");
        Scanner assign = new Scanner(System.in);
        this.percent = assign.nextInt();
        this.percent = this.percent/100;
    }

    public void Mark(){
        System.out.println("What mark did you get on this assignment: ");
        Scanner markGrade = new Scanner(System.in);
        this.mark = markGrade.nextInt();
        this.mark = this.mark/100;
    }

    public void Calaculte(){
        this.finalGrade = this.mark*this.percent;
        this.finalGrade *= 100;
        System.out.println("Your mark on this assignment will count for " + Math.round(this.finalGrade) +
                "% towards yours final grade");
        this.paper.add(this.finalGrade);
    }

    public void AssignmentMark(){
        for(int i=0; i<paper.size(); i++) {
            System.out.println("Assignment " + i + " grade: " + paper.get(i));
        }
        //System.out.println("Your final grade for this paper is " + this.sum + "%");
    }
}
