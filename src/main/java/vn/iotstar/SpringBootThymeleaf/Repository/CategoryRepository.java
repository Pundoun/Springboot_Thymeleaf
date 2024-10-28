package vn.iotstar.SpringBootThymeleaf.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import vn.iotstar.SpringBootThymeleaf.Entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer>{
	//Tìm kiếm theo nội dung tên
	List<CategoryEntity> findByNameContaining(String name);
	//Tìm kiếm và Phân trang
	Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);

}
