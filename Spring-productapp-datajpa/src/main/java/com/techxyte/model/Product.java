package com.techxyte.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor


@Entity
public class Product {


//	@Table(name="nameProduct")

	private String name;

	@Id
	@GeneratedValue(generator ="Product_seq",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="Product_seq",sequenceName ="Product_sequence",initialValue =10,allocationSize =1)
	
	
	
	
	
	private Integer ProductId;

	private String category;

	private double price;

	private String btand;

}
