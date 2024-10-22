package com.company.model;

public enum ClothingSize {
    S("Small"), M("Medium"), L("Large");

    private String Description;
    ClothingSize(String description) {
        this.Description = description;
    }

    @Override
    public String toString() {
        return Description;
    }
}
