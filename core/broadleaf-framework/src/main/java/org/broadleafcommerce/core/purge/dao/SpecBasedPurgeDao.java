/*
 * #%L
 * BroadleafCommerce Framework
 * %%
 * Copyright (C) 2009 - 2020 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */

package org.broadleafcommerce.core.purge.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.broadleafcommerce.core.purge.PurgeSpecification;

/**
 * Interface for the SpecBasedPurgeDao
 * @author dcolgrove
 *
 */
public interface SpecBasedPurgeDao {

    void cascadeDeleteList(PurgeSpecification purgeSpec, String fkColumnName, List<Long> parentDeleteList);

    /**
     * TODO: required for tests
     */
    void setEm(EntityManager em);

}