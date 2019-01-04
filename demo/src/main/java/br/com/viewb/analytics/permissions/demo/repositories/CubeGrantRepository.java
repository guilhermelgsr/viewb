package br.com.viewb.analytics.permissions.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.viewb.analytics.permissions.demo.CubeGrant;
import br.com.viewb.analytics.permissions.demo.Schema;

public interface CubeGrantRepository extends CrudRepository<CubeGrant, Long>{

}
