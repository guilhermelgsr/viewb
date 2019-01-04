package br.com.viewb.analytics.permissions.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.viewb.analytics.permissions.demo.Schema;
import br.com.viewb.analytics.permissions.demo.SchemaGrant;

public interface SchemaGrantRepository extends CrudRepository<SchemaGrant, Long>{

}
