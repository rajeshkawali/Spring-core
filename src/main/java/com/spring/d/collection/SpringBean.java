package com.spring.d.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SpringBean implements SpringInterface {

	private Map<Object, Object> map;
	private List<Object> lists;
	private Set<Object> sets;
	private Properties pros;

	public Map<Object, Object> getMap() {
		return map;
	}

	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}

	public List<Object> getLists() {
		return lists;
	}

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	public Set<Object> getSets() {
		return sets;
	}

	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}

	public Properties getPros() {
		return pros;
	}

	public void setPros(Properties pros) {
		this.pros = pros;
	}

	public void displayList() {
		System.out.println("List =>" + lists);
		System.out.println("Map =>" + map);
		System.out.println("Set =>" + sets);
		System.out.println("Properties =>" + pros);

		for (Object list : lists) {
			System.out.println("List printing =>" + list);
		}

	}

}
