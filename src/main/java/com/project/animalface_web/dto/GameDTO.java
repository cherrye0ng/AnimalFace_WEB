package com.project.animalface_web.dto;

import com.project.animalface_web.domain.Images;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {
    private Long gameNo;

    private String gameName;

    private String question;
    private String answer;
    private Images images;

}
