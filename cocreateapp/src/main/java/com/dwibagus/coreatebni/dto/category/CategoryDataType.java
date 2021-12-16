package com.dwibagus.coreatebni.dto.category;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoryDataType {
    private Long id;
    private String name;
}
