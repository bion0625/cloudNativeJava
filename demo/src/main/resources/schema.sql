CREATE TABLE customers (
    id INT NOT NULL AUTO_INCREMENT, -- ID를 자동 증가 설정
    email VARCHAR(255) NOT NULL UNIQUE, -- 이메일은 고유값으로 설정
    PRIMARY KEY (id) -- ID를 기본 키로 지정
);