CREATE TABLE prs_project_types (
    prty_id SERIAL PRIMARY KEY,
    prty_name VARCHAR(100) NOT NULL,
    prty_desc VARCHAR(255)
);
 
 
 
CREATE TABLE prs_admin_users (
    ausr_id SERIAL PRIMARY KEY,
    ausr_username VARCHAR(60) NOT NULL,
    ausr_fullname VARCHAR(70),
    ausr_pwd VARCHAR(100) NOT NULL,
    ausr_cdate TIMESTAMP,
    ausr_lastpwdreset TIMESTAMP,
    ausr_status VARCHAR(4),
    ausr_luausr_id SMALLINT REFERENCES prs_admin_users(ausr_id)
);

CREATE TABLE prs_employees (
    empl_id SERIAL PRIMARY KEY,
    empl_fullname VARCHAR(70) NOT NULL,
    empl_desg VARCHAR(50),
    empl_department VARCHAR(50),
    empl_ref_no VARCHAR(20),
    empl_status VARCHAR(4),
    empl_ludate TIMESTAMP,
    empl_ausr_id INT REFERENCES prs_admin_users(ausr_id)
);
 

CREATE TABLE prs_projects (
    proj_id SERIAL PRIMARY KEY,
    proj_title VARCHAR(100) NOT NULL,
    proj_prty_id SMALLINT NOT NULL REFERENCES prs_project_types(prty_id),
    proj_location VARCHAR(100) NOT NULL,
    proj_cdate DATE NOT NULL,
    proj_desc VARCHAR(255),
    proj_banner BYTEA,
    proj_coordinates POINT,
    proj_construction_status VARCHAR(4),
    proj_status VARCHAR(4),
    proj_luudate TIMESTAMP,
    proj_luausr_id SMALLINT REFERENCES prs_admin_users(ausr_id)
);
CREATE TABLE prs_properties (
    prop_id SERIAL PRIMARY KEY,
    prop_proj_id SMALLINT REFERENCES prs_projects(proj_id),
    prop_type VARCHAR(4),
    prop_ref_no VARCHAR(20),
    prop_status VARCHAR(5),
    prop_luudate TIMESTAMP,
    prop_luausr_id SMALLINT REFERENCES prs_admin_users(ausr_id)
);
 
CREATE TABLE prs_enquiries (
    enqr_id SERIAL PRIMARY KEY,
    enqr_date TIMESTAMP NOT NULL,
    enqr_proj_id SMALLINT NOT NULL REFERENCES prs_projects(proj_id),
    enqr_fullname VARCHAR(100) NOT NULL,
    enqr_profession VARCHAR(60),
    enqr_local VARCHAR(3),
    enqr_mobile VARCHAR(11),
    enqr_source VARCHAR(4),
    enqr_empl_id INT REFERENCES prs_employees(empl_id),
    enqr_email VARCHAR(100),
    enqr_address VARCHAR(255),
    enqr_location VARCHAR(50),
    enqr_pin VARCHAR(6),
    enqr_city VARCHAR(50),
    enqr_luudate TIMESTAMP
);
 
CREATE TABLE prs_site_visits (
    stvs_id SERIAL PRIMARY KEY,
    stvs_enqr_id INT NOT NULL REFERENCES prs_enquiries(enqr_id),
    stvs_date TIMESTAMP NOT NULL,
    stvs_remarks VARCHAR(255),
    stvs_empl_id INT REFERENCES prs_employees(empl_id),
    stvs_status VARCHAR(4)
);
 
CREATE TABLE prs_customers (
    cust_id SERIAL PRIMARY KEY,
    cust_enqr_id INT NOT NULL REFERENCES prs_enquiries(enqr_id),
    cust_prop_id SMALLINT REFERENCES prs_properties(prop_id),
    cust_firstname VARCHAR(50) NOT NULL,
    cust_lastname VARCHAR(50) NOT NULL,
    cust_email VARCHAR(100) NOT NULL,
    cust_mobile VARCHAR(11),
    cust_address VARCHAR(255),
    cust_location VARCHAR(50),
    cust_pin VARCHAR(6),
    cust_city VARCHAR(50),
    cust_luudate TIMESTAMP
);
 
CREATE TABLE prs_project_apartments (
    aprt_id SERIAL PRIMARY KEY,
    aprt_title VARCHAR(100) NOT NULL,
    aprt_cdate TIMESTAMP NOT NULL,
    aprt_proj_id SMALLINT REFERENCES prs_projects(proj_id),
    aprt_ref_no VARCHAR(20),
    aprt_status VARCHAR(4)
);
 
CREATE TABLE prs_project_villas (
    vill_id SERIAL PRIMARY KEY,
    vill_proj_id SMALLINT REFERENCES prs_projects(proj_id),
    vill_ref_no VARCHAR(20),
    vill_cdate DATE,
    vill_sqft NUMERIC,
    vill_builtup_area NUMERIC,
    vill_banner_photo BYTEA,
    vill_status VARCHAR(4)
);
 
CREATE TABLE prs_project_commercial_complexes (
    cplx_id SERIAL PRIMARY KEY,
    cplx_title VARCHAR(100) NOT NULL,
    cplx_proj_id SMALLINT REFERENCES prs_projects(proj_id),
    cplx_ref_no VARCHAR(20),
    cplx_cdate DATE,
    cplx_sqft NUMERIC,
    cplx_builtup_area NUMERIC,
    cplx_banner_photo BYTEA,
    cplx_status VARCHAR(4)
);
 
CREATE TABLE prs_apartment_floors (
    proj_id SMALLINT NOT NULL REFERENCES prs_projects(proj_id),
    aprf_floorindex SMALLINT,
    aprf_floorplan BYTEA,
    aprf_completion_status VARCHAR(4),
    aprf_luudate TIMESTAMP,
    aprf_ausr_id SMALLINT REFERENCES prs_admin_users(ausr_id),
    PRIMARY KEY (proj_id, aprf_floorindex)
);
 

 
CREATE TABLE prs_flat_properties (
    prop_id INT PRIMARY KEY REFERENCES prs_properties(prop_id),
    prop_flat_no VARCHAR(10)
);
 
CREATE TABLE prs_commercial_complex_properties (
    prop_id INT PRIMARY KEY REFERENCES prs_properties(prop_id),
    prop_blck_no VARCHAR(10)
);
 
CREATE TABLE prs_villa_properties (
    prop_id INT PRIMARY KEY REFERENCES prs_properties(prop_id),
    prop_vill_no VARCHAR(10)
);
 


 
CREATE TABLE prs_customer_users (
    user_id SERIAL PRIMARY KEY,
    user_cust_id INT REFERENCES prs_customers(cust_id),
    user_email VARCHAR(60) NOT NULL,
    user_cdate TIMESTAMP,
    user_pwd VARCHAR(255) NOT NULL,
    user_luudate TIMESTAMP
);
 
CREATE TABLE prs_payments (
    pay_id SERIAL PRIMARY KEY,
    pay_cust_id INT REFERENCES prs_customers(cust_id),
    pay_amount NUMERIC NOT NULL,
    pay_date TIMESTAMP NOT NULL,
    pay_method VARCHAR(10),
    pay_status VARCHAR(4),
    pay_luudate TIMESTAMP
);


