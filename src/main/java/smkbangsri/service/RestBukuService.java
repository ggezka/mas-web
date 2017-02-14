package smkbangsri.service;

import java.util.List;


import smkbangsri.entity.Buku;

import smkbangsri.repository.BukuRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
public class RestBukuService implements BukuService {

	@Autowired
	private BukuRepository bukuRepository;
	
	
	@Override
	public Buku getBukuById(long id) {
		// TODO Auto-generated method stub
		return bukuRepository.findById(id);
	}

	@Override
	public List<Buku> findBukuByJudul(String judul) {
		// TODO Auto-generated method stub
		return bukuRepository.findByJudul(judul);
	}

	@Transactional
	@Override
	public Buku saveBuku(Buku buku) {
		// TODO Auto-generated method stub
		buku.setId(0);
		return bukuRepository.save(buku);
		
	}

	@Transactional
	@Override
	public Buku updateBuku(long id, Buku buku) {
		// TODO Auto-generated method stub
		Buku bk = getBukuById(buku.getId());
		if (bk != null) {
			bk.setJudul(buku.getJudul());
			bk.setPengarang(buku.getPengarang());
			bk.setTahunterbit(buku.getTahunterbit());
		}
		
		return bk;
		
	}

	@Transactional
	@Override
	public void deleteBuku(long id) {
		// TODO Auto-generated method stub
		bukuRepository.delete(id);
	}
	
}