CREATE OR REPLACE FUNCTION update_updated_at_column()
        RETURNS TRIGGER AS '
    BEGIN
        NEW.updated_at = NOW();
        RETURN NEW;
    END;
' LANGUAGE 'plpgsql';

CREATE TABLE books (
  id          varchar(256) PRIMARY KEY,
  title  varchar(80) NOT NULL CHECK (title <> ''),
  firstname  varchar(80),
  lastname   varchar(80),
  genre       varchar(80),
  created_at  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);
CREATE TRIGGER update_updated_at_books
    BEFORE UPDATE ON books FOR EACH ROW EXECUTE
    PROCEDURE update_updated_at_column();

CREATE TABLE users (
  id          varchar(256) PRIMARY KEY,
  name        varchar(80) NOT NULL CHECK (name <> ''),
  created_at  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);
CREATE TRIGGER update_updated_at_users
    BEFORE UPDATE ON users FOR EACH ROW EXECUTE
    PROCEDURE update_updated_at_column();
