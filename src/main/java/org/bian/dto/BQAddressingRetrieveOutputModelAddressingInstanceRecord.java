package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAddressingRetrieveOutputModelAddressingInstanceRecord
 */
public class BQAddressingRetrieveOutputModelAddressingInstanceRecord   {
  private String addressingTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the transaction addressing  
   * @return addressingTaskResult
  **/

  public String getAddressingTaskResult() {
    return addressingTaskResult;
  }

  public void setAddressingTaskResult(String addressingTaskResult) {
    this.addressingTaskResult = addressingTaskResult;
  }


}

