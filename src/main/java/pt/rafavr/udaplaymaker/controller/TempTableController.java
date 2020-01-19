package pt.rafavr.udaplaymaker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.rafavr.udaplaymaker.database.dao.TempTableDAO;
import pt.rafavr.udaplaymaker.database.model.TempTable;

@RestController
@RequestMapping("/temp")
public class TempTableController {
	
	@Autowired
	TempTableDAO tableDAO;
	
	/* to save an object */
	@PostMapping("/save")
	public TempTable createTempObject(@Valid @RequestBody TempTable tempObject) {
		return tableDAO.save(tempObject);
	}
	
	/* to get all the objects */
	@GetMapping("/getAll")
	public List<TempTable> getAllTempObjects() {
		return tableDAO.findAll();
	}
	
	/* to get object by id */
	@GetMapping("/{id}")
	public ResponseEntity<TempTable> getObjectById(@PathVariable(value = "id") Long objectId) {
		
		TempTable tempObject = tableDAO.findOne(objectId);
		if(tempObject == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(tempObject);
	}
	
	
	/* to update object */
	@PutMapping("/{id}")
	public ResponseEntity<TempTable> updateTempObject(@PathVariable(value = "id") Long objectId,
			@Valid @RequestBody TempTable tempObject) {
		
		TempTable objectToUpdate = tableDAO.findOne(objectId);
		if(objectToUpdate == null) {
			return ResponseEntity.notFound().build();
		}
		
		objectToUpdate.setTempDescricao(tempObject.getTempDescricao());
		objectToUpdate.setTempUtilizador(tempObject.getTempUtilizador());
		
		TempTable updatedObject = tableDAO.save(objectToUpdate);
		return ResponseEntity.ok().body(updatedObject);
	}
	
	/* to delete an object */
	@DeleteMapping("/{id}")
	public ResponseEntity<TempTable> deleteObject(@PathVariable(value = "id") Long objectId) {
		
		TempTable objectToDelete = tableDAO.findOne(objectId);
		if(objectToDelete == null) {
			return ResponseEntity.notFound().build();
		}
		
		tableDAO.delete(objectToDelete);
		return ResponseEntity.ok().build();
	}
}
