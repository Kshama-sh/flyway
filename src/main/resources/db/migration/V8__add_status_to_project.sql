ALTER TABLE project ADD COLUMN status ENUM('Planned', 'In Progress', 'Completed') NOT NULL DEFAULT 'Planned';
