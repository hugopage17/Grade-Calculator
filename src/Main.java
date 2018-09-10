import java.awt.*;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args)
    {

        Grade grade = new Grade();
        Paper paper = new Paper();

        System.out.println("How many assignments in this paper");
        Scanner assignNum = new Scanner(System.in);
        paper.counter = assignNum.nextInt();

        while (paper.counter > grade.paper.size()) {
            grade.Assignment();
            grade.Mark();
            grade.Calaculte();
        }

        grade.AssignmentMark();
    }
}
