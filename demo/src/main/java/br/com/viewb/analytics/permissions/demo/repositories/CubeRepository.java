package br.com.viewb.analytics.permissions.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.viewb.analytics.permissions.demo.Cube;
import br.com.viewb.analytics.permissions.demo.Schema;

public interface CubeRepository extends CrudRepository<Cube, Long>{

}
