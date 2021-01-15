package starter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StudentProperties.class)
@ConditionalOnProperty(value = "bearxsh.student.enable", havingValue = "true")
public class StudentAutoConfiguration {

    @Bean
    IStudentService getStudent(StudentProperties properties) {
        System.out.println("age: " + properties.getAge());
        System.out.println("email: " + properties.getEmail());
        System.out.println("gender: " + properties.getGender());
        return new StudentServiceImpl();
    }
}
