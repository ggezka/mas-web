package smkbangsri.service;

import java.util.List;

import javax.inject.Inject;

import smkbangsri.entity.Anggota;

import smkbangsri.repository.AnggotaRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
public class RestAnggotaService implements AnggotaService {
	@Inject
	private AnggotaRepository anggotaRepository;

	@Override
	public Anggota getAnggotaById(long id) {
		// TODO Auto-generated method stub
		return anggotaRepository.findById(id);
	}

	@Override
	public List<Anggota> findAnggotaByNama(String nama) {
		// TODO Auto-generated method stub
		return anggotaRepository.findByNama(nama);
	}

	@Transactional
	@Override
	public Anggota saveAnggota(Anggota anggota) {
		// TODO Auto-generated method stub
		anggota.setId(0);
		return anggotaRepository.save(anggota);
	}

	@Transactional
	@Override
	public Anggota updateAnggota(long id, Anggota anggota) {
		Anggota ag = getAnggotaById(anggota.getId());
		if (ag != null) {
			ag.setNama(anggota.getNama());
			ag.setNoTelpon(anggota.getNoTelpon());
			ag.setAlamat(anggota.getAlamat());
			ag.setBuku(anggota.getBuku());
		}
		
		return ag;
	}

	@Transactional
	@Override
	public void deleteAnggota(long id) {
		// TODO Auto-generated method stub
		anggotaRepository.delete(id);
		
	}
	
	
}
