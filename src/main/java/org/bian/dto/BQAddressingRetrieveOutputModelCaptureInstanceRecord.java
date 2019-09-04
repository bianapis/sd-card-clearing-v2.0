package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAddressingRetrieveOutputModelCaptureInstanceRecord
 */
public class BQAddressingRetrieveOutputModelCaptureInstanceRecord   {
  private String cardTransactionRecordReference = null;

  private String cardTransactionProductInstanceReference = null;

  private String cardTransactionNetworkReference = null;

  private String cardTransactionIssuingBankReference = null;

  private String cardTransactionMerchantAcquiringBankReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the card transaction as recorded by issuer and/or acquirer - these can be batched for some clearing processes 
   * @return cardTransactionRecordReference
  **/

  public String getCardTransactionRecordReference() {
    return cardTransactionRecordReference;
  }

  public void setCardTransactionRecordReference(String cardTransactionRecordReference) {
    this.cardTransactionRecordReference = cardTransactionRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The account number associated with the card transaction 
   * @return cardTransactionProductInstanceReference
  **/

  public String getCardTransactionProductInstanceReference() {
    return cardTransactionProductInstanceReference;
  }

  public void setCardTransactionProductInstanceReference(String cardTransactionProductInstanceReference) {
    this.cardTransactionProductInstanceReference = cardTransactionProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the network the card transaction is handled by 
   * @return cardTransactionNetworkReference
  **/

  public String getCardTransactionNetworkReference() {
    return cardTransactionNetworkReference;
  }

  public void setCardTransactionNetworkReference(String cardTransactionNetworkReference) {
    this.cardTransactionNetworkReference = cardTransactionNetworkReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the card holder's issuing bank 
   * @return cardTransactionIssuingBankReference
  **/

  public String getCardTransactionIssuingBankReference() {
    return cardTransactionIssuingBankReference;
  }

  public void setCardTransactionIssuingBankReference(String cardTransactionIssuingBankReference) {
    this.cardTransactionIssuingBankReference = cardTransactionIssuingBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the merchant's acquiring bank 
   * @return cardTransactionMerchantAcquiringBankReference
  **/

  public String getCardTransactionMerchantAcquiringBankReference() {
    return cardTransactionMerchantAcquiringBankReference;
  }

  public void setCardTransactionMerchantAcquiringBankReference(String cardTransactionMerchantAcquiringBankReference) {
    this.cardTransactionMerchantAcquiringBankReference = cardTransactionMerchantAcquiringBankReference;
  }


}

