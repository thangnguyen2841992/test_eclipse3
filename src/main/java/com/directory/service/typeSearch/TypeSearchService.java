package com.directory.service.typeSearch;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.directory.model.entity.TypeSearch;
import com.directory.repository.ITypeSearchRepository;

@Service
public class TypeSearchService implements ITypeSearchService {
	
	@SuppressWarnings("unused")
	@Autowired
	private ITypeSearchRepository typeSearchRepository;
	@Override
	public Iterable<TypeSearch> findAll() {
		// TODO Auto-generated method stub
		return this.typeSearchRepository.findAll();
	}

	@Override
	public Optional<TypeSearch> findById(Long id) {
		// TODO Auto-generated method stub
		return this.typeSearchRepository.findById(id);
	}

	@Override
	public TypeSearch save(TypeSearch t) {
		// TODO Auto-generated method stub
		return this.typeSearchRepository.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.typeSearchRepository.deleteById(id);
	}
	
 
}
