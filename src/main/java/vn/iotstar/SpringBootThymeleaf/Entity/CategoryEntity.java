package vn.iotstar.SpringBootThymeleaf.Entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="categories")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="categoryid")
	private int id;
	@Column(name="categoryname", columnDefinition = "nvarchar(255) not null")
	private String name;
	@Column(name="images", columnDefinition = "nvarchar(500) null")
	private String images;
	@Column(name="status")
	private int status;
	
}
