package com.duyhien.jpa5hours23d6m.Models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
@Entity
//@DiscriminatorValue("F")
//@PrimaryKeyJoinColumn(name = "file_id")
public class File extends Resource {

    private String type;
}
