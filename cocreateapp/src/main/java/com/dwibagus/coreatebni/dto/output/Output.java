package com.dwibagus.coreatebni.dto.output;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Output {
    private Long id;
    private String name;
    private Long category;
    private Double price;
}
