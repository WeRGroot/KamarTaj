package com.wergroot.kamartaj.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Artifact")
public class Artifact {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonIgnore
    private String id;

    @JsonProperty("file-name")
    private String filename;

    @JsonProperty("author-name")
    private String authorName;

    @JsonProperty("created-on")
    private LocalDate createDate;

    @JsonIgnore
    private byte[] artifactContent;
}
