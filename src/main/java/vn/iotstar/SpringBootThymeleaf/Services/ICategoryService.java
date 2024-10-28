package vn.iotstar.SpringBootThymeleaf.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import vn.iotstar.SpringBootThymeleaf.Entity.CategoryEntity;

public interface ICategoryService {

	void deleteById(Long id);

	long count();

	Optional<CategoryEntity> findById(Long id);

	List<CategoryEntity> findAll();

	List<CategoryEntity> findByNameContaining(String name);

	Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);

	void deleteAll();

	void delete(CategoryEntity entity);

	<S extends CategoryEntity> Optional<S> findOne(Example<S> example);

	List<CategoryEntity> findAllById(Iterable<Long> ids);

	List<CategoryEntity> findAll(Sort sort);

	Page<CategoryEntity> findAll(Pageable pageable);

	<S extends CategoryEntity> S save(S entity);

}
