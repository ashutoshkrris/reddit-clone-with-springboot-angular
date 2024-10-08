package in.ashutoshkrris.reddit.service;

import in.ashutoshkrris.reddit.dto.request.LoginRequestDto;
import in.ashutoshkrris.reddit.dto.request.RefreshTokenRequestDto;
import in.ashutoshkrris.reddit.dto.request.SignUpRequestDto;
import in.ashutoshkrris.reddit.dto.response.AuthenticationResponseDto;
import in.ashutoshkrris.reddit.model.User;
import jakarta.validation.Valid;

public interface AuthenticationService {

    void signUp(SignUpRequestDto signUpRequest);

    void verifyAccount(String token);

    AuthenticationResponseDto login(LoginRequestDto loginRequest);

    User getCurrentUser();

    AuthenticationResponseDto refreshToken(@Valid RefreshTokenRequestDto refreshTokenRequest);
}
