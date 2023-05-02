package com.ssafy.domain.user;


import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JoinDto {
    @NotEmpty
    String userId;
    @NotEmpty
    String password;
    @NotEmpty
    String username;
    @NotEmpty
    String address;
}
