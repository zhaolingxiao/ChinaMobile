/**
 * @Title:Emp.java
 * @Package:cn.pwc.pojo
 * @Description:TODO
 * @author ZhuXiaosi
 * @date Aug 23, 2017 2:39:30 PM
 * @version V1.0
 */
package cn.pwc.pojo;

import java.util.Date;

/**
 * @ClassName:Emp
 * @Description:TODO
 * @author ZhuXiaosi
 * @date Aug 23, 2017 2:39:30 PM
 * @version V1.0
 */
public class Emp {
	
	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	private Date hiredate;
 	private Double sal;
 	private Double comm;
 	private Integer deptno;
	/**
	 * @return the empno
	 */
	public Integer getEmpno() {
		return empno;
	}
	/**
	 * @param empno the empno to set
	 */
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * @return the mgr
	 */
	public Integer getMgr() {
		return mgr;
	}
	/**
	 * @param mgr the mgr to set
	 */
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	/**
	 * @return the hiredate
	 */
	public Date getHiredate() {
		return hiredate;
	}
	/**
	 * @param hiredate the hiredate to set
	 */
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	/**
	 * @return the sal
	 */
	public Double getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(Double sal) {
		this.sal = sal;
	}
	/**
	 * @return the comm
	 */
	public Double getComm() {
		return comm;
	}
	/**
	 * @param comm the comm to set
	 */
	public void setComm(Double comm) {
		this.comm = comm;
	}
	/**
	 * @return the deptno
	 */
	public Integer getDeptno() {
		return deptno;
	}
	/**
	 * @param deptno the deptno to set
	 */
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
 	
 	

}
