package dev.posadskiy.skillrepeat.db.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class DbSkill {
    @Id
    private String id;
    private String name;
    private Date lastRepeat;
    private Integer level;
}
