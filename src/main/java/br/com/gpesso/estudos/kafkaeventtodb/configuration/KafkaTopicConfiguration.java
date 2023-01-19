package br.com.gpesso.estudos.kafkaeventtodb.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {
    @Bean
    public NewTopic firstTopic(){
        return TopicBuilder.name("firstTopic").build();
    }
    @Bean
    public NewTopic toJsonTopic(){
        return TopicBuilder.name("toJsonTopic").build();
    }
}
