package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMatchingRetrieveOutputModelMatchingInstanceAnalysis
 */
public class BQMatchingRetrieveOutputModelMatchingInstanceAnalysis   {
  private Object matchingInstanceAnalysisRecord = null;

  private String matchingInstanceAnalysisReportType = null;

  private String matchingInstanceAnalysisParameters = null;

  private Object matchingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return matchingInstanceAnalysisRecord
  **/

  public Object getMatchingInstanceAnalysisRecord() {
    return matchingInstanceAnalysisRecord;
  }

  public void setMatchingInstanceAnalysisRecord(Object matchingInstanceAnalysisRecord) {
    this.matchingInstanceAnalysisRecord = matchingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return matchingInstanceAnalysisReportType
  **/

  public String getMatchingInstanceAnalysisReportType() {
    return matchingInstanceAnalysisReportType;
  }

  public void setMatchingInstanceAnalysisReportType(String matchingInstanceAnalysisReportType) {
    this.matchingInstanceAnalysisReportType = matchingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return matchingInstanceAnalysisParameters
  **/

  public String getMatchingInstanceAnalysisParameters() {
    return matchingInstanceAnalysisParameters;
  }

  public void setMatchingInstanceAnalysisParameters(String matchingInstanceAnalysisParameters) {
    this.matchingInstanceAnalysisParameters = matchingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return matchingInstanceAnalysisReport
  **/

  public Object getMatchingInstanceAnalysisReport() {
    return matchingInstanceAnalysisReport;
  }

  public void setMatchingInstanceAnalysisReport(Object matchingInstanceAnalysisReport) {
    this.matchingInstanceAnalysisReport = matchingInstanceAnalysisReport;
  }


}

