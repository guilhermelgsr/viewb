package br.com.viewb.analytics.permissions.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dimension {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	@Column(nullable = false)
	public String name;
	public boolean visible = true;
	public String description;
	public String foreignKey;
	public String type;
	public String usagePrefix;
	public String caption;
	
}
