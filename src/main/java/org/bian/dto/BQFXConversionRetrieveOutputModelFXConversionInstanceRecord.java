package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXConversionRetrieveOutputModelFXConversionInstanceRecord
 */
public class BQFXConversionRetrieveOutputModelFXConversionInstanceRecord   {
  private String fXConversionRatesandFees = null;

  private String fXConversionTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The FX rates and fees that are applied to the transactions 
   * @return fXConversionRatesandFees
  **/

  @JsonProperty("fXConversionRatesandFees")
  public String getFXConversionRatesandFees() {
    return fXConversionRatesandFees;
  }

  public void setFXConversionRatesandFees(String fXConversionRatesandFees) {
    this.fXConversionRatesandFees = fXConversionRatesandFees;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the transaction FX conversion  
   * @return fXConversionTaskResult
  **/

  @JsonProperty("fXConversionTaskResult")
  public String getFXConversionTaskResult() {
    return fXConversionTaskResult;
  }

  public void setFXConversionTaskResult(String fXConversionTaskResult) {
    this.fXConversionTaskResult = fXConversionTaskResult;
  }


}

