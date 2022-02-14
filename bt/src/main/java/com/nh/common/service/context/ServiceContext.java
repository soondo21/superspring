package com.nh.common.service.context;

import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;

import com.nh.common.dto.header.HDR_DIGITAL;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ServiceContext {
    HttpHeaders             requestHeaders;                   // Http Request Header 구조체
    HDR_DIGITAL             digitalHeaders;                   // 공통 Header 구조체
    String                  queryString;                      // Http URL의 QueryString 구조체
    LinkedMultiValueMap<String, String>     querStringMap;    // Http URL의 QueryString Map 구조체
    Map<String, String> pathVariable;                         // Http URL의 PathVariable Map 구조체
}
