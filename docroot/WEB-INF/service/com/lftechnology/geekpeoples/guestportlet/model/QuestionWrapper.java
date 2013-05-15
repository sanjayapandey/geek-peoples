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

package com.lftechnology.geekpeoples.guestportlet.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Question}.
 * </p>
 *
 * @author    syanjo
 * @see       Question
 * @generated
 */
public class QuestionWrapper implements Question, ModelWrapper<Question> {
	public QuestionWrapper(Question question) {
		_question = question;
	}

	public Class<?> getModelClass() {
		return Question.class;
	}

	public String getModelClassName() {
		return Question.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("questionId", getQuestionId());
		attributes.put("question", getQuestion());
		attributes.put("userId", getUserId());
		attributes.put("tagId", getTagId());
		attributes.put("createDate", getCreateDate());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long questionId = (Long)attributes.get("questionId");

		if (questionId != null) {
			setQuestionId(questionId);
		}

		String question = (String)attributes.get("question");

		if (question != null) {
			setQuestion(question);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long tagId = (Long)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	/**
	* Returns the primary key of this question.
	*
	* @return the primary key of this question
	*/
	public long getPrimaryKey() {
		return _question.getPrimaryKey();
	}

	/**
	* Sets the primary key of this question.
	*
	* @param primaryKey the primary key of this question
	*/
	public void setPrimaryKey(long primaryKey) {
		_question.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the question ID of this question.
	*
	* @return the question ID of this question
	*/
	public long getQuestionId() {
		return _question.getQuestionId();
	}

	/**
	* Sets the question ID of this question.
	*
	* @param questionId the question ID of this question
	*/
	public void setQuestionId(long questionId) {
		_question.setQuestionId(questionId);
	}

	/**
	* Returns the question of this question.
	*
	* @return the question of this question
	*/
	public java.lang.String getQuestion() {
		return _question.getQuestion();
	}

	/**
	* Sets the question of this question.
	*
	* @param question the question of this question
	*/
	public void setQuestion(java.lang.String question) {
		_question.setQuestion(question);
	}

	/**
	* Returns the user ID of this question.
	*
	* @return the user ID of this question
	*/
	public long getUserId() {
		return _question.getUserId();
	}

	/**
	* Sets the user ID of this question.
	*
	* @param userId the user ID of this question
	*/
	public void setUserId(long userId) {
		_question.setUserId(userId);
	}

	/**
	* Returns the user uuid of this question.
	*
	* @return the user uuid of this question
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _question.getUserUuid();
	}

	/**
	* Sets the user uuid of this question.
	*
	* @param userUuid the user uuid of this question
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_question.setUserUuid(userUuid);
	}

	/**
	* Returns the tag ID of this question.
	*
	* @return the tag ID of this question
	*/
	public long getTagId() {
		return _question.getTagId();
	}

	/**
	* Sets the tag ID of this question.
	*
	* @param tagId the tag ID of this question
	*/
	public void setTagId(long tagId) {
		_question.setTagId(tagId);
	}

	/**
	* Returns the create date of this question.
	*
	* @return the create date of this question
	*/
	public java.util.Date getCreateDate() {
		return _question.getCreateDate();
	}

	/**
	* Sets the create date of this question.
	*
	* @param createDate the create date of this question
	*/
	public void setCreateDate(java.util.Date createDate) {
		_question.setCreateDate(createDate);
	}

	/**
	* Returns the company ID of this question.
	*
	* @return the company ID of this question
	*/
	public long getCompanyId() {
		return _question.getCompanyId();
	}

	/**
	* Sets the company ID of this question.
	*
	* @param companyId the company ID of this question
	*/
	public void setCompanyId(long companyId) {
		_question.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this question.
	*
	* @return the group ID of this question
	*/
	public long getGroupId() {
		return _question.getGroupId();
	}

	/**
	* Sets the group ID of this question.
	*
	* @param groupId the group ID of this question
	*/
	public void setGroupId(long groupId) {
		_question.setGroupId(groupId);
	}

	public boolean isNew() {
		return _question.isNew();
	}

	public void setNew(boolean n) {
		_question.setNew(n);
	}

	public boolean isCachedModel() {
		return _question.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_question.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _question.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _question.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_question.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _question.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_question.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QuestionWrapper((Question)_question.clone());
	}

	public int compareTo(
		com.lftechnology.geekpeoples.guestportlet.model.Question question) {
		return _question.compareTo(question);
	}

	@Override
	public int hashCode() {
		return _question.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.lftechnology.geekpeoples.guestportlet.model.Question> toCacheModel() {
		return _question.toCacheModel();
	}

	public com.lftechnology.geekpeoples.guestportlet.model.Question toEscapedModel() {
		return new QuestionWrapper(_question.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _question.toString();
	}

	public java.lang.String toXmlString() {
		return _question.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_question.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Question getWrappedQuestion() {
		return _question;
	}

	public Question getWrappedModel() {
		return _question;
	}

	public void resetOriginalValues() {
		_question.resetOriginalValues();
	}

	private Question _question;
}