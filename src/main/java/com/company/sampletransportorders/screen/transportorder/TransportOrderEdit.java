package com.company.sampletransportorders.screen.transportorder;

import io.jmix.ui.screen.*;
import com.company.sampletransportorders.entity.TransportOrder;

@UiController("TransportOrder.edit")
@UiDescriptor("transport-order-edit.xml")
@EditedEntityContainer("transportOrderDc")
public class TransportOrderEdit extends StandardEditor<TransportOrder> {
}