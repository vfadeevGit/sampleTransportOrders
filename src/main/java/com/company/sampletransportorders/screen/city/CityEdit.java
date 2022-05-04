package com.company.sampletransportorders.screen.city;

import io.jmix.ui.screen.*;
import com.company.sampletransportorders.entity.City;

@UiController("City.edit")
@UiDescriptor("city-edit.xml")
@EditedEntityContainer("cityDc")
public class CityEdit extends StandardEditor<City> {
}