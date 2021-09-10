INSERT INTO tb_cable (number, code, description, amount_fiber, amount_group, created_at) VALUES (60258, 'CFOA-24', 'cabo de 36 fibras', 36, 6, NOW())

INSERT INTO tb_group (num_group, created_at, cable_id) VALUES (1, NOW(), 1)
INSERT INTO tb_group (num_group, created_at, cable_id) VALUES (2, NOW(), 1)
INSERT INTO tb_group (num_group, created_at, cable_id) VALUES (3, NOW(), 1)
INSERT INTO tb_group (num_group, created_at, cable_id) VALUES (4, NOW(), 1)
INSERT INTO tb_group (num_group, created_at, cable_id) VALUES (5, NOW(), 1)
INSERT INTO tb_group (num_group, created_at, cable_id) VALUES (6, NOW(), 1)

INSERT INTO tb_fiber (number, occupation, label, created_at, group_id) VALUES (1, True, 'PAE BV   PAE NR   DP*V   0001', now(), 1)
INSERT INTO tb_fiber (number, occupation, label, created_at, group_id) VALUES (2, True, 'PAE BV   PAE NR   DP*V   0002', now(), 1)
INSERT INTO tb_fiber (number, occupation, label, created_at, group_id) VALUES (3, True, 'PAE BV   PAE NR   DP*V   0003', now(), 1)
INSERT INTO tb_fiber (number, occupation, label, created_at, group_id) VALUES (4, True, 'PAE BV   PAE NR   DP*V   0004', now(), 1)
INSERT INTO tb_fiber (number, occupation, label, created_at, group_id) VALUES (5, True, 'PAE BV   PAE NR   DP*V   0005', now(), 1)
INSERT INTO tb_fiber (number, occupation, label, created_at, group_id) VALUES (6, True, 'PAE BV   PAE NR   DP*V   0006', now(), 1)

