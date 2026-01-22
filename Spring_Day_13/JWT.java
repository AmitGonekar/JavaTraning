package Spring_Day_13;


import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

class JWT{



@PostMapping("/login")
public ResponseEntity<?> login(@RequestBody LoginRequest request) {

    Authentication authentication =
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getUsername(), request.getPassword()
                    )
            );

    String token = jwtUtil.generateToken(request.getUsername());

    return ResponseEntity.ok(new JwtResponse(token));
}

}