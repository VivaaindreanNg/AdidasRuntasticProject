package com.webapp.adidasruntastic;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.adidasruntastic.model.SportsSession;
import com.webapp.adidasruntastic.service.AdidasRuntasticService;

/**
 * Class where we expose the REST API endpoints to external party
 * @author User
 *
 */
@RestController
@RequestMapping(value = "/api")
public class WebController {
	
	private static final String ENDPOINT_ALL_SESSIONS = "/sessions";
	private static final String ENDPOINT_SESSIONS_GET_BY_ID = "/sessions/{id}";
	private static final String ENDPOINT_SESSIONS_ADD = "/sessions";
	private static final String ENDPOINT_SESSIONS_DELETE_BY_ID = "/sessions/{id}";
	private static final String ENDPOINT_SESSIONS_UPDATE_BY_ID = "/sessions/{id}";
	
	@Autowired
	private AdidasRuntasticService adidasService;
	
	@GetMapping(ENDPOINT_ALL_SESSIONS)
	public List<SportsSession> findAll() {
		return adidasService.findAllSession();
	}
	
	@GetMapping(ENDPOINT_SESSIONS_GET_BY_ID)
	public SportsSession findAllById(@PathVariable String id) {
		return adidasService.findById(id);
	}
	
	@PostMapping(ENDPOINT_SESSIONS_ADD)
	public SportsSession addSession(@RequestBody SportsSession session) {
		return adidasService.addSession(session);
	}
	
	@DeleteMapping(ENDPOINT_SESSIONS_DELETE_BY_ID)
	public String deleteSession(@PathVariable String id) {
		Boolean success = adidasService.deleteSession(id);
		String response = success ? "SUCCESS" : "FAIL";
		return response;
	}

	@PutMapping(ENDPOINT_SESSIONS_UPDATE_BY_ID)
	public SportsSession updateSession(@PathVariable String id, @RequestBody SportsSession session) 
			throws IllegalAccessException, InvocationTargetException {
		return adidasService.updateSession(id, session);
	}
}
