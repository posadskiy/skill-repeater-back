package dev.posadskiy.skillrepeat.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Skill {

    @Id
    private String id;
    private String name;
    private Date lastRepeat;
    private Integer level;
    private Boolean isNeedRepeat;
    private String termRepeat;
}