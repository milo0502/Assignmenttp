/**
 * Created by student on 2016/03/12.
 */
public class ProjectGrades implements GradesInterface {
    private int total;

    @Override
    public int totalGrades(int p1, int p2, int p3, int p4) {
        return total = p1+p2+p3+p4;
    }
}
