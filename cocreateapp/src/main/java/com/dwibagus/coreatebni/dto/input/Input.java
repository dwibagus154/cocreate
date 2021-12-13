package com.dwibagus.coreatebni.dto.input;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Input {
    private Long id;
    private String name;
    private Long category;
    private Double price;
}
