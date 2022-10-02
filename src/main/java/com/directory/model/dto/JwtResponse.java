package com.directory.model.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JwtResponse {
	 @SuppressWarnings("unused")
	private Long id;
	    @SuppressWarnings("unused")
		private String token;
	    @SuppressWarnings("unused")
		private String type = "Bearer";
	    @SuppressWarnings("unused")
		private String username;
	    @SuppressWarnings("unused")
		private Collection<? extends GrantedAuthority> roles;

	    public JwtResponse(String accessToken, Long id, String username, Collection<? extends GrantedAuthority> roles) {
	        this.token = accessToken;
	        this.username = username;
	        this.roles = roles;
	        this.id = id;
	    }
}
