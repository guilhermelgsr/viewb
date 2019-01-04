package br.com.viewb.analytics.permissions.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cube {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	@Column(nullable = false)
	public String name;
	
	public String description;
	public String caption;
	public boolean cache = true;
	public boolean enabled = true;
	public boolean visible = true;
	
	public Cube(String name){
		this.name = name;
	}
	
	public Cube(){
		
	}
}
