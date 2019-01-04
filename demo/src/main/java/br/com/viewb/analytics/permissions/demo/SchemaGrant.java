package br.com.viewb.analytics.permissions.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SchemaGrant {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	@Column(nullable = false, unique = true)
	public String access;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<CubeGrant> cubeGrants = new ArrayList<CubeGrant>();
}
