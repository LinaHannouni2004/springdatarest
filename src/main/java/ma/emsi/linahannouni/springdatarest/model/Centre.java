package ma.emsi.linahannouni.springdatarest.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "centres")
public class Centre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomCentre;

    private String adresse;

@OneToMany(mappedBy = "centre")
    private List<Etudiant> etudiants;




}
