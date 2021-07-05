CREATE DATABASE hotel;

use hotel;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `tel` varchar(15) DEFAULT NULL,
    `role` int(11) DEFAULT NULL,
    `id_card` varchar(18) DEFAULT NULL,
    `vip` int(11) DEFAULT NULL,
    `create_at` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `tel` (`tel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

DROP TABLE IF EXISTS `rooms`;
CREATE TABLE `rooms` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `type_id` int(11) DEFAULT 0,
    `status` int(11) DEFAULT 0,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

DROP TABLE IF EXISTS `room_type`;
CREATE TABLE `room_type` (
    `id`    int(11) NOT NULL AUTO_INCREMENT,
    `price` int(11) DEFAULT 0,
    `info`  varchar(128) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

DROP TABLE IF EXISTS `user_in_room`;
CREATE TABLE `user_in_room` (
    `id`        int(11) NOT NULL AUTO_INCREMENT,
    `user_id`   int(11) DEFAULT NULL,
    `room_id`   int(11) DEFAULT NULL,
    `re`        int(11) DEFAULT 0,
    `create_at` varchar(20) DEFAULT NULL,
    `delete_at` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

DROP TABLE IF EXISTS `user_book_room`;
CREATE TABLE `user_book_room` (
    `id`        int(11) NOT NULL AUTO_INCREMENT,
    `user_id`   int(11) DEFAULT NULL,
    `room_id`   int(11) DEFAULT NULL,
    `re`        int(11) DEFAULT 0,
    `create_at` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

DROP TABLE IF EXISTS `user_cost`;
CREATE TABLE `user_cost` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `cost` int(11) DEFAULT NULL,
    `info` varchar(128) DEFAULT NULL,
     PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;