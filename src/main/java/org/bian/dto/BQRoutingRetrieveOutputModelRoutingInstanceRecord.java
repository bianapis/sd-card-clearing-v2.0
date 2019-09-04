package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRoutingRetrieveOutputModelRoutingInstanceRecord
 */
public class BQRoutingRetrieveOutputModelRoutingInstanceRecord   {
  private String routingTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the transaction routing processing 
   * @return routingTaskResult
  **/

  public String getRoutingTaskResult() {
    return routingTaskResult;
  }

  public void setRoutingTaskResult(String routingTaskResult) {
    this.routingTaskResult = routingTaskResult;
  }


}

