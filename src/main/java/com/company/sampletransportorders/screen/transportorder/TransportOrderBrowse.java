package com.company.sampletransportorders.screen.transportorder;

import com.company.sampletransportorders.entity.User;
import io.jmix.core.DataManager;
import io.jmix.ui.component.Button;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.*;
import com.company.sampletransportorders.entity.TransportOrder;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UiController("TransportOrder.browse")
@UiDescriptor("transport-order-browse.xml")
@LookupComponent("transportOrdersTable")
public class TransportOrderBrowse extends StandardLookup<TransportOrder> {
    @Autowired
    private DataManager dataManager;
    @Autowired
    private CollectionLoader<TransportOrder> transportOrdersDl;

    @Subscribe("generateOrders")
    public void onGenerateOrdersClick(Button.ClickEvent event) {

        /*List<User> myEntityList = dataManager.load(User.class)
                .query("select u from User u where u.firstName like :firstName1")
                .parameter("firstName1", paramValue)
                .list();
        for (:
             ) {
            
        }

        TransportOrder transportOrder = dataManager.create(TransportOrder.class);
        transportOrder.setCity();
        transportOrder.setConsumer();
        dataManager.save(transportOrder);
        
        transportOrdersDl.load();
        */
    }
}