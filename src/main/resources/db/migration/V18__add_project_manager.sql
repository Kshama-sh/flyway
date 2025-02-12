ALTER TABLE project ADD COLUMN manager_id INT;
ALTER TABLE project ADD FOREIGN KEY (manager_id) REFERENCES employee(id);
