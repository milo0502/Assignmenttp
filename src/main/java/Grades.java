/**
 * Created by student on 2016/03/12.
 */
public class Grades implements GradesInterface {
    private int total;
    @Override
    public int totalGrades(int t1, int t2, int t3, int t4) {
      return total = t1+t2+t3+t4;
    }

}
