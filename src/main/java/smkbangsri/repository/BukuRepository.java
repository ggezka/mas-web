package smkbangsri.repository;

import java.util.List;

import smkbangsri.entity.Buku;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BukuRepository extends CrudRepository<Buku, Long> {
	Buku findById(long id);
	
	@Query("SELECT b FROM Buku b WHERE b.judul LIKE %?1%")
	List<Buku>findByJudul(String judul);
}