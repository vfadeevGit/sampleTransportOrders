package com.company.sampletransportorders.screen.city;

import io.jmix.ui.action.list.EditAction;
import io.jmix.ui.component.Table;
import io.jmix.ui.screen.*;
import com.company.sampletransportorders.entity.City;

import javax.inject.Named;

@UiController("City.browse")
@UiDescriptor("city-browse.xml")
@LookupComponent("citiesTable")
public class CityBrowse extends StandardLookup<City> {
    @Named("citiesTable.edit")
    private EditAction<City> citiesTableEdit;

    @Subscribe("citiesTable")
    public void onCitiesTableSelection(Table.SelectionEvent<City> event) {

    }
}