CREATE TABLE otp_verifications (
    id         UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    user_id    UUID REFERENCES users(id) ON DELETE CASCADE,
    otp_code   VARCHAR(6) NOT NULL,
    expires_at TIMESTAMP NOT NULL,
    is_used    BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP DEFAULT NOW()
);