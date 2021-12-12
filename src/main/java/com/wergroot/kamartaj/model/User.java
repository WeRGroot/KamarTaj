package com.wergroot.kamartaj.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User implements Serializable {

    @JsonProperty("name")
    private String name;

    @Id
    @JsonProperty("email-id")
    private String emailId;

    @JsonProperty("folders")
    @OneToMany(cascade = CascadeType.ALL)
    private List<ArtifactCase> artifactCases;

    public User(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    public void addArtifactCase(ArtifactCase artifactCase){
        artifactCases.add(artifactCase);
    }

    public void removeArtifactCase(ArtifactCase artifactCase){
        artifactCases.remove(artifactCase);
    }
}
