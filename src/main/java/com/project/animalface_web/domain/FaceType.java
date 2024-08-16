package com.project.animalface_web.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FaceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long animalNo;

    @ManyToOne
    @JoinColumn(name = "memberNo")
    private Member member;

    private String animalImage;
    private String animalType;
    private Long animalAccuracy;
}

