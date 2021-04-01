package com.example.demo.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="TUser")
public class User implements Serializable, UserDetails {
	@Id
	@GeneratedValue(strategy = 	GenerationType.IDENTITY)
private long id_util; 
	@Column(name="nom_util")
private String nomUtil;
	@Column(name="prenom_util")
private String prenomUtil; 
	@Column(name="Login", nullable=false,unique=true,length=50)
private String login ; 
	@Column(name="Mdp_util",nullable=false,length=70)
private String mdp_util; 
	@Column(name="Type_util")
private int type_util;

public User() {
		super();
	}

public User(int id_util, String nomUtil, String prenomUtil, String login, String mdp_util, int type_util) {
	super();
	this.id_util = id_util;
	this.nomUtil = nomUtil;
	this.prenomUtil = prenomUtil;
	this.login = login;
	this.mdp_util = mdp_util;
	this.type_util = type_util;
}

public long getId_util() {
	return id_util;
}

public void setId_util(long id_util) {
	this.id_util = id_util;
}

public String getNomUtil() {
	return nomUtil;
}

public void setNomUtil(String nomUtil) {
	this.nomUtil = nomUtil;
}

public String getPrenomUtil() {
	return prenomUtil;
}

public void setPrenomUtil(String prenomUtil) {
	this.prenomUtil = prenomUtil;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getMdp_util() {
	return mdp_util;
}

public void setMdp_util(String mdp_util) {
	this.mdp_util = mdp_util;
}

public int getType_util() {
	return type_util;
}

public void setType_util(int type_util) {
	this.type_util = type_util;
}



@Override
public String toString() {
	return "User [nomUtil=" + nomUtil + ", prenomUtil=" + prenomUtil + ", login=" + login + ", mdp_util=" + mdp_util
			+ ", type_util=" + type_util + "]";
}

@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getPassword() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getUsername() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean isAccountNonExpired() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isCredentialsNonExpired() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isEnabled() {
	// TODO Auto-generated method stub
	return false;
}




}
