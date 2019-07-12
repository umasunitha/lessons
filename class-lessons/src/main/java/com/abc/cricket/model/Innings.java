package com.abc.cricket.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="INNINGS")
@Setter @Getter @ToString
public class Innings {
	
	@Id
	@SequenceGenerator(name="SEQ_INN")
	@Column(name="ID")
	private int id;
	
	@Column(name="SCORE")
	private int score;
	
	@Column(name="WICKETS")
	private int wickets;
	
	@Column(name="OVERS")
	private float overs;
	
	@OneToOne
	@JoinColumn(name="BATTING_TEAMS")
	private Team battingTeams;
	
	@OneToOne
	@JoinColumn(name="BOWLING_TEAMS")
	private Team bowlingTeams;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn
	private List<Batsman> batsman;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="BOWLER_ID")
	private List<Bowler> bowler;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn
	private List<FallOfWickets> fallOfWickets;
		
	
	

	
	
	

}
