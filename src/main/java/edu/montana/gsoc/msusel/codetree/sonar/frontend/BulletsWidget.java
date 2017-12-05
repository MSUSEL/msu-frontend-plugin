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
import org.sonar.api.web.WidgetCategory;

/**
 * A Ruby on Rails widge providing a bullet chart widget for the MSUSEL
 * Sonar-Quamoco-Plugin
 * 
 * @author Isaac Griffith
 * @version 1.1.1
 */
@UserRole(UserRole.USER)
@Description("MSUSEL Quamoco Quality Bullet Chart Widget")
@WidgetCategory("Visual")
// @WidgetProperties({
// @WidgetProperty(key = "gradeAmin", defaultValue = "0.98", type =
// WidgetPropertyType.FLOAT, description = "Minimum value for a grade of A",
// optional = false),
// @WidgetProperty(key = "gradeBmin", defaultValue = "0.98", type =
// WidgetPropertyType.FLOAT, description = "Minimum value for a grade of B",
// optional = false),
// @WidgetProperty(key = "gradeCmin", defaultValue = "0.98", type =
// WidgetPropertyType.FLOAT, description = "Minimum value for a grade of C",
// optional = false),
// @WidgetProperty(key = "gradeDmin", defaultValue = "0.98", type =
// WidgetPropertyType.FLOAT, description = "Minimum value for a grade of D",
// optional = false),
// @WidgetProperty(key = "gradeEmin", defaultValue = "0.98", type =
// WidgetPropertyType.FLOAT, description = "Minimum value for a grade of E",
// optional = false),
// @WidgetProperty(key = "qualityMetric", defaultValue = "sc_quamoco_quality",
// type = WidgetPropertyType.METRIC, description = "Metric for quality",
// optional = false),
// @WidgetProperty(key = "functionalSuitabilityMetric", defaultValue =
// "sc_quamoco_func_suit", type = WidgetPropertyType.METRIC, description =
// "Metric for Functional Suitability", optional = false),
// @WidgetProperty(key = "reliabilityMetric", defaultValue =
// "sc_quamoco_reliability", type = WidgetPropertyType.METRIC, description =
// "Metric for Reliability", optional = false),
// @WidgetProperty(key = "performanceEfficiencyMetric", defaultValue =
// "sc_quamoco_perf_eff", type = WidgetPropertyType.METRIC, description =
// "Metric for Performance Efficiency", optional = false),
// @WidgetProperty(key = "maintainabilityMetric", defaultValue =
// "sc_quamoco_maintainability", type = WidgetPropertyType.METRIC, description =
// "Metric for Maintainability", optional = false),
// @WidgetProperty(key = "securityMetric", defaultValue = "sc_quamoco_security",
// type = WidgetPropertyType.METRIC, description = "Metric for Security",
// optional = false),
// @WidgetProperty(key = "compatibilityMetric", defaultValue =
// "sc_quamoco_compatibility", type = WidgetPropertyType.METRIC, description =
// "Metric for Compatibility", optional = false),
// @WidgetProperty(key = "usabilityMetric", defaultValue =
// "sc_quamoco_usability", type = WidgetPropertyType.METRIC, description =
// "Metric for Usability", optional = false),
// @WidgetProperty(key = "portabilityMetric", defaultValue =
// "sc_quamoco_portability", type = WidgetPropertyType.METRIC, description =
// "Metric for Portability", optional = false) })
public class BulletsWidget extends AbstractRubyTemplate implements RubyRailsWidget {

    private static final String ID            = "bullets_widget";
    private static final String TITLE         = "Sonar Bullet Chart";
    private static final String TEMPLATE_PATH = "/edu/montana/gsoc/msusel/codetree/sonar/frontend/bullets.html.erb";

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
