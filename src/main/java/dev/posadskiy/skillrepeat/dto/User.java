package dev.posadskiy.skillrepeat.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private List<Skill> skills;
}