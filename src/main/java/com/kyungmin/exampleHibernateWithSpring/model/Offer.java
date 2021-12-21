package com.kyungmin.exampleHibernateWithSpring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

@Entity
@Table(name="offer")
public class Offer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="offer_id")
	private int id; //기본 키
	
	@Size(min=2, max=100, message="Name은 최소 2글자, 최대 100글자 입니다.")
	private String name;
	
	@Email(message="Email 형식을 지켜야 합니다.")
	@NotEmpty(message="Email은 반드시 입력해야 합니다.")
	private String email;
	
	@Size(min=5, max=100, message="Offer는 최소 5글자, 최대 100글자 입니다.")
	private String text;
	
}
