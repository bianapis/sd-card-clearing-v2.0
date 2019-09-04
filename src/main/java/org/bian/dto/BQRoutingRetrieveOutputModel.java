package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRoutingRetrieveOutputModelCaptureInstanceRecord;
import org.bian.dto.BQRoutingRetrieveOutputModelCardClearingProcedureInstanceRecord;
import org.bian.dto.BQRoutingRetrieveOutputModelRoutingInstanceAnalysis;
import org.bian.dto.BQRoutingRetrieveOutputModelRoutingInstanceRecord;
import org.bian.dto.BQRoutingRetrieveOutputModelRoutingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRoutingRetrieveOutputModel
 */
public class BQRoutingRetrieveOutputModel   {
  private BQRoutingRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord = null;

  private BQRoutingRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord = null;

  private BQRoutingRetrieveOutputModelRoutingInstanceRecord routingInstanceRecord = null;

  private String routingRetrieveActionTaskReference = null;

  private Object routingRetrieveActionTaskRecord = null;

  private String routingRetrieveActionResponse = null;

  private BQRoutingRetrieveOutputModelRoutingInstanceReport routingInstanceReport = null;

  private BQRoutingRetrieveOutputModelRoutingInstanceAnalysis routingInstanceAnalysis = null;


  /**
   * Get cardClearingProcedureInstanceRecord
   * @return cardClearingProcedureInstanceRecord
  **/

  public BQRoutingRetrieveOutputModelCardClearingProcedureInstanceRecord getCardClearingProcedureInstanceRecord() {
    return cardClearingProcedureInstanceRecord;
  }

  public void setCardClearingProcedureInstanceRecord(BQRoutingRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord) {
    this.cardClearingProcedureInstanceRecord = cardClearingProcedureInstanceRecord;
  }


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQRoutingRetrieveOutputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQRoutingRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * Get routingInstanceRecord
   * @return routingInstanceRecord
  **/

  public BQRoutingRetrieveOutputModelRoutingInstanceRecord getRoutingInstanceRecord() {
    return routingInstanceRecord;
  }

  public void setRoutingInstanceRecord(BQRoutingRetrieveOutputModelRoutingInstanceRecord routingInstanceRecord) {
    this.routingInstanceRecord = routingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Routing instance retrieve service call 
   * @return routingRetrieveActionTaskReference
  **/

  public String getRoutingRetrieveActionTaskReference() {
    return routingRetrieveActionTaskReference;
  }

  public void setRoutingRetrieveActionTaskReference(String routingRetrieveActionTaskReference) {
    this.routingRetrieveActionTaskReference = routingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return routingRetrieveActionTaskRecord
  **/

  public Object getRoutingRetrieveActionTaskRecord() {
    return routingRetrieveActionTaskRecord;
  }

  public void setRoutingRetrieveActionTaskRecord(Object routingRetrieveActionTaskRecord) {
    this.routingRetrieveActionTaskRecord = routingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return routingRetrieveActionResponse
  **/

  public String getRoutingRetrieveActionResponse() {
    return routingRetrieveActionResponse;
  }

  public void setRoutingRetrieveActionResponse(String routingRetrieveActionResponse) {
    this.routingRetrieveActionResponse = routingRetrieveActionResponse;
  }


  /**
   * Get routingInstanceReport
   * @return routingInstanceReport
  **/

  public BQRoutingRetrieveOutputModelRoutingInstanceReport getRoutingInstanceReport() {
    return routingInstanceReport;
  }

  public void setRoutingInstanceReport(BQRoutingRetrieveOutputModelRoutingInstanceReport routingInstanceReport) {
    this.routingInstanceReport = routingInstanceReport;
  }


  /**
   * Get routingInstanceAnalysis
   * @return routingInstanceAnalysis
  **/

  public BQRoutingRetrieveOutputModelRoutingInstanceAnalysis getRoutingInstanceAnalysis() {
    return routingInstanceAnalysis;
  }

  public void setRoutingInstanceAnalysis(BQRoutingRetrieveOutputModelRoutingInstanceAnalysis routingInstanceAnalysis) {
    this.routingInstanceAnalysis = routingInstanceAnalysis;
  }


}

