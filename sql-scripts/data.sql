INSERT INTO `test`.`t_sys_user` (`id`, `username`, `password`) VALUES ('1', 'jack', '123456');
INSERT INTO `test`.`t_sys_user` (`id`, `username`, `password`) VALUES ('2', 'lily', '123455');
INSERT INTO `test`.`t_sys_user` (`id`, `username`, `password`) VALUES ('3', 'admin', '123456');

INSERT INTO `test`.`t_sys_role` (`id`, `name`) VALUES ('1', 'ROLE_admin');
INSERT INTO `test`.`t_sys_role` (`id`, `name`) VALUES ('2', 'ROLE_operater');


INSERT INTO `test`.`t_sys_user_role` (`id`, `sys_user_id`, `sys_role_id`) VALUES ('1', '1', '1');
INSERT INTO `test`.`t_sys_user_role` (`id`, `sys_user_id`, `sys_role_id`) VALUES ('2', '1', '2');
INSERT INTO `test`.`t_sys_user_role` (`id`, `sys_user_id`, `sys_role_id`) VALUES ('3', '2', '2');
INSERT INTO `test`.`t_sys_user_role` (`id`, `sys_user_id`, `sys_role_id`) VALUES ('4', '3', '1');