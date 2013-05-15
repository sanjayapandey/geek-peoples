<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/security"
	prefix="liferay-security"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>

<%@ page import="java.util.List"%>

<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys"%>


<%@page import="com.lftechnology.geekpeoples.guestportlet.service.QuestionLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.lftechnology.geekpeoples.guestportlet.model.Question"%>
<%@page import="com.lftechnology.geekpeoples.guestportlet.GuestPortlet"%>

<portlet:defineObjects />

This is the <b>Guest Portlet</b> portlet in View mode.


<liferay-ui:search-container emptyResultsMessage="student-empty-list"
	delta="20">
	<liferay-ui:search-container-results>

		<%	
			List<Question> questions = QuestionLocalServiceUtil.getQuestions();
			
					results = ListUtil.subList(questions,
							searchContainer.getStart(),
							searchContainer.getEnd());
					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	
	
	<liferay-ui:search-container-row className="Question" keyProperty="questionId"
		modelVar="question">
		<liferay-ui:search-container-column-text orderable="true"
			name="id" property="questionId" />
		<liferay-ui:search-container-column-text orderable="true"
			name="question" property="question" />

		<liferay-ui:search-container-column-text>
			<%
				Long primKey = question.getQuestionId();
			%>
			<portlet:actionURL name="editMode" var="editUrl">
				<portlet:param name="id" value="<%=primKey.toString()%>" />
			</portlet:actionURL>
			<a href="<%= editUrl %>">Edit</a>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>


