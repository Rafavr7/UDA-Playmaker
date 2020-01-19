package pt.rafavr.udaplaymaker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.rafavr.udaplaymaker.database.model.TempTable;

public interface TempTableRepository extends JpaRepository<TempTable, Long> {
	
}
