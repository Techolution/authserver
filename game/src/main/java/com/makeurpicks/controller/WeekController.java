package com.makeurpicks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.makeurpicks.domain.Week;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping(value="/weeks")
public class WeekController  {


	@RequestMapping(method=RequestMethod.GET, value="/")
	public @ResponseBody Iterable<Week> getWeeksBySeason(@PathVariable String id)
	{
		return Collections.EMPTY_LIST;
//		return weekService.getWeeksBySeason(id);
	}
	
//	@RequestMapping(method=RequestMethod.GET, value="/leagueid/{id}")
//	public @ResponseBody Iterable<Week> getWeeksByLeague(@PathVariable String id)
//	{
//		return Collections.EMPTY_LIST;
////		return weekService.getWeeksByLeague(id);
//	}
	
	@RequestMapping(method=RequestMethod.GET, value="/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public @ResponseBody Week createWeek(@RequestBody Week week)
	{
		return new Week();
//		return weekService.createWeek(week);
	}
	
}
