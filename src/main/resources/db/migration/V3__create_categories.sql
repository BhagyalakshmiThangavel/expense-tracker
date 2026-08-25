CREATE TABLE categories (
    id         UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name       VARCHAR(100) UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULT NOW()
);

INSERT INTO categories (name) VALUES
    ('Food'), ('Transport'), ('Rent'),
    ('Entertainment'), ('Healthcare'),
    ('Shopping'), ('Utilities');