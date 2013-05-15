/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.lftechnology.geekpeoples.guestportlet.service.persistence;

import com.lftechnology.geekpeoples.guestportlet.model.Question;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the question service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author syanjo
 * @see QuestionPersistenceImpl
 * @see QuestionUtil
 * @generated
 */
public interface QuestionPersistence extends BasePersistence<Question> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuestionUtil} to access the question persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the question in the entity cache if it is enabled.
	*
	* @param question the question
	*/
	public void cacheResult(
		com.lftechnology.geekpeoples.guestportlet.model.Question question);

	/**
	* Caches the questions in the entity cache if it is enabled.
	*
	* @param questions the questions
	*/
	public void cacheResult(
		java.util.List<com.lftechnology.geekpeoples.guestportlet.model.Question> questions);

	/**
	* Creates a new question with the primary key. Does not add the question to the database.
	*
	* @param questionId the primary key for the new question
	* @return the new question
	*/
	public com.lftechnology.geekpeoples.guestportlet.model.Question create(
		long questionId);

	/**
	* Removes the question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param questionId the primary key of the question
	* @return the question that was removed
	* @throws com.lftechnology.geekpeoples.guestportlet.NoSuchQuestionException if a question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.geekpeoples.guestportlet.model.Question remove(
		long questionId)
		throws com.lftechnology.geekpeoples.guestportlet.NoSuchQuestionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.lftechnology.geekpeoples.guestportlet.model.Question updateImpl(
		com.lftechnology.geekpeoples.guestportlet.model.Question question,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the question with the primary key or throws a {@link com.lftechnology.geekpeoples.guestportlet.NoSuchQuestionException} if it could not be found.
	*
	* @param questionId the primary key of the question
	* @return the question
	* @throws com.lftechnology.geekpeoples.guestportlet.NoSuchQuestionException if a question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.geekpeoples.guestportlet.model.Question findByPrimaryKey(
		long questionId)
		throws com.lftechnology.geekpeoples.guestportlet.NoSuchQuestionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the question with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param questionId the primary key of the question
	* @return the question, or <code>null</code> if a question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.geekpeoples.guestportlet.model.Question fetchByPrimaryKey(
		long questionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the questions.
	*
	* @return the questions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.geekpeoples.guestportlet.model.Question> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of questions
	* @param end the upper bound of the range of questions (not inclusive)
	* @return the range of questions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.geekpeoples.guestportlet.model.Question> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of questions
	* @param end the upper bound of the range of questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of questions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.geekpeoples.guestportlet.model.Question> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the questions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of questions.
	*
	* @return the number of questions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}