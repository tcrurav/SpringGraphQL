package com.tiburcio.bicyclesWithGraphQL.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiburcio.bicyclesWithGraphQL.entity.models.Bicycle;

public interface IBicycleDao extends CrudRepository<Bicycle, Long>{

}
