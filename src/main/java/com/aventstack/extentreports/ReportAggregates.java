package com.aventstack.extentreports;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.aventstack.extentreports.model.Author;
import com.aventstack.extentreports.model.Category;
import com.aventstack.extentreports.model.Device;
import com.aventstack.extentreports.model.Test;

/**
 * Aggregator for report elements and collections
 *
 */
public class ReportAggregates {

	private List<Test> testList;
    private List<String> testRunnerLogs;
	private TestAttributeTestContextProvider<Category> categoryContext;
	private TestAttributeTestContextProvider<Author> authorContext;
	private TestAttributeTestContextProvider<Device> deviceContext;
	private ExceptionTestContextImpl exceptionContext;
	private SystemAttributeContext systemAttributeContext;
	private ReportStatusStats reportStatusStats;
	private Collection<Status> statusCollection;
	private Date startTime;
    private Date endTime;
    
	public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Status getStatus() {
		return Status.getHighestStatus(getStatusCollection());
	}
	
	public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }

    public List<String> getTestRunnerLogs() {
        return testRunnerLogs;
    }

    public void setTestRunnerLogs(List<String> testRunnerLogs) {
        this.testRunnerLogs = testRunnerLogs;
    }

    public TestAttributeTestContextProvider<Category> getCategoryContext() {
        return categoryContext;
    }

    public void setCategoryContext(TestAttributeTestContextProvider<Category> categoryContext) {
        this.categoryContext = categoryContext;
    }

    public TestAttributeTestContextProvider<Author> getAuthorContext() {
        return authorContext;
    }

    public void setAuthorContext(TestAttributeTestContextProvider<Author> authorContext) {
        this.authorContext = authorContext;
    }

    public TestAttributeTestContextProvider<Device> getDeviceContext() {
        return deviceContext;
    }

    public void setDeviceContext(TestAttributeTestContextProvider<Device> deviceContext) {
        this.deviceContext = deviceContext;
    }

    public ExceptionTestContextImpl getExceptionContext() {
        return exceptionContext;
    }

    public void setExceptionContext(ExceptionTestContextImpl exceptionContext) {
        this.exceptionContext = exceptionContext;
    }

    public SystemAttributeContext getSystemAttributeContext() {
        return systemAttributeContext;
    }

    public void setSystemAttributeContext(SystemAttributeContext systemAttributeContext) {
        this.systemAttributeContext = systemAttributeContext;
    }

    public ReportStatusStats getReportStatusStats() {
        return reportStatusStats;
    }

    public void setReportStatusStats(ReportStatusStats reportStatusStats) {
        this.reportStatusStats = reportStatusStats;
    }

    public Collection<Status> getStatusCollection() {
        return statusCollection;
    }

    public void setStatusCollection(Collection<Status> statusCollection) {
        this.statusCollection = statusCollection;
    }
	
}
