package vn.iotstar.SpringBootThymeleaf.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import vn.iotstar.SpringBootThymeleaf.Entity.CategoryEntity;

public interface ICategoryService {

	Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);

	List<CategoryEntity> findByNameContaining(String name);

	void deleteById(Integer id);

	long count();

	Optional<CategoryEntity> findById(Integer id);

	List<CategoryEntity> findAllById(Iterable<Integer> ids);

	Page<CategoryEntity> findAll(Pageable pageable);

	List<CategoryEntity> findAll(Sort sort);

	<S extends CategoryEntity> Optional<S> findOne(Example<S> example);

	List<CategoryEntity> findAll();

	<S extends CategoryEntity> S save(S entity);

	
	
}