package net.groovymaps.app.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Map {

    @Id
    @GeneratedValue(generator = "map_generator")
    @SequenceGenerator(
            name = "map_generator",
            sequenceName = "map_sequence"
    )
    private Long id;


    @NotBlank
    @Size(min = 5, max = 100)
    private String name;


    @Column(columnDefinition = "text")
    @Size(max = 10000)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
