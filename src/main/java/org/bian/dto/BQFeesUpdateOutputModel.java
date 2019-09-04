package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFeesUpdateInputModelFeesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFeesUpdateOutputModel
 */
public class BQFeesUpdateOutputModel   {
  private BQFeesUpdateInputModelFeesInstanceRecord feesInstanceRecord = null;

  private String feesUpdateActionTaskReference = null;

  private Object feesUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get feesInstanceRecord
   * @return feesInstanceRecord
  **/

  public BQFeesUpdateInputModelFeesInstanceRecord getFeesInstanceRecord() {
    return feesInstanceRecord;
  }

  public void setFeesInstanceRecord(BQFeesUpdateInputModelFeesInstanceRecord feesInstanceRecord) {
    this.feesInstanceRecord = feesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return feesUpdateActionTaskReference
  **/

  public String getFeesUpdateActionTaskReference() {
    return feesUpdateActionTaskReference;
  }

  public void setFeesUpdateActionTaskReference(String feesUpdateActionTaskReference) {
    this.feesUpdateActionTaskReference = feesUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return feesUpdateActionTaskRecord
  **/

  public Object getFeesUpdateActionTaskRecord() {
    return feesUpdateActionTaskRecord;
  }

  public void setFeesUpdateActionTaskRecord(Object feesUpdateActionTaskRecord) {
    this.feesUpdateActionTaskRecord = feesUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

