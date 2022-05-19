package com.ssamz.biz.board;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
@Data // @AllArgsConstructor 빼고 다 포함
public class BoardVO {
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate; // .sql
	private int cnt;
}
