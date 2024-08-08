/*==============================================================*/
/* Nom de SGBD :  SAP SQL Anywhere 16                           */
/* Date de création :  08/08/2024 11:36:54                      */
/*==============================================================*/

create database if not exists craft;

use craft;

/*==============================================================*/
/* Table : CATEGORY                                             */
/*==============================================================*/
create table CATEGORY 
(
   CAT_ID               integer                        not null auto_increment,
   CAT_NAME             char(25)                       not null,
   constraint PK_CATEGORY primary key clustered (CAT_ID)
);

/*==============================================================*/
/* Index : CATEGORY_PK                                          */
/*==============================================================*/
create unique index CATEGORY_PK on CATEGORY (
CAT_ID ASC
);

/*==============================================================*/
/* Table : COMPONENT                                            */
/*==============================================================*/
create table COMPONENT 
(
   COM_ID               integer                        not null auto_increment,
   CAT_ID               integer                        not null,
   COM_NAME             char(25)                       not null,
   COM_PRICE            integer                        null,
   COM_IMG              varchar(125)                   null,
   constraint PK_COMPONENT primary key clustered (COM_ID)
);

/*==============================================================*/
/* Index : COMPONENT_PK                                         */
/*==============================================================*/
create unique index COMPONENT_PK on COMPONENT (
COM_ID ASC
);

/*==============================================================*/
/* Index : APPARTIENT_FK                                        */
/*==============================================================*/
create index APPARTIENT_FK on COMPONENT (
CAT_ID ASC
);

/*==============================================================*/
/* Table : COMPOSE                                              */
/*==============================================================*/
create table COMPOSE 
(
   OBJ_ID               integer                        not null,
   COM_ID               integer                        not null,
   constraint PK_COMPOSE primary key clustered (OBJ_ID, COM_ID)
);

/*==============================================================*/
/* Index : COMPOSE_PK                                           */
/*==============================================================*/
create unique index COMPOSE_PK on COMPOSE (
OBJ_ID ASC,
COM_ID ASC
);

/*==============================================================*/
/* Index : COMPOSE_FK                                           */
/*==============================================================*/
create index COMPOSE_FK on COMPOSE (
OBJ_ID ASC
);

/*==============================================================*/
/* Index : COMPOSE2_FK                                          */
/*==============================================================*/
create index COMPOSE2_FK on COMPOSE (
COM_ID ASC
);

/*==============================================================*/
/* Table : JOB                                                  */
/*==============================================================*/
create table JOB 
(
   JOB_ID               integer                        not null auto_increment,
   JOB_NAME             varchar(25)                    not null,
   constraint PK_JOB primary key clustered (JOB_ID)
);

/*==============================================================*/
/* Index : JOB_PK                                               */
/*==============================================================*/
create unique index JOB_PK on JOB (
JOB_ID ASC
);

/*==============================================================*/
/* Table : OBJECT                                               */
/*==============================================================*/
create table OBJECT 
(
   OBJ_ID               integer                        not null auto_increment,
   JOB_ID               integer                        not null,
   OBJ_NAME             char(25)                       not null,
   OBJ_BASE_PRICE       integer                        not null,
   OBJ_FINAL_PRICE      integer                        null,
   constraint PK_OBJECT primary key clustered (OBJ_ID)
);

/*==============================================================*/
/* Index : OBJECT_PK                                            */
/*==============================================================*/
create unique index OBJECT_PK on OBJECT (
OBJ_ID ASC
);

/*==============================================================*/
/* Index : A_FK                                                 */
/*==============================================================*/
create index A_FK on OBJECT (
JOB_ID ASC
);

/*==============================================================*/
/* Table : POSSEDE                                              */
/*==============================================================*/
create table POSSEDE 
(
   CUS_ID               integer                        not null,
   OBJ_ID               integer                        not null,
   constraint PK_POSSEDE primary key clustered (CUS_ID, OBJ_ID)
);

/*==============================================================*/
/* Index : POSSEDE_PK                                           */
/*==============================================================*/
create unique index POSSEDE_PK on POSSEDE (
CUS_ID ASC,
OBJ_ID ASC
);

/*==============================================================*/
/* Index : POSSEDE_FK                                           */
/*==============================================================*/
create index POSSEDE_FK on POSSEDE (
CUS_ID ASC
);

/*==============================================================*/
/* Index : POSSEDE2_FK                                          */
/*==============================================================*/
create index POSSEDE2_FK on POSSEDE (
OBJ_ID ASC
);

/*==============================================================*/
/* Table : "CUSTOMER"                                               */
/*==============================================================*/
create table CUSTOMER 
(
   CUS_ID               integer                        not null auto_increment,
   CUS_PSEUDO           varchar(20)                    not null,
   CUS_PASSWORD         varchar(25)                    not null,
   CUS_EMAIL            varchar(25)                    not null,
   constraint PK_CUSTOMER primary key clustered (CUS_ID)
);

/*==============================================================*/
/* Index : CUSTOMER_PK                                              */
/*==============================================================*/
create unique index CUSTOMER_PK on CUSTOMER (
CUS_ID ASC
);

alter table COMPONENT
   add constraint FK_COMPONEN_APPARTIEN_CATEGORY foreign key (CAT_ID)
      references CATEGORY (CAT_ID)
      on update restrict
      on delete restrict;

alter table COMPOSE
   add constraint FK_COMPOSE_COMPOSE_OBJECT foreign key (OBJ_ID)
      references OBJECT (OBJ_ID)
      on update restrict
      on delete restrict;

alter table COMPOSE
   add constraint FK_COMPOSE_COMPOSE2_COMPONEN foreign key (COM_ID)
      references COMPONENT (COM_ID)
      on update restrict
      on delete restrict;

alter table OBJECT
   add constraint FK_OBJECT_A_JOB foreign key (JOB_ID)
      references JOB (JOB_ID)
      on update restrict
      on delete restrict;

alter table POSSEDE
   add constraint FK_POSSEDE_POSSEDE_CUSTOMER foreign key (CUS_ID)
      references CUSTOMER (CUS_ID)
      on update restrict
      on delete restrict;

alter table POSSEDE
   add constraint FK_POSSEDE_POSSEDE2_OBJECT foreign key (OBJ_ID)
      references OBJECT (OBJ_ID)
      on update restrict
      on delete restrict;

