package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFeesUpdateInputModelFeesInstanceRecord
 */
public class BQFeesUpdateInputModelFeesInstanceRecord   {
  private String interchargeFees = null;

  private String feeTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines intercharge rates and fees to be applied to card transactions 
   * @return interchargeFees
  **/

  public String getInterchargeFees() {
    return interchargeFees;
  }

  public void setInterchargeFees(String interchargeFees) {
    this.interchargeFees = interchargeFees;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the transaction fee processing 
   * @return feeTaskResult
  **/

  public String getFeeTaskResult() {
    return feeTaskResult;
  }

  public void setFeeTaskResult(String feeTaskResult) {
    this.feeTaskResult = feeTaskResult;
  }


}

