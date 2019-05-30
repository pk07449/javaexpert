package com.pnakaj.pattern.gof.behavior.strategy;

/**
 * Created by pankaj on 8/12/2017.
 */
public class FileOrgIdStrategy implements OrgIdStrategy {
    @Override
    public int getOrgId(String resourceId) {
        return 0;
    }
}
