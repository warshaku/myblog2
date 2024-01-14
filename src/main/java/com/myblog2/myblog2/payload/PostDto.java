package com.myblog2.myblog2.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    private  long id;
    private String title;
    private String description;
    private String content;
}
