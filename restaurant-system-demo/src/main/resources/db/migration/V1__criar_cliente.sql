CREATE TABLE `tb_clientes` (
 `id` INT NOT NULL,
 `name` VARCHAR(255) NOT NULL,
 `email` VARCHAR(255) NOT NULL,
 PRIMARY KEY (`id`));

 ALTER TABLE `tb_clientes`
 CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ,
 ADD UNIQUE INDEX `id_UNIQUE` (`id` ASC);
