package com.abc.cricket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="BATSMAN")
@Getter @Setter @ToString
public class Batsman {
	@Id
	@Column(name="ID")
	@SequenceGenerator(name="SEQ_BATSMAN")
	private int id;	
	
	@Column(name="RUNS")
	private int runs;
	
	@Column(name="BALLS")
	private int balls;
	
	@Column(name="FOURS")
	private int fours;
	
	@Column(name="SIXESS")
	private int sixes;
	
	@Column(name="STRIKE_RATE")	
	private int strikeRate;
	
	@ManyToOne
	@JoinColumn(name="PLAYER_ID")
	private Player player;
	
}
