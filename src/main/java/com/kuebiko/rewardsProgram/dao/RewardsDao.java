package com.kuebiko.rewardsProgram.dao;

import org.springframework.stereotype.Component;

@Component
public class RewardsDao implements RewardsDaoIf{
    public int computePoints(int purchaseAmount) {

        int points = 0;

        if (purchaseAmount > 50){
            points = 1 * 50;
        }
        if (purchaseAmount > 100) {
            points = 2 * (purchaseAmount - 100) + (1 * 100-50);
        }
        return points;
    }


}
