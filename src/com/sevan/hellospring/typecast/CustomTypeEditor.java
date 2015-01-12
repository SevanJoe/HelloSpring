package com.sevan.hellospring.typecast;

import java.beans.PropertyEditorSupport;

public class CustomTypeEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new CustomType(text.toUpperCase()));
    }

}
