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
@Table(name="BOWLER")
@Getter @Setter @ToString

public class Bowler {
	@Id
	@SequenceGenerator(name="SEQ_BOW")
	@Column(name="ID")
	private int id;
	
	@Column(name="OVERS")
	private float overs;
	
	@Column(name="MAIDEN")
	private int maiden;
	
	@Column(name="RUNS")
	private int runs;
	
	@Column(name="WICKETS")
	private int wickets;
	
	//no balls
	@Column(name="NO_BALLS")
	private int noBalls;
	
	@Column(name="WIDES")
	private int wides;
	
	@Column(name="LEG_BYES")
	private int legByes;
	
	@Column(name="BYES")
	private int byes;
	
	@Column(name="PENALTY")
	private int penalty;
	
	@Column(name="ECONOMY")
	private float economy;
	
	@ManyToOne
	@JoinColumn(name="PLAYER_ID")
	private Player player;
	
	
	
	

}
