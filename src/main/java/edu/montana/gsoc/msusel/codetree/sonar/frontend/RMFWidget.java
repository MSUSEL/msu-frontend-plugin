/**
 * The MIT License (MIT)
 *
 * MSUSEL Front End Sonar Plugin
 * Copyright (c) 2015-2017 Montana State University, Gianforte School of Computing,
 * Software Engineering Laboratory
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package edu.montana.gsoc.msusel.codetree.sonar.frontend;

import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.Description;
import org.sonar.api.web.RubyRailsWidget;
import org.sonar.api.web.UserRole;
import org.sonar.api.web.WidgetProperties;
import org.sonar.api.web.WidgetProperty;
import org.sonar.api.web.WidgetPropertyType;

/**
 * A Ruby on Rails widget for displaying RMF data.
 * 
 * @author Isaac Griffith
 * @version 1.1.1
 */
@UserRole(UserRole.USER)
@Description("MSUSEL RMF Display Widget")
@WidgetProperties({
        @WidgetProperty(key = "gradeAmin", defaultValue = "0.98", type = WidgetPropertyType.FLOAT, description = "Minimum value for a grade of A", optional = false),
        @WidgetProperty(key = "gradeBmin", defaultValue = "0.98", type = WidgetPropertyType.FLOAT, description = "Minimum value for a grade of B", optional = false),
        @WidgetProperty(key = "gradeCmin", defaultValue = "0.98", type = WidgetPropertyType.FLOAT, description = "Minimum value for a grade of C", optional = false),
        @WidgetProperty(key = "gradeDmin", defaultValue = "0.98", type = WidgetPropertyType.FLOAT, description = "Minimum value for a grade of D", optional = false),
        @WidgetProperty(key = "gradeEmin", defaultValue = "0.98", type = WidgetPropertyType.FLOAT, description = "Minimum value for a grade of E", optional = false),
        @WidgetProperty(key = "securityMetric", defaultValue = "sel_rmf_security", type = WidgetPropertyType.METRIC, description = "Metric for security", optional = false),
        @WidgetProperty(key = "accessControlMetric", defaultValue = "sel_rmf_access_ctrl", type = WidgetPropertyType.METRIC, description = "Metric for Access Control", optional = false),
        @WidgetProperty(key = "assessmentAuthenticationMetric", defaultValue = "sel_rmf_assess_auth", type = WidgetPropertyType.METRIC, description = "Metric for Assessment and Authentication", optional = false),
        @WidgetProperty(key = "auditAccountabilityMetric", defaultValue = "sel_rmf_audit_account", type = WidgetPropertyType.METRIC, description = "Metric for Audit and Accountability", optional = false),
        @WidgetProperty(key = "configManagementMetric", defaultValue = "sel_rmf_confg_mgmt", type = WidgetPropertyType.METRIC, description = "Metric for Configuration Management", optional = false),
        @WidgetProperty(key = "identificationAuthenticationMetric", defaultValue = "sel_rmf_id_auth", type = WidgetPropertyType.METRIC, description = "Metric for Identification and Authentication", optional = false),
        @WidgetProperty(key = "maintenanceMetric", defaultValue = "sel_rmf_maint", type = WidgetPropertyType.METRIC, description = "Metric for Maintenance", optional = false),
        @WidgetProperty(key = "riskAnalysisMetric", defaultValue = "sel_rmf_risk_analysis", type = WidgetPropertyType.METRIC, description = "Metric for Risk Analysis", optional = false) })
public class RMFWidget extends AbstractRubyTemplate implements RubyRailsWidget {

    private static final String ID            = "msusel_rmf_widget";
    private static final String TITLE         = "MSUSEL RMF Bullet Chart";
    private static final String TEMPLATE_PATH = "/edu/montana/gsoc/msusel/codetree/sonar/frontend/rmf.html.erb";

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId()
    {
        return ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplatePath()
    {
        return TEMPLATE_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTitle()
    {
        return TITLE;
    }
}
