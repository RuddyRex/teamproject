INSERT INTO "PUBLIC"."USERS" ("FIRST_NAME", "LAST_NAME", "NICKNAME", "PASSWORD" ) VALUES ('Jon', 'jan_doe', 'Doe', '12345678');
INSERT INTO "PUBLIC"."USERS" ("FIRST_NAME", "LAST_NAME", "NICKNAME", "PASSWORD" ) VALUES ('John', 'john_stone', 'Stone', '12345678');
INSERT INTO "PUBLIC"."USERS" ("FIRST_NAME", "LAST_NAME", "NICKNAME", "PASSWORD" ) VALUES ('Peter', 'peter_parker', 'Stanbrige', '12345678');
INSERT INTO "PUBLIC"."USERS" ("FIRST_NAME", "LAST_NAME", "NICKNAME", "PASSWORD" ) VALUES ('Trevor', 'trevor', 'Virtue', '12345678');
INSERT INTO "PUBLIC"."USERS" ("FIRST_NAME", "LAST_NAME", "NICKNAME", "PASSWORD" ) VALUES ('Simoes', 'simon_salome', 'Salome', '12345678');

INSERT INTO "PUBLIC"."POSTS" ("USER_ID", "DESCRIPTION", "CREATED_AT", "IS_PUBLIC" ) VALUES (0, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.', '2022-12-23 19:34:47.00', false);
INSERT INTO "PUBLIC"."POSTS" ("USER_ID", "DESCRIPTION", "CREATED_AT", "IS_PUBLIC" ) VALUES (1, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris scelerisque ex massa, eu gravida felis blandit nec.', '2022-08-17 12:50:50.00', true);
INSERT INTO "PUBLIC"."POSTS" ("USER_ID", "DESCRIPTION", "CREATED_AT", "IS_PUBLIC" ) VALUES (2, 'Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.', '2022-11-11 10:58:39.00', true);
INSERT INTO "PUBLIC"."POSTS" ("USER_ID", "DESCRIPTION", "CREATED_AT", "IS_PUBLIC" ) VALUES (3, 'Pellentesque vel tincidunt turpis, id tempus lectus.', '2022-07-12 16:49:32.00', true);
INSERT INTO "PUBLIC"."POSTS" ("USER_ID", "DESCRIPTION", "CREATED_AT", "IS_PUBLIC" ) VALUES (4, 'Ut tempus interdum urna, eu eleifend massa hendrerit blandit.','2022-11-08 05:23:23.00', true);
INSERT INTO "PUBLIC"."POSTS" ("USER_ID", "DESCRIPTION", "CREATED_AT", "IS_PUBLIC" ) VALUES (0, 'Ut ut porta ex. Aliquam nec libero quis lacus laoreet sodales a laoreet nunc. Etiam aliquet condimentum aliquet.', '2022-10-10 12:34:34.00', false);

INSERT INTO "PUBLIC"."FOLLOWERS" ("FOLLOWER_ID", "FOLLOWEE_ID") VALUES (1, 2);
INSERT INTO "PUBLIC"."FOLLOWERS" ("FOLLOWER_ID", "FOLLOWEE_ID") VALUES (1, 3);
INSERT INTO "PUBLIC"."FOLLOWERS" ("FOLLOWER_ID", "FOLLOWEE_ID") VALUES (3, 2);
INSERT INTO "PUBLIC"."FOLLOWERS" ("FOLLOWER_ID", "FOLLOWEE_ID") VALUES (4, 3);
INSERT INTO "PUBLIC"."FOLLOWERS" ("FOLLOWER_ID", "FOLLOWEE_ID") VALUES (4, 1);
INSERT INTO "PUBLIC"."FOLLOWERS" ("FOLLOWER_ID", "FOLLOWEE_ID") VALUES (4, 2);
INSERT INTO "PUBLIC"."FOLLOWERS" ("FOLLOWER_ID", "FOLLOWEE_ID") VALUES (4, 3);