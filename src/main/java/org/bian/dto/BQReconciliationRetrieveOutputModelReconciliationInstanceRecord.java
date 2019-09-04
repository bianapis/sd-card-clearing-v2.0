package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReconciliationRetrieveOutputModelReconciliationInstanceRecord
 */
public class BQReconciliationRetrieveOutputModelReconciliationInstanceRecord   {
  private String reconciliationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the transaction matching processing 
   * @return reconciliationTaskResult
  **/

  public String getReconciliationTaskResult() {
    return reconciliationTaskResult;
  }

  public void setReconciliationTaskResult(String reconciliationTaskResult) {
    this.reconciliationTaskResult = reconciliationTaskResult;
  }


}

