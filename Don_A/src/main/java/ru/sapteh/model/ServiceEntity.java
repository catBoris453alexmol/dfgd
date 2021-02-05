package ru.sapteh.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "service")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;
    @Column
    private double cost;
    @Column
    private int durationInSeconds;
    @Column
    private String description;
    @Column
    private double discount;
    @Column
    private String mainImagePath;

    @OneToMany(mappedBy = "service")
    private Set<ClientServiceEntity> clientServiceEntities;

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                ", durationInSeconds=" + durationInSeconds +
                ", description='" + description + '\'' +
                ", discount=" + discount +
                ", mainImagePath='" + mainImagePath + '\'' +
                '}';
    }
}
