package br.com.viewb.analytics.permissions.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VirtualCube {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	@Column(nullable = false)
	public String name;
	
	public String description;
	public String caption;
	public boolean enabled = true;
	public boolean visible = true;
}
