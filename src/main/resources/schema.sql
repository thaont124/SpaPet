CREATE DATABASE spapet;

USE spapet;

CREATE TABLE Role (
  id BIGINT PRIMARY KEY,
  name NVARCHAR(255)
);

CREATE TABLE User (
  id BIGINT PRIMARY KEY,
  name NVARCHAR(255),
  userName NVARCHAR(255),
  password NVARCHAR(255),
  phoneNumber NVARCHAR(10)
);

CREATE TABLE Service (
  id BIGINT PRIMARY KEY,
  name NVARCHAR(255),
  appointmentTime DATETIME,
  petType NVARCHAR(255)
);

CREATE TABLE Category (
  id BIGINT PRIMARY KEY,
  name NVARCHAR(255)
);

CREATE TABLE Message (
  id BIGINT PRIMARY KEY,
  name NVARCHAR(255),
  content NVARCHAR(2000)
);

CREATE TABLE CategoryService (
  id BIGINT PRIMARY KEY,
  serviceId BIGINT,
  categoryId BIGINT,
  FOREIGN KEY (serviceId) REFERENCES Service(id),
  FOREIGN KEY (categoryId) REFERENCES Category(id)
);

CREATE TABLE UserService (
  id BIGINT PRIMARY KEY,
  userId BIGINT,
  serviceId BIGINT,
  bookingTime DATETIME,
  FOREIGN KEY (userId) REFERENCES User(id),
  FOREIGN KEY (serviceId) REFERENCES Service(id)
);

CREATE TABLE UserRole (
  id BIGINT PRIMARY KEY,
  userId BIGINT,
  roleId BIGINT,
  FOREIGN KEY (userId) REFERENCES User(id),
  FOREIGN KEY (roleId) REFERENCES Role(id)
);

CREATE TABLE UserMessage (
  id BIGINT PRIMARY KEY,
  userId BIGINT,
  messageId BIGINT,
  FOREIGN KEY (userId) REFERENCES User(id),
  FOREIGN KEY (messageId) REFERENCES Message(id)
);




