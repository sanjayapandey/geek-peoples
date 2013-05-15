package com.lftechnology.geekpeoples.guestportlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.lftechnology.geekpeoples.guestportlet.model.Question;
import com.lftechnology.geekpeoples.guestportlet.service.QuestionLocalServiceUtil;
import com.lftechnology.geekpeoples.guestportlet.service.impl.QuestionLocalServiceImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class GuestPortlet
 */
public class GuestPortlet extends MVCPortlet {

	public void displayAll(ActionRequest actionRequest, ActionResponse actionResponse)
			throws SystemException {
		ArrayList<Question> questions = new ArrayList<Question>();

		questions = QuestionLocalServiceUtil.getQuestions();

		actionRequest.setAttribute("questions", questions);

		System.out.println("display all data");
	}

}
