/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CardClearingApiController {

	@Autowired
	CardClearingApiService service;
	
	@Process.Activate
	public BianResponse<SDCardClearingActivateOutputModel> activate(@RequestBody BianRequest<SDCardClearingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDCardClearingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardClearingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDCardClearingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardClearingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRCardClearingProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCardClearingProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CRCardClearingProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("addressing")
	@Process.Retrieve
	public BianResponse<BQAddressingRetrieveOutputModel> retrieveAddressing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAddressing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("capture")
	@Process.Retrieve
	public BianResponse<BQCaptureRetrieveOutputModel> retrieveCapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCapture(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("fxconversion")
	@Process.Retrieve
	public BianResponse<BQFXConversionRetrieveOutputModel> retrieveFxconversion(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFxconversion(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("fees")
	@Process.Retrieve
	public BianResponse<BQFeesRetrieveOutputModel> retrieveFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFees(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("matching")
	@Process.Retrieve
	public BianResponse<BQMatchingRetrieveOutputModel> retrieveMatching(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMatching(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("reconciliation")
	@Process.Retrieve
	public BianResponse<BQReconciliationRetrieveOutputModel> retrieveReconciliation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReconciliation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("routing")
	@Process.Retrieve
	public BianResponse<BQRoutingRetrieveOutputModel> retrieveRouting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRouting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDCardClearingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRCardClearingProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCardClearingProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("capture")
	@Process.Update
	public BianResponse<BQCaptureUpdateOutputModel> updateCapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCaptureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCapture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fees")
	@Process.Update
	public BianResponse<BQFeesUpdateOutputModel> updateFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFeesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
