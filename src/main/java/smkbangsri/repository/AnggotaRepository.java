package smkbangsri.repository;

import java.util.List;

import smkbangsri.entity.Anggota;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnggotaRepository extends CrudRepository<Anggota, Long> {
	Anggota findById(long id);

	@Query("SELECT a FROM Anggota a WHERE a.nama LIKE %?1%")
	List<Anggota> findByNama(String nama);
}
