package kz.oskarbay.elasticsearchstudy.repo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "employee-task")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskEntity {
    @Id
    @Field(type = FieldType.Long)
    Long id;

    @Field(type = FieldType.Long)
    Long initiatorId;

    @Field(type = FieldType.Long)
    Long executorId;

    @Field(type = FieldType.Text)
    String type;

    @Field(type = FieldType.Text)
    String description;

}
