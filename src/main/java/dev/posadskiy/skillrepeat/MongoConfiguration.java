package dev.posadskiy.skillrepeat;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
public class MongoConfiguration {
    private final static String DB_NAME = "skill_repeat";

    @Bean
    public MongoClient mongoClient() {
        MongoClientURI uri = new MongoClientURI(
            "mongodb+srv://nimda:25531094@cluster0-bvzgv.mongodb.net/skill_repeat?retryWrites=true&w=majority");
        return new MongoClient(uri);
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), DB_NAME);
    }
}
