package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardClearingProcedureInitiateOutputModelCardClearingProcedureInstanceRecord
 */
public class CRCardClearingProcedureInitiateOutputModelCardClearingProcedureInstanceRecord   {
  private String networkReference = null;

  private String participantAcquirerBankClearingandSettlementTerms = null;

  private String participantIssuerBankClearingandSettlementTerms = null;

  private String cardClearingProcessDateTime = null;

  private String cardClearingServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the card network 
   * @return networkReference
  **/

  public String getNetworkReference() {
    return networkReference;
  }

  public void setNetworkReference(String networkReference) {
    this.networkReference = networkReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines card clearing fees/terms in force - referenced by Network  
   * @return participantAcquirerBankClearingandSettlementTerms
  **/

  public String getParticipantAcquirerBankClearingandSettlementTerms() {
    return participantAcquirerBankClearingandSettlementTerms;
  }

  public void setParticipantAcquirerBankClearingandSettlementTerms(String participantAcquirerBankClearingandSettlementTerms) {
    this.participantAcquirerBankClearingandSettlementTerms = participantAcquirerBankClearingandSettlementTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines card clearing fees/terms in force - referenced by Network 
   * @return participantIssuerBankClearingandSettlementTerms
  **/

  public String getParticipantIssuerBankClearingandSettlementTerms() {
    return participantIssuerBankClearingandSettlementTerms;
  }

  public void setParticipantIssuerBankClearingandSettlementTerms(String participantIssuerBankClearingandSettlementTerms) {
    this.participantIssuerBankClearingandSettlementTerms = participantIssuerBankClearingandSettlementTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The scheduled time for the process - likely initiation time 
   * @return cardClearingProcessDateTime
  **/

  public String getCardClearingProcessDateTime() {
    return cardClearingProcessDateTime;
  }

  public void setCardClearingProcessDateTime(String cardClearingProcessDateTime) {
    this.cardClearingProcessDateTime = cardClearingProcessDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule of activities for card clearing 
   * @return cardClearingServiceSchedule
  **/

  public String getCardClearingServiceSchedule() {
    return cardClearingServiceSchedule;
  }

  public void setCardClearingServiceSchedule(String cardClearingServiceSchedule) {
    this.cardClearingServiceSchedule = cardClearingServiceSchedule;
  }


}

