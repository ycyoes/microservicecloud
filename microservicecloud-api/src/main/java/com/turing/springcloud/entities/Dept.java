package com.turing.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{	//必须序列化
	private Long deptno;
	private String dname;	//部门名称
	private String db_source;	//数据源
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
}
