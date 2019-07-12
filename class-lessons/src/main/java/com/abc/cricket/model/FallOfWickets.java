package com.abc.cricket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="FALL_OF_WICKETS")
@Setter @Getter @ToString
public class FallOfWickets {

	@Id
	@SequenceGenerator(name="SEQ_FID")
	@Column(name="ID")
	private int id;
	
	@Column(name="RUNS_AT")
	private int runsAt;
	
	@Column(name="OVERS_AT")
	private float oversAt;
	
		
	//Batsman got out	
	@ManyToOne
	@JoinColumn(name="BATTING_BY")
	private Player battingBy;
	
	//Bowler 
	
	@ManyToOne
	@JoinColumn(name="BOWL_BY")
	private Player bowler;
	
	//caught
	@ManyToOne
	@JoinColumn(name="ASSIST_BY")
	private Player assist;
	
	
	
	
	
}
