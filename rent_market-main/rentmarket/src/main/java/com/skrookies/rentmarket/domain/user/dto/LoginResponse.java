package com.skrookies.rentmarket.domain.user.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {

    private  String token;
}
