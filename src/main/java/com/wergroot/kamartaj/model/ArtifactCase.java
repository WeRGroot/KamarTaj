package com.wergroot.kamartaj.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ArtifactCase")
public class ArtifactCase {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonIgnore
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("created on")
    private LocalDate createDate;

    @JsonProperty("files")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Artifact> artifactList;
}
