package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAddressingRetrieveOutputModelAddressingInstanceReport
 */
public class BQAddressingRetrieveOutputModelAddressingInstanceReport   {
  private Object addressingInstanceReportRecord = null;

  private String addressingInstanceReportType = null;

  private String addressingInstanceReportParameters = null;

  private Object addressingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return addressingInstanceReportRecord
  **/

  public Object getAddressingInstanceReportRecord() {
    return addressingInstanceReportRecord;
  }

  public void setAddressingInstanceReportRecord(Object addressingInstanceReportRecord) {
    this.addressingInstanceReportRecord = addressingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return addressingInstanceReportType
  **/

  public String getAddressingInstanceReportType() {
    return addressingInstanceReportType;
  }

  public void setAddressingInstanceReportType(String addressingInstanceReportType) {
    this.addressingInstanceReportType = addressingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return addressingInstanceReportParameters
  **/

  public String getAddressingInstanceReportParameters() {
    return addressingInstanceReportParameters;
  }

  public void setAddressingInstanceReportParameters(String addressingInstanceReportParameters) {
    this.addressingInstanceReportParameters = addressingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return addressingInstanceReport
  **/

  public Object getAddressingInstanceReport() {
    return addressingInstanceReport;
  }

  public void setAddressingInstanceReport(Object addressingInstanceReport) {
    this.addressingInstanceReport = addressingInstanceReport;
  }


}

