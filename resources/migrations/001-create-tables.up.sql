CREATE OR REPLACE FUNCTION update_updated_at_column()
        RETURNS TRIGGER AS '
    BEGIN
        NEW.updated_at = NOW();
        RETURN NEW;
    END;
' LANGUAGE 'plpgsql';

CREATE TABLE books (
  id          serial PRIMARY KEY,
  title       varchar(80) NOT NULL CHECK (title <> ''),
  cover       varchar(80),
  author      varchar(80),
  body        varchar(80),
  genre       varchar(80),
  created_at  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TRIGGER update_updated_at_books
    BEFORE UPDATE ON books FOR EACH ROW EXECUTE
    PROCEDURE update_updated_at_column();
