package com.webknot.javaD3.Entity;

import jakarta.persistence.*;
        import lombok.*;

        import java.util.Date;

@Entity
@Table(name = "project")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Date startDate;
    private Date endDate;
}
