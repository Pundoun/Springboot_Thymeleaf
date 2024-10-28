package vn.iotstar.SpringBootThymeleaf.Services;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import ch.qos.logback.core.util.StringUtil;
import vn.iotstar.SpringBootThymeleaf.Entity.CategoryEntity;
import vn.iotstar.SpringBootThymeleaf.Repository.CategoryRepository;

//Khai báo Service
@Service
public class CategoryServiceImpl  implements ICategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public <S extends CategoryEntity> S save(S entity) {
		if(entity!=null) {
			Optional<CategoryEntity> opt = findById(entity.getId());
			if (opt.isPresent() ) {
				if (StringUtils.isEmpty(entity.getName())) {
					entity.setName(opt.get().getName());
				} else {
					//lấy lại images cũ
					entity.setName(entity.getName());
				}
			}
			return categoryRepository.save(entity);
			
		} else {
			return categoryRepository.save(entity);
		}
	}

	@Override
	public List<CategoryEntity> findAll() {
		return categoryRepository.findAll();
	}
	
	

	@Override
	public <S extends CategoryEntity> Optional<S> findOne(Example<S> example) {
		return categoryRepository.findOne(example);
	}

	@Override
	public List<CategoryEntity> findAll(Sort sort) {
		return categoryRepository.findAll(sort);
	}

	@Override
	public Page<CategoryEntity> findAll(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

	@Override
	public List<CategoryEntity> findAllById(Iterable<Integer> ids) {
		return categoryRepository.findAllById(ids);
	}

	@Override
	public Optional<CategoryEntity> findById(Integer id) {
		return categoryRepository.findById(id);
	}

	@Override
	public long count() {
		return categoryRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public List<CategoryEntity> findByNameContaining(String name) {
		return categoryRepository.findByNameContaining(name);
	}

	@Override
	public Page<CategoryEntity> findByNameContaining(String name, Pageable pageable) {
		return categoryRepository.findByNameContaining(name, pageable);
	}
		
}