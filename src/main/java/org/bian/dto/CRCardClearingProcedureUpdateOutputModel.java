package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardClearingProcedureUpdateInputModelCardClearingProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardClearingProcedureUpdateOutputModel
 */
public class CRCardClearingProcedureUpdateOutputModel   {
  private CRCardClearingProcedureUpdateInputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord = null;

  private String cardClearingProcedureUpdateActionTaskReference = null;

  private Object cardClearingProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cardClearingProcedureInstanceRecord
   * @return cardClearingProcedureInstanceRecord
  **/

  public CRCardClearingProcedureUpdateInputModelCardClearingProcedureInstanceRecord getCardClearingProcedureInstanceRecord() {
    return cardClearingProcedureInstanceRecord;
  }

  public void setCardClearingProcedureInstanceRecord(CRCardClearingProcedureUpdateInputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord) {
    this.cardClearingProcedureInstanceRecord = cardClearingProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return cardClearingProcedureUpdateActionTaskReference
  **/

  public String getCardClearingProcedureUpdateActionTaskReference() {
    return cardClearingProcedureUpdateActionTaskReference;
  }

  public void setCardClearingProcedureUpdateActionTaskReference(String cardClearingProcedureUpdateActionTaskReference) {
    this.cardClearingProcedureUpdateActionTaskReference = cardClearingProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cardClearingProcedureUpdateActionTaskRecord
  **/

  public Object getCardClearingProcedureUpdateActionTaskRecord() {
    return cardClearingProcedureUpdateActionTaskRecord;
  }

  public void setCardClearingProcedureUpdateActionTaskRecord(Object cardClearingProcedureUpdateActionTaskRecord) {
    this.cardClearingProcedureUpdateActionTaskRecord = cardClearingProcedureUpdateActionTaskRecord;
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

