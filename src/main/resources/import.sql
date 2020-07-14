INSERT INTO heroes
(heroName, attribute)
VALUES
('Axe',1),
('Abbadon',1),
('Alchemist',1),
('Anti-Mage',2);

INSERT INTO heroes_role
(rolename)
VALUES
('Support'),
('Carry'),
('Jungle'),
('Durable'),
('Summoner');

INSERT INTO heroes_heroes_role
(heroes_id,heroesroles_id)
values
(2,2),
(2,3),
(1,4),
(1,3);