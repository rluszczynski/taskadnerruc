INSERT INTO _case (id, case_number, case_type, case_state,  data_of_entry) VALUES (1, '4689/22', 'C', 'CLOSED', '2022-07-01');
INSERT INTO _case (id, case_number, case_type, case_state,  data_of_entry) VALUES (2, '1792/22', 'P', 'DISMISSED', '2022-10-02');
INSERT INTO _case (id, case_number, case_type, case_state,  data_of_entry) VALUES (3, '1732/23', 'Co', 'CLOSED', '2023-02-21');
INSERT INTO _case (id, case_number, case_type, case_state,  data_of_entry) VALUES (4, '8465/21', 'P', 'OPEN', '2021-04-22');
INSERT INTO _case (id, case_number, case_type, case_state,  data_of_entry) VALUES (5, '151/21', 'Co', 'OPEN', '2021-04-20');
INSERT INTO _case (id, case_number, case_type, case_state,  data_of_entry) VALUES (6, '2629/21', 'Co', 'CLOSED', '2021-03-23');
INSERT INTO _case (id, case_number, case_type, case_state,  data_of_entry) VALUES (7, '7971/23', 'W', 'CLOSED', '2023-01-17');
INSERT INTO _case (id, case_number, case_type, case_state,  data_of_entry) VALUES (8, '5722/22', 'Co', 'CLOSED', '2022-03-27');
INSERT INTO _case (id, case_number, case_type, case_state,  data_of_entry) VALUES (9, '4545/23', 'C', 'OPEN', '2023-07-04');
INSERT INTO _case (id, case_number, case_type, case_state,  data_of_entry) VALUES (10, '5634/21', 'C', 'DISMISSED', '2021-05-31');


INSERT INTO _party (id, case_id, active, name, party_type) VALUES (1, 1, true, 'Janelle Morse', 'PLAINTIFF');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (2, 1, true, 'Shepard Sanford', 'DEFENDANT');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (3, 2, true, 'Mccoy Hunter', 'PLAINTIFF');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (4, 2, true, 'Marianne Eaton', 'DEFENDANT');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (5, 3, false, 'Kemp Gutierrez', 'PLAINTIFF');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (6, 3, true, 'Santana Miller', 'DEFENDANT');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (7, 4, true, 'Freda Shelton', 'PLAINTIFF');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (8, 4, true, 'Ball Richards', 'DEFENDANT');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (9, 5, false, 'Miles Lang', 'PLAINTIFF');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (10, 5, true, 'Dyer Moreno', 'DEFENDANT');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (11, 6, true, 'Gomez Calderon', 'PLAINTIFF');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (12, 6, true, 'Gardner Crawford', 'DEFENDANT');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (13, 7, false, 'George Clemons', 'PLAINTIFF');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (14, 7, true, 'Melba Fernandez', 'DEFENDANT');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (15, 8, true, 'Rowena Dunlap', 'PLAINTIFF');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (16, 8, false, 'Hope Nolan', 'DEFENDANT');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (17, 9, true, 'Melinda Weaver', 'PLAINTIFF');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (18, 9, false, 'Riggs Phillips', 'DEFENDANT');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (19, 10, true, 'Nadia Waller', 'PLAINTIFF');
INSERT INTO _party (id, case_id, active, name, party_type) VALUES (20, 10, true, 'Lara Owens', 'DEFENDANT');


INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (1, 'Gdańsk', '80-001', 'Długa', 1);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (2, 'Kraków', '30-001', 'Floriańska', 1);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (3, 'Gdynia', '81-001', 'Świętojańska', 2);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (4, 'Sopot', '81-702', 'Bohaterów Monte Cassino', 2);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (5, 'Malbork', '82-200', 'Zamkowa', 2);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (6, 'Kwidzyn', '82-500', 'Grunwaldzka', 3);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (7, 'Gdańsk', '80-005', 'Morska', 3);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (8, 'Kraków', '30-005', 'Kazimierza Wielkiego', 3);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (9, 'Gdynia', '81-003', 'Starowiejska', 4);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (10, 'Sopot', '81-701', 'Kościuszki', 4);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (11, 'Malbork', '82-201', 'Królewiecka', 4);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (12, 'Kwidzyn', '82-501', 'Przemysłowa', 5);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (13, 'Gdańsk', '80-002', 'Jasna', 6);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (14, 'Kraków', '30-006', 'Sławkowska', 6);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (15, 'Gdynia', '81-004', 'Kartuska', 7);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (16, 'Sopot', '81-703', 'Niepodległości', 8);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (17, 'Malbork', '82-202', 'Mickiewicza', 8);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (18, 'Kwidzyn', '82-502', 'Dworcowa', 8);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (19, 'Gdańsk', '80-003', 'Ogarna', 9);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (20, 'Kraków', '30-007', 'Podgórska', 9);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (21, 'Gdynia', '81-005', 'Zwycięstwa', 10);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (22, 'Sopot', '81-704', 'Polna', 10);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (23, 'Malbork', '82-203', 'Piastowska', 11);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (24, 'Kwidzyn', '82-503', 'Słowiańska', 11);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (25, 'Gdańsk', '80-004', 'Mariacka', 11);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (26, 'Kraków', '30-008', 'Dunajewskiego', 12);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (27, 'Gdynia', '81-006', 'Chłopska', 12);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (28, 'Sopot', '81-705', 'Krasickiego', 13);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (29, 'Malbork', '82-204', 'Ogrodowa', 13);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (30, 'Kwidzyn', '82-504', 'Jana Pawła II', 14);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (31, 'Gdańsk', '80-005', 'Wały Piastowskie', 14);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (32, 'Kraków', '30-009', 'Focha', 15);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (33, 'Gdynia', '81-007', 'Redłowska', 16);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (34, 'Sopot', '81-706', 'Landscape', 17);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (35, 'Malbork', '82-205', 'Zamknięta', 17);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (36, 'Kwidzyn', '82-505', 'Koszarowa', 17);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (37, 'Gdańsk', '80-006', 'Karmelicka', 18);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (38, 'Kraków', '30-010', 'Grota-Roweckiego', 18);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (39, 'Gdynia', '81-008', 'Morska', 19);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (40, 'Sopot', '81-707', 'Graniczna', 19);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (41, 'Malbork', '82-206', 'Kopernika', 20);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (42, 'Kwidzyn', '82-506', 'Zielona', 20);
INSERT INTO _address (id, city, postal_code, street, party_id) VALUES (43, 'Gdańsk', '80-007', 'Stagiewna', 20);