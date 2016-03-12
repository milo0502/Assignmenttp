import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2016/03/12.
 */
@Configuration
public class AppConfig {
    @Bean(name="grade")
    public GradesInterface getService()
    {
        return new Grades();
    }
}
