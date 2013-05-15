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

package com.lftechnology.geekpeoples.guestportlet.service.impl;

import java.util.ArrayList;

import com.lftechnology.geekpeoples.guestportlet.model.Question;
import com.lftechnology.geekpeoples.guestportlet.service.base.QuestionLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the question local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lftechnology.geekpeoples.guestportlet.service.QuestionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author syanjo
 * @see com.lftechnology.geekpeoples.guestportlet.service.base.QuestionLocalServiceBaseImpl
 * @see com.lftechnology.geekpeoples.guestportlet.service.QuestionLocalServiceUtil
 */
public class QuestionLocalServiceImpl extends QuestionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.lftechnology.geekpeoples.guestportlet.service.QuestionLocalServiceUtil} to access the question local service.
	 */
	
	public ArrayList<Question> getQuestions() throws SystemException{
		ArrayList<Question> questionList = new ArrayList<Question>();
		questionList = (ArrayList<Question>) questionPersistence.findAll();
		return questionList;
	}
	
}