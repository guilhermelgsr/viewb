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
import javax.persistence.OneToMany;
@Entity
public class Schema {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	@Column(nullable = false, unique = true)
	public String name;
	public String description;
	public String measuresCaption;
	public String defaultRole;
	
	@OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL)
	public List<Dimension> dimensions = new ArrayList<Dimension>();
	
	@OneToMany(fetch = FetchType.LAZY)
	public List<Cube> cubes = new ArrayList<Cube>();
	
	@OneToMany(fetch = FetchType.LAZY)
	public List<VirtualCube> virtualCubes = new ArrayList<VirtualCube>();
	
	@OneToMany(fetch = FetchType.LAZY)
	public List<Role> roles = new ArrayList<Role>();
}
