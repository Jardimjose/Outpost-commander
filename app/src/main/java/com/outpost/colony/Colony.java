package com.outpost.colony;

import java.util.EnumMap;

public class Colony {
    private int day = 1; // day always starts from 1
    private final EnumMap<ResourceType, Resource> resources = new EnumMap<>(ResourceType.class);

    public Colony() {
        resources.put(ResourceType.OXYGEN, new Resource(ResourceType.OXYGEN, 100));
        resources.put(ResourceType.FOOD, new Resource(ResourceType.FOOD, 80));
        resources.put(ResourceType.POWER, new Resource(ResourceType.POWER, 120));
    }

}
