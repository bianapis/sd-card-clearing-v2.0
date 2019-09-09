package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXConversionRetrieveOutputModelFXConversionInstanceReport
 */
public class BQFXConversionRetrieveOutputModelFXConversionInstanceReport   {
  private Object fXConversionInstanceReportRecord = null;

  private String fXConversionInstanceReportType = null;

  private String fXConversionInstanceReportParameters = null;

  private Object fXConversionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fXConversionInstanceReportRecord
  **/

  @JsonProperty("fXConversionInstanceReportRecord")
  public Object getFXConversionInstanceReportRecord() {
    return fXConversionInstanceReportRecord;
  }

  public void setFXConversionInstanceReportRecord(Object fXConversionInstanceReportRecord) {
    this.fXConversionInstanceReportRecord = fXConversionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fXConversionInstanceReportType
  **/

  @JsonProperty("fXConversionInstanceReportType")
  public String getFXConversionInstanceReportType() {
    return fXConversionInstanceReportType;
  }

  public void setFXConversionInstanceReportType(String fXConversionInstanceReportType) {
    this.fXConversionInstanceReportType = fXConversionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fXConversionInstanceReportParameters
  **/

  @JsonProperty("fXConversionInstanceReportParameters")
  public String getFXConversionInstanceReportParameters() {
    return fXConversionInstanceReportParameters;
  }

  public void setFXConversionInstanceReportParameters(String fXConversionInstanceReportParameters) {
    this.fXConversionInstanceReportParameters = fXConversionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fXConversionInstanceReport
  **/

  @JsonProperty("fXConversionInstanceReport")
  public Object getFXConversionInstanceReport() {
    return fXConversionInstanceReport;
  }

  public void setFXConversionInstanceReport(Object fXConversionInstanceReport) {
    this.fXConversionInstanceReport = fXConversionInstanceReport;
  }


}

