CREATE TABLE t_orders
(
    id BIGSERIAL PRIMARY KEY NOT NULL,
    order_number varchar(255) DEFAULT NULL,
    sku_code varchar(255),
    price numeric(19, 2),
    quantity integer
);