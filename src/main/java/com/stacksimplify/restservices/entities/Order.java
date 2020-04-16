package com.stacksimplify.restservices.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "orders")
public class Order extends RepresentationModel {

	@Id
	@GeneratedValue
	@JsonView(Views.Internal.class)
	private Long orderid;

	@JsonView(Views.Internal.class)
	private String orderdescriptions;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public String getOrderdescriptions() {
		return orderdescriptions;
	}

	public void setOrderdescriptions(String orderdescriptions) {
		this.orderdescriptions = orderdescriptions;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
