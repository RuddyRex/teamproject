
INSERT INTO "PUBLIC"."USER" ("FIRST_NAME", "LAST_NAME", "PASS" ) VALUES ('test1_name', 'test1_surname', 'test1_pass');
INSERT INTO "PUBLIC"."USER" ("FIRST_NAME", "LAST_NAME", "PASS" ) VALUES ('test2_name', 'test2_surname', 'test2_pass');
INSERT INTO "PUBLIC"."USER" ("FIRST_NAME", "LAST_NAME", "PASS" ) VALUES ('test3_name', 'test3_surname', 'test3_pass');
INSERT INTO "PUBLIC"."USER" ("FIRST_NAME", "LAST_NAME", "PASS" ) VALUES ('test4_name', 'test4_surname', 'test4_pass');
INSERT INTO "PUBLIC"."USER" ("FIRST_NAME", "LAST_NAME", "PASS" ) VALUES ('test5_name', 'test5_surname','test5_pass');

INSERT INTO "PUBLIC"."POST" ("USER_ID", "CONTENT", "CREATION_DATE", "IS_PUBLIC" ) VALUES (0, 'content1', '1994-02-14 00:00:00.00', true);
INSERT INTO "PUBLIC"."POST" ("USER_ID", "CONTENT", "CREATION_DATE", "IS_PUBLIC" ) VALUES (1, 'content2', '1994-02-14 00:00:00.00', true);
INSERT INTO "PUBLIC"."POST" ("USER_ID", "CONTENT", "CREATION_DATE", "IS_PUBLIC" ) VALUES (2, 'content3', '1994-02-14 00:00:00.00', true);
INSERT INTO "PUBLIC"."POST" ("USER_ID", "CONTENT", "CREATION_DATE", "IS_PUBLIC" ) VALUES (3, 'content4', '1994-02-14 00:00:00.00', true);
INSERT INTO "PUBLIC"."POST" ("USER_ID", "CONTENT", "CREATION_DATE", "IS_PUBLIC" ) VALUES (4, 'content5', '1994-02-14 00:00:00.00', true);
INSERT INTO "PUBLIC"."POST" ("USER_ID", "CONTENT", "CREATION_DATE", "IS_PUBLIC" ) VALUES (0, 'content6', '1994-02-14 00:00:00.00', false);

INSERT INTO "PUBLIC"."FOLLOWER" ("FOLLOWER_ID", "FOLLOWED_ID") VALUES (0, 3);
INSERT INTO "PUBLIC"."FOLLOWER" ("FOLLOWER_ID", "FOLLOWED_ID") VALUES (1, 3);
INSERT INTO "PUBLIC"."FOLLOWER" ("FOLLOWER_ID", "FOLLOWED_ID") VALUES (2, 3);
INSERT INTO "PUBLIC"."FOLLOWER" ("FOLLOWER_ID", "FOLLOWED_ID") VALUES (4, 3);
INSERT INTO "PUBLIC"."FOLLOWER" ("FOLLOWER_ID", "FOLLOWED_ID") VALUES (4, 0);
INSERT INTO "PUBLIC"."FOLLOWER" ("FOLLOWER_ID", "FOLLOWED_ID") VALUES (4, 1);
INSERT INTO "PUBLIC"."FOLLOWER" ("FOLLOWER_ID", "FOLLOWED_ID") VALUES (4, 2);