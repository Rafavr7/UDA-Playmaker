package pt.rafavr.udaplaymaker.database.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.rafavr.udaplaymaker.database.model.TempTable;
import pt.rafavr.udaplaymaker.repository.TempTableRepository;

@Service
public class TempTableDAO {
	
	@Autowired
	TempTableRepository tempTableRepository;
	
	/* to save an object */
	public TempTable save(TempTable tempObject) {
		return tempTableRepository.save(tempObject);
	}
	
	/* search all objects */
	public List<TempTable> findAll() {
		return tempTableRepository.findAll();
	}
	
	/* get an object by id */
	public TempTable findOne(Long objectId) {
		return tempTableRepository.findOne(objectId);
	}
	
	/* delete an object */
	public void delete(TempTable tempObject) {
		tempTableRepository.delete(tempObject);
	}
}
