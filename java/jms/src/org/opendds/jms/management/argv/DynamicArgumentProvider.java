/*
 * $
 */

package org.opendds.jms.management.argv;

import java.util.List;

import org.opendds.jms.management.DynamicMBeanSupport;

/**
 * @author  Steven Stallion
 * @version $Revision$
 */
public interface DynamicArgumentProvider {

    void setInstance(DynamicMBeanSupport instance);

    void registerAttributes();

    void addArgs(List<String> args) throws Exception;
}
