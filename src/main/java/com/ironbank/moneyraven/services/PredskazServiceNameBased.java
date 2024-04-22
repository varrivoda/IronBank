package com.ironbank.moneyraven.services;

import com.ironbank.moneyraven.ProfileConstants;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@Profile(ProfileConstants.NO_WINTER)
public class PredskazServiceNameBased implements PredskazService {
    @Override
    public boolean willSurvive(String name) {
        return !name.contains("Stark") && ThreadLocalRandom.current().nextBoolean();
    }
}
