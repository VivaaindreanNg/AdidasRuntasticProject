package com.webapp.adidasruntastic.service;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.adidasruntastic.model.SportsSession;
import com.webapp.adidasruntastic.repository.AdidasRuntasticRepository;

@Service
public class AdidasRuntasticService {

	@Autowired
	private AdidasRuntasticRepository adidasRepo;
	
	/**
	 * Retrieve entire records in document
	 * 
	 * @return List<{@link SportsSession}> list of sports session
	 */
	public List<SportsSession> findAllSession() {
		return adidasRepo.findAll();
	}
	
	/**
	 * Retrieve a single record from document
	 * 
	 * @param id String of ObjectId
	 * @return {@link SportsSession} Object
	 */
	public SportsSession findById(String id) {
		return adidasRepo.findById(id).get();
	}
	
	/**
	 * Create a new session into MongoDB
	 * <p>
	 * When sending payload through request body via JSON,
	 * the only fields ignored in MongoDB are ObjectId and date.
	 * 
	 * And ensure that the key in JSON follows the variable name 
	 * of {@link SportsSession} model. 
	 * </p>
	 * 
	 * @param session Object of type {@link SportsSession}
	 * @return {@link SportsSession} Object
	 */
	public SportsSession addSession(SportsSession session) {
		if (ObjectUtils.isEmpty(session.getCreationDate())) {
			Date date = new Date();
			session.setCreationDate(date);
		}
		return adidasRepo.save(session);
	}
	
	/**
	 * Deletes a record out from MongoDB.
	 * <p>
	 * Returns true if object existed in DB,
	 * false otherwise.
	 * </p>
	 * 
	 * @param id String of ObjectId
	 * @return Boolean
	 */
	public Boolean deleteSession(String id) {
		SportsSession toBeDeleted = adidasRepo.findById(id).get();
		
		if (ObjectUtils.isNotEmpty(toBeDeleted)) {
			adidasRepo.delete(toBeDeleted);
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	/**
	 * Update session based on:
	 * <p>
	 * 1: (Existing) Id
	 * 2: Payload of session through RequestBody
	 * </p>
	 * 
	 * @param id String of ObjectId
	 * @param session {@link SportsSession} Object
	 * @return {@link SportsSession} Object
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	public SportsSession updateSession(String id, SportsSession session) 
			throws IllegalAccessException, InvocationTargetException {
		
		SportsSession toBeUpdated = adidasRepo.findById(id).get();	
		BeanUtils.copyProperties(toBeUpdated, session);
		
		//Ensure updating back to the same exact Id
		toBeUpdated.setId(id);
		return adidasRepo.save(toBeUpdated);
	}
	
	/**
	 * Retrieve list of sessions with distance above or equal to input distance
	 * 
	 * @param distance Integer Minimum distance (in km)
	 * @return List<{@link SportsSession}>
	 */
	public List<SportsSession> findByMinimumDistance(Integer distance) {
		//Needed conversion, since distance stored in DB is in form of metres.
		Integer totalDistance = distance *= 1000;
		List<SportsSession> sessionList = adidasRepo.findAll();
		
		List<SportsSession> result = sessionList.stream()
												.filter(e -> e.getDistance() >= totalDistance)
												.collect(Collectors.toList());
		return result;
	}
}
