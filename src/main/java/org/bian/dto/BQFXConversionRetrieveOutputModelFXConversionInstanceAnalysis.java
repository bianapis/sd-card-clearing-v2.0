package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXConversionRetrieveOutputModelFXConversionInstanceAnalysis
 */
public class BQFXConversionRetrieveOutputModelFXConversionInstanceAnalysis   {
  private Object fXConversionInstanceAnalysisRecord = null;

  private String fXConversionInstanceAnalysisReportType = null;

  private String fXConversionInstanceAnalysisParameters = null;

  private Object fXConversionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fXConversionInstanceAnalysisRecord
  **/

  @JsonProperty("fXConversionInstanceAnalysisRecord")
  public Object getFXConversionInstanceAnalysisRecord() {
    return fXConversionInstanceAnalysisRecord;
  }

  public void setFXConversionInstanceAnalysisRecord(Object fXConversionInstanceAnalysisRecord) {
    this.fXConversionInstanceAnalysisRecord = fXConversionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fXConversionInstanceAnalysisReportType
  **/

  @JsonProperty("fXConversionInstanceAnalysisReportType")
  public String getFXConversionInstanceAnalysisReportType() {
    return fXConversionInstanceAnalysisReportType;
  }

  public void setFXConversionInstanceAnalysisReportType(String fXConversionInstanceAnalysisReportType) {
    this.fXConversionInstanceAnalysisReportType = fXConversionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fXConversionInstanceAnalysisParameters
  **/

  @JsonProperty("fXConversionInstanceAnalysisParameters")
  public String getFXConversionInstanceAnalysisParameters() {
    return fXConversionInstanceAnalysisParameters;
  }

  public void setFXConversionInstanceAnalysisParameters(String fXConversionInstanceAnalysisParameters) {
    this.fXConversionInstanceAnalysisParameters = fXConversionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fXConversionInstanceAnalysisReport
  **/

  @JsonProperty("fXConversionInstanceAnalysisReport")
  public Object getFXConversionInstanceAnalysisReport() {
    return fXConversionInstanceAnalysisReport;
  }

  public void setFXConversionInstanceAnalysisReport(Object fXConversionInstanceAnalysisReport) {
    this.fXConversionInstanceAnalysisReport = fXConversionInstanceAnalysisReport;
  }


}

