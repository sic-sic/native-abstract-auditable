create table app_user (
    id bigint not null,
    name varchar(255),
    primary key (id)
);

create table blog (
    id bigint not null,
    url varchar(255),
    created_by_id bigint,
    created_date timestamp,
    last_modified_by_id bigint,
    last_modified_date timestamp,
    primary key (id)
);

alter table blog add constraint fk_blog_created_by_id foreign key (created_by_id) references app_user;
alter table blog add constraint fk_blog_last_modified_by_id foreign key (last_modified_by_id) references app_user;

