package com.duyhien.jpa5hours23d6m.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "tbl-author")
@NamedQueries(
        {
                @NamedQuery(
                    name = "Author.findByNamedQueryCompare",
                    query = "select a from Author a where a.age > 10"
                ),
                @NamedQuery(
                        name = "Author.findByNamedQueryLike",
                        query = "select a from Author a where a.firstName like \"%t\" "
                )
        }
)
public class Author extends BaseEntity{

    private String firstName;

    private String lastName;

    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
