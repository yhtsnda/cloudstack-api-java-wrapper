package com.fit2cloud.cloudstack.wsclient.model.request.volume;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class ListVolumesRequest extends Request {
	private String account;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String domainid;
	public String getDomainid() {
		return domainid;
	}
	public void setDomainid(String domainid) {
		this.domainid = domainid;
	}
	private String hostid;
	public String getHostid() {
		return hostid;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	private String podid;
	public String getPodid() {
		return podid;
	}
	public void setPodid(String podid) {
		this.podid = podid;
	}
	private String projectid;
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	private String tags;
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String virtualmachineid;
	public String getVirtualmachineid() {
		return virtualmachineid;
	}
	public void setVirtualmachineid(String virtualmachineid) {
		this.virtualmachineid = virtualmachineid;
	}
	private String zoneid;
	public String getZoneid() {
		return zoneid;
	}
	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}

}
