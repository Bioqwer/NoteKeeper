CREATE TABLE note
(
  head           CHAR(255),
  body           LONGTEXT,
  creationDate   DATE,
  lastChangeDate DATE,
  noteId         BIGINT UNIQUE PRIMARY KEY NOT NULL,
  userId         BIGINT                    NOT NULL
);
CREATE TABLE user
(
  userId   BIGINT PRIMARY KEY NOT NULL,
  email    CHAR(40) UNIQUE,
  login    CHAR(40) UNIQUE    NOT NULL,
  password CHAR(40)
);
ALTER TABLE note ADD CONSTRAINT note_ibfk_1 FOREIGN KEY (userId)
REFERENCES user (userId)
  ON DELETE CASCADE;
CREATE INDEX R_3 ON note (userId);
