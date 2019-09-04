package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAddressingRetrieveOutputModelAddressingInstanceAnalysis
 */
public class BQAddressingRetrieveOutputModelAddressingInstanceAnalysis   {
  private Object addressingInstanceAnalysisRecord = null;

  private String addressingInstanceAnalysisReportType = null;

  private String addressingInstanceAnalysisParameters = null;

  private Object addressingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return addressingInstanceAnalysisRecord
  **/

  public Object getAddressingInstanceAnalysisRecord() {
    return addressingInstanceAnalysisRecord;
  }

  public void setAddressingInstanceAnalysisRecord(Object addressingInstanceAnalysisRecord) {
    this.addressingInstanceAnalysisRecord = addressingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return addressingInstanceAnalysisReportType
  **/

  public String getAddressingInstanceAnalysisReportType() {
    return addressingInstanceAnalysisReportType;
  }

  public void setAddressingInstanceAnalysisReportType(String addressingInstanceAnalysisReportType) {
    this.addressingInstanceAnalysisReportType = addressingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return addressingInstanceAnalysisParameters
  **/

  public String getAddressingInstanceAnalysisParameters() {
    return addressingInstanceAnalysisParameters;
  }

  public void setAddressingInstanceAnalysisParameters(String addressingInstanceAnalysisParameters) {
    this.addressingInstanceAnalysisParameters = addressingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return addressingInstanceAnalysisReport
  **/

  public Object getAddressingInstanceAnalysisReport() {
    return addressingInstanceAnalysisReport;
  }

  public void setAddressingInstanceAnalysisReport(Object addressingInstanceAnalysisReport) {
    this.addressingInstanceAnalysisReport = addressingInstanceAnalysisReport;
  }


}

