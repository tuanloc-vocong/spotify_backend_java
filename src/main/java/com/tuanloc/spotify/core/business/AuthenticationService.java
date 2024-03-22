package com.tuanloc.spotify.core.business;

import com.tuanloc.spotify.core.dataAccess.UserRepository;
import com.tuanloc.spotify.core.entities.Role;
import com.tuanloc.spotify.core.entities.User;
import com.tuanloc.spotify.core.utilities.requests.AuthenticationRequest;
import com.tuanloc.spotify.core.utilities.requests.RegisterRequest;
import com.tuanloc.spotify.core.utilities.responses.AuthenticationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request){
        var user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .userEmail(request.getUserEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();

        userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .userId(user.getUserId())
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUserEmail(), request.getPassword()));
        var user = userRepository.findByUserEmail(request.getUserEmail()).orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder().token(jwtToken).userId(user.getUserId()).build();
    }
}
