create table GP_Question (
	questionId LONG not null primary key,
	question TEXT null,
	userId LONG,
	tagId LONG,
	createDate DATE null,
	companyId LONG,
	groupId LONG
);