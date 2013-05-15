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

package com.lftechnology.geekpeoples.guestportlet.model.impl;

import com.lftechnology.geekpeoples.guestportlet.model.Question;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Question in entity cache.
 *
 * @author syanjo
 * @see Question
 * @generated
 */
public class QuestionCacheModel implements CacheModel<Question>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{questionId=");
		sb.append(questionId);
		sb.append(", question=");
		sb.append(question);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", tagId=");
		sb.append(tagId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append("}");

		return sb.toString();
	}

	public Question toEntityModel() {
		QuestionImpl questionImpl = new QuestionImpl();

		questionImpl.setQuestionId(questionId);

		if (question == null) {
			questionImpl.setQuestion(StringPool.BLANK);
		}
		else {
			questionImpl.setQuestion(question);
		}

		questionImpl.setUserId(userId);
		questionImpl.setTagId(tagId);

		if (createDate == Long.MIN_VALUE) {
			questionImpl.setCreateDate(null);
		}
		else {
			questionImpl.setCreateDate(new Date(createDate));
		}

		questionImpl.setCompanyId(companyId);
		questionImpl.setGroupId(groupId);

		questionImpl.resetOriginalValues();

		return questionImpl;
	}

	public long questionId;
	public String question;
	public long userId;
	public long tagId;
	public long createDate;
	public long companyId;
	public long groupId;
}