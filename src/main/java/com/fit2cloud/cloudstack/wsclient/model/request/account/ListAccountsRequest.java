package com.fit2cloud.cloudstack.wsclient.model.request.account;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class ListAccountsRequest extends Request {
	private String accounttype;
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	private String domainid;
	public String getDomainid() {
		return domainid;
	}
	public void setDomainid(String domainid) {
		this.domainid = domainid;
	}
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String iscleanuprequired;
	public String getIscleanuprequired() {
		return iscleanuprequired;
	}
	public void setIscleanuprequired(String iscleanuprequired) {
		this.iscleanuprequired = iscleanuprequired;
	}
	private String isrecursive;
	public String getIsrecursive() {
		return isrecursive;
	}
	public void setIsrecursive(String isrecursive) {
		this.isrecursive = isrecursive;
	}
	private String keyword;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	private String listall;
	public String getListall() {
		return listall;
	}
	public void setListall(String listall) {
		this.listall = listall;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String page;
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	private String pagesize;
	public String getPagesize() {
		return pagesize;
	}
	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
