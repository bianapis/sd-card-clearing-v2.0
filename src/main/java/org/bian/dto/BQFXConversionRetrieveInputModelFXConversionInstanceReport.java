package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXConversionRetrieveInputModelFXConversionInstanceReport
 */
public class BQFXConversionRetrieveInputModelFXConversionInstanceReport   {
  private String fXConversionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fXConversionInstanceReportReference
  **/

  public String getFXConversionInstanceReportReference() {
    return fXConversionInstanceReportReference;
  }

  public void setFXConversionInstanceReportReference(String fXConversionInstanceReportReference) {
    this.fXConversionInstanceReportReference = fXConversionInstanceReportReference;
  }


}

