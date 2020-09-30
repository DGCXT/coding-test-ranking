package com.idealista.infrastructure.api.ad.score.service.scorers.impl;

import com.idealista.infrastructure.api.ad.score.configuration.AdCompleteScoreConfiguration;
import com.idealista.infrastructure.api.ad.search.domain.Ad;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

@Component
public class ChaletAdCompleteAdScorer extends AdCompleteAdScorer {

    public ChaletAdCompleteAdScorer(AdCompleteScoreConfiguration adCompleteScoreConfiguration){
        super(adCompleteScoreConfiguration);
    }

    @Override
    protected boolean isAdCategoryComplete(Ad ad) {
        if (ad.isNotChalet()){
            return false;
        }
        return !isNull(ad.getGardenSize());
    }
}
