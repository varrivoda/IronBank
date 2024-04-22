package com.ironbank.moneyraven.services;

import com.ironbank.moneyraven.ProfileConstants;
import com.ironbank.moneyraven.model.PredskazProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(ProfileConstants.WINTER_IS_HERE)
@RequiredArgsConstructor
public class WhiteListPredskazService implements PredskazService{
    private final PredskazProperties predskazProperties;

    @Override
    public boolean willSurvive(String name) {
        return predskazProperties.getWhoseWhoRepayDebts().contains(name);
    }
}
