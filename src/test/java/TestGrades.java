import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/12.
 */
public class TestGrades {
    GradesInterface g;
    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        g = (GradesInterface)ctx.getBean("grade");
    }
    @Test
    public void testAll() throws Exception
    {
        g = new Grades();
        int gTotal = g.totalGrades(10,10,10,10);
        Assert.assertEquals(gTotal,40);
    }
    @Test
    public void testProjectGrades() throws Exception
    {
        g = new ProjectGrades();
        int total = g.totalGrades(20,10,5,3);

        Assert.assertEquals(total,38);
    }
}
