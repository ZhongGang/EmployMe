###############
#Domain:  Article
###############
DROP TABLE  IF EXISTS  article;
CREATE TABLE `article` (
  `id` int(11) NOT NULL auto_increment,
  `version` int(9) default 0,
  `active` tinyint(1) default '1',
  `guid` varchar(255) default NULL,
  `create_time` datetime ,
  `title` varchar(255),
  `content` text,
  `category` varchar(255),
  `user_id` int(11),
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

###############
#Domain:  Comment
###############
DROP TABLE  IF EXISTS  comment;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL auto_increment,
  `version` int(9) default 0,
  `active` tinyint(1) default '1',
  `guid` varchar(255) default NULL,
  `create_time` datetime ,
  `article_id` int(11),
  `title` varchar(255),
  `email` varchar(255),
  `content` varchar(255),
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

###############
#Domain:  Resume
###############
DROP TABLE  IF EXISTS  resume;
CREATE TABLE `resume` (
  `id` int(11) NOT NULL auto_increment,
  `version` int(9) default 0,
  `active` tinyint(1) default '1',
  `guid` varchar(255) default NULL,
  `create_time` datetime ,
  `english_name` varchar(255),
  `chinese_name` varchar(255),
  `birthday` date,
  `phone` varchar(255),
  `email` varchar(255),
  `qq` varchar(255),
  `gender` varchar(255),
  `address` varchar(255),
  `self_description` text,
--   `portrait_id` int(11),
  `user_id` int(11),
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

###############
#Domain:  EducationExperience
###############
DROP TABLE  IF EXISTS  education_experience;
CREATE TABLE `education_experience` (
  `id` int(11) NOT NULL auto_increment,
  `version` int(9) default 0,
  `active` tinyint(1) default '1',
  `guid` varchar(255) default NULL,
  `create_time` datetime ,
  `start_date` date ,
  `end_date` date ,
  `school` varchar(255),
  `major` varchar(255),
  `description` text,
  `resume_id` int(11),
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

###############
#Domain:  ProjectExperience
###############
DROP TABLE  IF EXISTS  project_experience;
CREATE TABLE `project_experience` (
  `id` int(11) NOT NULL auto_increment,
  `version` int(9) default 0,
  `active` tinyint(1) default '1',
  `guid` varchar(255) default NULL,
  `create_time` datetime ,
  `start_date` date ,
  `end_date` date ,
  `project` varchar(255),
  `remark` text,
  `duty` text,
  `resume_id` int(11),
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE  IF EXISTS  technologies;
CREATE TABLE `technologies` (
  `project_experience_id` int(11) NOT NULL,
  `technology` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


###############
#Domain:  WorkExperience
###############
DROP TABLE  IF EXISTS  work_experience;
CREATE TABLE `work_experience` (
  `id` int(11) NOT NULL auto_increment,
  `version` int(9) default 0,
  `active` tinyint(1) default '1',
  `guid` varchar(255) default NULL,
  `create_time` datetime ,
  `start_date` date ,
  `end_date` date ,
  `company` varchar(255),
  `position` varchar(255),
  `department` varchar(255),
  `description` text,
  `resume_id` int(11),
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

###############
#Domain:  Attachment
###############
DROP TABLE  IF EXISTS  attachment;
CREATE TABLE `attachment` (
  `id` int(11) NOT NULL auto_increment,
  `version` int(9) default 0,
  `active` tinyint(1) default '1',
  `guid` varchar(255) default NULL,
  `create_time` datetime ,
  `type` varchar(255),
  `name` varchar(255),
  `file_type` varchar(255),
  `contents` MediumBlob,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

###############
#Domain:  User
###############
DROP TABLE  IF EXISTS  users;
CREATE TABLE `users` (
  `id` int(11) NOT NULL auto_increment,
  `version` int(9) default 0,
  `active` tinyint(1) default '1',
  `guid` varchar(255) default NULL,
  `create_time` datetime ,
  `type` varchar(255),
  `username` varchar(255) unique,
  `password` varchar(255),
  `nickname` varchar(255),
  `email` varchar(255) unique,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;