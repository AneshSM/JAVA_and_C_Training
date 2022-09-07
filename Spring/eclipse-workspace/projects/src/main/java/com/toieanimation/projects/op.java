package com.toieanimation.projects;

import java.util.List;

public class op {
	String teamname;
	String captainname;
	List<String> players;
	
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname=teamname;
	}
	public String getCaptainname() {
		return captainname;
	}
	public void setCaptainname(String captainname) {
		this.captainname = captainname;
	}
	public List<String> getPlayers() {
		return players;
	}
	public void setPlayers(List<String> players) {
		this.players = players;
	}
	@Override
	public String toString() {
		return "op [teamname=" + teamname + ", captainname=" + captainname + ", players=" + players + "]";
	}
}
