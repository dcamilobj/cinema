package com.cinema.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author Camilo Bedoya
 *
 */

@Entity
public class Parameter implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_parameter")
	private Long idParameter;
	@Column
	private String name;
	@Column
	private String value;
	
	/**
	 * @return the idParameter
	 */
	public Long getIdParameter() {
		return idParameter;
	}
	/**
	 * @param idParameter the idParameter to set
	 */
	public void setIdParameter(Long idParameter) {
		this.idParameter = idParameter;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	
}