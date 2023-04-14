package com.mycart.estore.core.commands;

import com.mycart.estore.core.model.PaymentDetails;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class ProcessPaymentCommand {

    @TargetAggregateIdentifier
    private final String paymentId;
    private final String orderId;
    private final PaymentDetails paymentDetails;

}
