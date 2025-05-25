package example.hibernate.entity;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="article")
public class Article {
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public LocalDate getDate_created() {
		return date_created;
	}
	public void setDate_created(LocalDate date_created) {
		this.date_created = date_created;
	}
	public String getCreator_name() {
		return creator_name;
	}
	public void setCreator_name(String creator_name) {
		this.creator_name = creator_name;
	}
	public Article(Integer id, String name, Category category, LocalDate date_created, String creator_name) {
		super();
		
		this.name = name;
		this.category = category;
		this.date_created = date_created;
		this.creator_name = creator_name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", category=" + category + ", date_created=" + date_created
				+ ", creator_name=" + creator_name + "]";
	}
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="category")
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(name="date_created")
	private LocalDate date_created;
	@Column(name="creator_name ")
	private String creator_name;
	

}
