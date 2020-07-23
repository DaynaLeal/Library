USE speedreader_db;

#User Table
INSERT INTO `speedreader_db`.`users` (`id`, `username`, `password`, `email`)
VALUES (1, 'dayone', 'oxKJf96', 'dayone@email.com');

#Book Table
INSERT INTO `speedreader_db`.`books` (`id`, `volume_id`, `user_id`, `title`, `author`, `description`, `image_Url`, `published_date`, `read_date`, `times_read`, `review`, `rating`, `free_read`, `medium_type`, `literary_type`, `genre`)
VALUES (1, '1111', 1, 'Book One Title', 'Dayna Leal', 'The first book in the SQL seeder. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur cum eaque nisi quam. Consequatur, dolor.', null, 'June 2020', 'July 2020', 2, 'the best book ever', 5, 'yes', 'ebook', 'Fiction', 'Fantasy');

INSERT INTO `speedreader_db`.`books` (`id`, `volume_id`, `user_id`, `title`, `author`, `description`, `image_Url`, `published_date`, `read_date`, `times_read`, `review`, `rating`, `free_read`, `medium_type`, `literary_type`, `genre`)
VALUES (2, '2222', 1, 'Book Two Title', 'Dayna Leal', 'The second book in the SQL seeder. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur cum eaque nisi quam. Consequatur, dolor.', null, 'June 2020', 'July 2020', 1, 'the best book ever', 3, 'yes', 'book', 'Non-Fiction', 'Fantasy');

INSERT INTO `speedreader_db`.`books` (`id`, `volume_id`, `user_id`, `title`, `author`, `description`, `image_Url`, `published_date`, `read_date`, `times_read`, `review`, `rating`, `free_read`, `medium_type`, `literary_type`, `genre`)
VALUES (3, '3333', 1, 'Book Three Title', 'Dayna Leal', 'The third book in the SQL seeder. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur cum eaque nisi quam. Consequatur, dolor.', null, 'June 2020', 'July 2020', 1, 'the best book ever', 4, 'yes', 'ebook', 'Fiction', 'Fantasy');

INSERT INTO `speedreader_db`.`books` (`id`, `volume_id`, `user_id`, `title`, `author`, `description`, `image_Url`, `published_date`, `read_date`, `times_read`, `review`, `rating`, `free_read`, `medium_type`, `literary_type`, `genre`)
VALUES (4, '4444', 1, 'Book Four Title', 'Dayna Leal', 'The fourth book in the SQL seeder. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur cum eaque nisi quam. Consequatur, dolor.', null, 'June 2020', 'July 2020', 2, 'the best book ever', 5, 'yes', 'audio book', 'Fiction', 'Fantasy');

INSERT INTO `speedreader_db`.`books` (`id`, `volume_id`, `user_id`, `title`, `author`, `description`, `image_Url`, `published_date`, `read_date`, `times_read`, `review`, `rating`, `free_read`, `medium_type`, `literary_type`, `genre`)
VALUES (5, '5555', 1, 'Book Five Title', 'Dayna Leal', 'The fifth book in the SQL seeder. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur cum eaque nisi quam. Consequatur, dolor.', null, 'June 2020', 'July 2020', 1, 'the best book ever', 4, 'yes', 'ebook', 'Fiction', 'Fantasy')

