package com.nh.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseBodyDTO<HeaderType, InputType> {
    HeaderType header;
    InputType dto;
}
