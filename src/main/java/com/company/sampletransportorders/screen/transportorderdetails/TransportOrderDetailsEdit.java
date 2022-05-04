package com.company.sampletransportorders.screen.transportorderdetails;

import io.jmix.ui.Notifications;
import io.jmix.ui.model.InstanceContainer;
import io.jmix.ui.screen.*;
import com.company.sampletransportorders.entity.TransportOrderDetails;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("TransportOrderDetails.edit")
@UiDescriptor("transport-order-details-edit.xml")
@EditedEntityContainer("transportOrderDetailsDc")
public class TransportOrderDetailsEdit extends StandardEditor<TransportOrderDetails> {
    @Autowired
    private Notifications notifications;

    @Subscribe(id = "transportOrderDetailsDc", target = Target.DATA_CONTAINER)
    public void onTransportOrderDetailsDcItemPropertyChange(InstanceContainer.ItemPropertyChangeEvent<TransportOrderDetails> event) {
        if (event.getProperty().equals("tagPlate")) {
            if (!event.getItem().getTagPlate().equals("a")) {
                notifications.create(Notifications.NotificationType.ERROR).withCaption("Please check the tag plate field is incorrect format!").show();
            }
        }
    }
}