package starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "bearxsh.student")
class StudentProperties {
    private String gender;
    private String email;
    private Integer age;
}
