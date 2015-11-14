package com.fortmocks.mock.soap.model.project.processor;

import com.fortmocks.core.model.Service;
import com.fortmocks.core.model.Result;
import com.fortmocks.core.model.Task;
import com.fortmocks.mock.soap.model.project.domain.SoapOperation;
import com.fortmocks.mock.soap.model.project.processor.message.input.UpdateSoapOperationsStatusInput;
import com.fortmocks.mock.soap.model.project.processor.message.output.UpdateSoapOperationsStatusOutput;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
@org.springframework.stereotype.Service
public class UpdateSoapOperationsStatusService extends AbstractSoapProjectProcessor implements Service<UpdateSoapOperationsStatusInput, UpdateSoapOperationsStatusOutput> {

    /**
     * The process message is responsible for processing an incoming task and generate
     * a response based on the incoming task input
     * @param task The task that will be processed by the processor
     * @return A result based on the processed incoming task
     * @see Task
     * @see Result
     */
    @Override
    public Result<UpdateSoapOperationsStatusOutput> process(final Task<UpdateSoapOperationsStatusInput> task) {
        final UpdateSoapOperationsStatusInput input = task.getInput();
        final SoapOperation soapOperation = findSoapOperationType(input.getSoapProjectId(), input.getSoapPortId(), input.getSoapOperationId());
        soapOperation.setSoapOperationStatus(input.getSoapOperationStatus());
        save(input.getSoapProjectId());
        return createResult(new UpdateSoapOperationsStatusOutput());
    }
}