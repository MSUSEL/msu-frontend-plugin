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
package edu.montana.gsoc.msusel.sonar.frontend;

import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.Description;
import org.sonar.api.web.RubyRailsWidget;
import org.sonar.api.web.UserRole;
import org.sonar.api.web.WidgetProperties;
import org.sonar.api.web.WidgetProperty;
import org.sonar.api.web.WidgetPropertyType;

/**
 * A Ruby on Rails widget for diplaying summary data in SonarQube
 * 
 * @author Isaac Griffith
 * @version 1.1.1
 */
@UserRole(UserRole.USER)
@Description("MSUSEL Summary Display")
@WidgetProperties({
        @WidgetProperty(key = "qualityMetric", defaultValue = "sel_summary_quality", type = WidgetPropertyType.METRIC, description = "Metric for quality.", optional = false),
        @WidgetProperty(key = "rmfMetric", defaultValue = "sel_summary_rmf", type = WidgetPropertyType.METRIC, description = "Metric for RMF.", optional = false),
        @WidgetProperty(key = "tdRatioMetric", defaultValue = "sel_summary_tdRatio", type = WidgetPropertyType.METRIC, description = "Metric for TD Ratio.", optional = false),
        @WidgetProperty(key = "tdValueMetric", defaultValue = "sel_summary_tdValue", type = WidgetPropertyType.METRIC, description = "Metric for TD Value.", optional = false),
        @WidgetProperty(key = "locMetric", defaultValue = "sel_summary_loc", type = WidgetPropertyType.METRIC, description = "Metric for LOC.", optional = false),
        @WidgetProperty(key = "effortToAMetric", defaultValue = "sel_summary_effort_a", type = WidgetPropertyType.METRIC, description = "Metric for effort to A.", optional = false),
        @WidgetProperty(key = "effortToBMetric", defaultValue = "sel_summary_effort_b", type = WidgetPropertyType.METRIC, description = "Metric for effort to B.", optional = false),
        @WidgetProperty(key = "effortToCMetric", defaultValue = "sel_summary_effort_c", type = WidgetPropertyType.METRIC, description = "Metric for effort to C.", optional = false),
        @WidgetProperty(key = "effortToDMetric", defaultValue = "sel_summary_effort_d", type = WidgetPropertyType.METRIC, description = "Metric for effort to D.", optional = false),
        @WidgetProperty(key = "effortToEMetric", defaultValue = "sel_summary_effort_d", type = WidgetPropertyType.METRIC, description = "Metric for effort to E.", optional = false) })
public class SummaryWidget extends AbstractRubyTemplate implements RubyRailsWidget {

    private static final String ID            = "msusel_summary_widget";
    private static final String TITLE         = "MSUSEL Summary Display";
    private static final String TEMPLATE_PATH = "/edu/montana/gsoc/msusel/sonar/frontend/summary.html.erb";

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
