package com.tiburcio.bicyclesWithGraphQL.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.bicyclesWithGraphQL.entity.dao.IBicycleDao;
import com.tiburcio.bicyclesWithGraphQL.entity.models.Bicycle;

@Service
public class BicycleServiceImpl implements IBicycleService {
	
	@Autowired
	private IBicycleDao bicycleDao;

	@Override
	public List<Bicycle> getAll() {

		return (List<Bicycle>) bicycleDao.findAll();
	}

	@Override
	public Bicycle addBicycle(Bicycle bicycle) {

		return bicycleDao.save(bicycle);
	}

	@Override
	public void deleteBicycle(long id) {

		bicycleDao.deleteById(id);
	}

	@Override
	public void updateBicycle(long id, Bicycle bicycle) {
		Optional<Bicycle> bicycleInDB = bicycleDao.findById(id);
		
		if(bicycleInDB.isPresent()) {
			bicycle.setId(bicycleInDB.get().getId());
			bicycleDao.save(bicycle);
		}
	}

	@Override
	public Optional<Bicycle> getBicycleById(long id) {

		return bicycleDao.findById(id);
	}
	
	
}
