package com.tc.hoichoi.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//import com.tc.bigbang.entity.UserEntity;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtUtil {

	@Value("${jwt.secret}")
	private String SECRET_KEY;
	
	@Value("${jwt.role.list}")
	private String roleString;

	@Value("${jwt.validation_time}")
	private int VALIDATION_TIME;

	private String role = "qw@13";

	public String extractUserId(String token) {
		return extractClaim(token, Claims::getSubject);
	}

	public Date extractExpiration(String token) {
		return extractClaim(token, Claims::getExpiration);
	}

	public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = extractAllClaims(token);
		return claimsResolver.apply(claims);
	}

	private Claims extractAllClaims(String token) {
		return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
	}

	private Boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}

//	public String generateToken(UserEntity userEntity) {
//		Map<String, Object> claims = new HashMap<>();
//		userEntity.setPassword(null);
//		claims.put(role, userEntity.getRoleId());
//		return createToken(claims, userEntity.getUserId());
//	}

	private String createToken(Map<String, Object> claims, String subject) {

		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + VALIDATION_TIME))
				.signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
	}

//	public Boolean validateToken(String token, UserEntity userEntity) {
//		final String userId = extractUserId(token);
//		if((userId.equals(userEntity.getUserId()) && !isTokenExpired(token))) {
//		Claims claims = extractAllClaims(token);
//		Object object = claims.get(role);
//		String[] roleListArray =roleString.split(",");
//		for (String role : roleListArray) {
//				Object permittedRole=role;
//				if(permittedRole.equals(object)) {
//					return true;
//				}else if(role.equals("0")) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}

}
