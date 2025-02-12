ALTER TABLE employee_project ADD CONSTRAINT chk_role CHECK (role IN ('Lead Developer', 'Manager', 'HR', 'Analyst', 'Engineer'));
