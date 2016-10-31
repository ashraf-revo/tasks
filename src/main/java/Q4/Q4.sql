CREATE TABLE IF NOT EXISTS `node` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `nodes_id` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
INSERT INTO `node` (`id`, `name`, `nodes_id`) VALUES
(1, 'root', NULL),
(2, 'child1', 1),
(3, 'child2', 1);
ALTER TABLE `node`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKax4eb5664gqjfb3m8kenaooe1` (`nodes_id`);
ALTER TABLE `node`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
ALTER TABLE `node`
  ADD CONSTRAINT `FKax4eb5664gqjfb3m8kenaooe1` FOREIGN KEY (`nodes_id`) REFERENCES `node` (`id`);




