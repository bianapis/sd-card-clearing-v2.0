package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMatchingRetrieveOutputModelMatchingInstanceRecord
 */
public class BQMatchingRetrieveOutputModelMatchingInstanceRecord   {
  private String matchingTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the transaction matching processing 
   * @return matchingTaskResult
  **/

  public String getMatchingTaskResult() {
    return matchingTaskResult;
  }

  public void setMatchingTaskResult(String matchingTaskResult) {
    this.matchingTaskResult = matchingTaskResult;
  }


}

